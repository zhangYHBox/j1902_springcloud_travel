package com.qf.j1902.controller;

import com.qf.j1902.pojo.*;
import com.qf.j1902.service.RemoteService;
import com.qf.j1902.utils.JsonUtils;
import com.qf.j1902.vo.HotelNum;
import com.qf.j1902.vo.Myorder;
import org.apache.poi.hssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.*;

/**
 * Created by Administrator on 2019/7/18.
 */
@Controller
public class DispensaryController {
    private static Logger logger = LoggerFactory.getLogger(DispensaryController.class);

    @Autowired
    private RemoteService remoteService;

    Page p=new Page();

    //返回index页
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("header.html")
    public String header(){

        return "header.html";
    }

    @RequestMapping("header1.html")
    public String header1(){

        return "header1.html";
    }

    @RequestMapping("footer.html")
    public String footer(){
        return "footer.html";
    }

    //跳转我的订单，判断是否登录
    @RequestMapping("myorder")
    public String gomyorder(Model model){
       /* List<Tavernuser> list = remoteService.getAllandPrice();
        List<Myorder> userlist=new ArrayList<>();

        for (Tavernuser user:list) {
            Myorder myorder=new Myorder();
            int i = (int) (user.getDeparture_date().getTime() - user.getStay_date().getTime()) / (1000 * 3600 * 24);
            myorder.setNumbers(i);
            myorder.setUid(user.getUid());
            myorder.setPrice(user.getTavern().getTprice());
            myorder.setRoom(user.getTavern().getRoom());
            userlist.add(myorder);
        }
        //System.out.println("展示的值："+userlist);
        model.addAttribute("userlist",userlist);*/

        return "myorder";

    }
    //获取我的订单的数据
    @RequestMapping("/getAll")
    @ResponseBody
    public List<Myorder> getAll(){
        //目前查询的是全表的订单，不太准确，应该查的是某一个用户下的订单

        List<Tavernuser> list = remoteService.getAllandPrice();
        List<Myorder> userlist=new ArrayList<>();


        for (Tavernuser user:list) {
            Myorder myorder=new Myorder();
            int i = (int) (user.getDeparture_date().getTime() - user.getStay_date().getTime()) / (1000 * 3600 * 24);
            myorder.setNumbers(i);
            myorder.setUid(user.getUid());
            myorder.setPrice(user.getTavern().getTprice());
            myorder.setRoom(user.getTavern().getRoom());
            myorder.setImg(user.getTavern().getImg());
            userlist.add(myorder);
        }
         System.out.println("展示的值："+userlist);

        return userlist;
    }

    //删除一个订单
    @RequestMapping("/deleteShop")
    @ResponseBody
    public Integer deleteShop(@RequestParam("cid") Integer cid){
        //System.out.println("cid：："+cid);
        Integer i = remoteService.deleteUserByid(cid);
        return i;
    }


    //跳转酒店页面
    @RequestMapping("tavern")
    public String tavern(){

        return "tavern";
    }

    //先去所有的酒店页面，再选择去某个酒店
    @RequestMapping("gotavern")
    public String roter(Model model){



        //return "tavern";
        return "gallery";
    }

    @RequestMapping("single.html")
    public String single(){
        return "single";
    }

    @RequestMapping("about")
    public String about(){
        return "about";
    }

    //前往酒店模块
    @RequestMapping("gogallery")
    public String gogallery(){



        return "gallery";
    }
    //在线
    @RequestMapping("zaixian")
    public String zaixian(){
        return "socketChart";
    }

    //预定酒店房间的业务
    @RequestMapping("/subscribe")
    public String gosubscribe(@RequestParam("uname") String uname,
                              @RequestParam("email") String email,
                              @RequestParam("stay_date") String stay_date,
                              @RequestParam("departure_date") String departure_date,
                              @RequestParam("room") String room,
                              @RequestParam("numbers") String numbers){
       /* System.out.println("uname:"+uname);
        System.out.println("email:"+email);
        System.out.println("stay_date:"+stay_date);
        System.out.println("departure_date:"+departure_date);
        System.out.println("room:"+room);
        System.out.println("numbers:"+numbers);*/
       logger.info("room: "+room);

       // System.out.println("room: "+room); //传的是room对应的id值

         Integer integer = remoteService.addTavernuser(uname, email, stay_date, departure_date, room, numbers);

        return "subscribe";
    }


    //POI
    @GetMapping(value = "excel/getuser")
    @ResponseBody
    public String getUser(HttpServletResponse response) throws Exception {
        //创建Excel工作簿对象
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建Excel工作表对象
        HSSFSheet sheet = workbook.createSheet("统计表");
        createTitle(workbook,sheet);

        //查出购物列表的数据
        List<Tavernuser> list = remoteService.getAllandPrice();
        List<Myorder> userlist=new ArrayList<>();

        for (Tavernuser user:list) {
            Myorder myorder=new Myorder();
            int i = (int) (user.getDeparture_date().getTime() - user.getStay_date().getTime()) / (1000 * 3600 * 24);
            myorder.setNumbers(i);
            myorder.setUid(user.getUid());
            myorder.setPrice(user.getTavern().getTprice());
            myorder.setRoom(user.getTavern().getRoom());
            userlist.add(myorder);
        }

        HSSFCellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy h:mm"));
        int rowNum=1;
        for(Myorder user:userlist){
            HSSFRow row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(user.getUid());
            row.createCell(1).setCellValue(user.getRoom());
            row.createCell(2).setCellValue(user.getNumbers());
            row.createCell(3).setCellValue(user.getPrice());
            HSSFCell cell = row.createCell(4);  // 创建行的单元格
           /* cell.setCellValue(user.getCreatetime());*/
            cell.setCellStyle(cellStyle);
            rowNum++;
        }
        String fileName = "导出excel例子.xls";
        //生成excel文件
        buildExcelFile(fileName, workbook);
        //浏览器下载excel
        buildExcelDocument(fileName,workbook,response);
        return "download excel";
    }
    //创建表头
    private void createTitle(HSSFWorkbook workbook,HSSFSheet sheet) {
        //创建Excel工作表的行
        HSSFRow row = sheet.createRow(0);
        //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
        sheet.setColumnWidth(1, 12 * 256);
        sheet.setColumnWidth(3, 17 * 256);
        //设置为居中加粗
        HSSFCellStyle style = workbook.createCellStyle();
        //设置字体和内容位置
        HSSFFont font = workbook.createFont();
        font.setFontHeightInPoints((short) 16);//字号
        font.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);//加粗
        font.setItalic(true);//设置文字为斜体
        style.setFont(font);
        HSSFCell cell;//创建单元格
        cell = row.createCell(0);
        cell.setCellValue("ID");
        cell.setCellStyle(style);
        cell = row.createCell(1);
        cell.setCellValue("房间类型");
        cell.setCellStyle(style);
        cell = row.createCell(2);
        cell.setCellValue("入住天数");
        cell.setCellStyle(style);
        cell = row.createCell(3);
        cell.setCellValue("一晚单价");
        cell.setCellStyle(style);
       /* cell = row.createCell(4);
        cell.setCellValue("创建时间");
        cell.setCellStyle(style);*/
    }
    //生成excel文件
    protected void buildExcelFile(String filename,HSSFWorkbook workbook) throws Exception{
        FileOutputStream fos = new FileOutputStream(filename);
        workbook.write(fos);
        fos.flush();
        fos.close();
    }
    //浏览器下载excel
    protected void buildExcelDocument(String filename,HSSFWorkbook workbook,HttpServletResponse response) throws Exception{
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode(filename, "utf-8"));
        OutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
    }

    //前往酒店信息列表页
    /*@RequestMapping("route_list")
    @ResponseBody
    public ModelAndView routelist(){
        ModelAndView mv = new ModelAndView();
        List<Hotel> hotels = remoteService.findHotels();
        mv.setViewName("route_list");
        mv.addObject("hotels",hotels);
        return mv;
    }*/

    @RequestMapping("/route_list")
    public String routelists(@RequestParam(value = "page",defaultValue = "1") Integer page,
                             Model model) throws IOException {

        List<Hotel> hotels = remoteService.findHotels();
        int size = hotels.size();
        System.out.println("行数："+size);
        try {
           p.setTotalRows(size);
           p.setCurrentPage(page);
            List<Hotel> hotelList = remoteService.findAllHotelsByPage((page - 1) * p.getPageSize(), p.getPageSize());
            //System.out.println(hotelList+"pppppppppppppp");
            model.addAttribute("hotels",hotelList);
            return "route_list";

        }catch (Exception e){
            System.out.println("出错了：");
            return "route_list";
        }
    }


    //前往详情页
    @RequestMapping("/route_detail")
    public String routedetail(@RequestParam("hid") String hid,
                              Model model,HttpSession session){
        //System.out.println("hid:"+hid);
        //暂时用假数据，评价和用户账户都需从前面获得
       // model.addAttribute("pinglun","henhao");
        session.setAttribute("uname","wanglu");

        List<City> cityByhid = remoteService.findCityByhid(hid);

        City city1 = cityByhid.get(1);
        logger.info("==================="+city1.getCname());
        model.addAttribute("city1",city1.getCname());


        Hotel hotelById = remoteService.findHotelById(hid);
        logger.info(""+hotelById);
        session.setAttribute("hotel",hotelById);

        return "route_detail";
    }


    //前往购物车详单页
    @RequestMapping("specifications")
    public String specifications(){
        return "specifications";
    }

    //国内地图页面
    @RequestMapping("guoneiMap")
    public String guoneiMap(Model model){
        List<City> citys = remoteService.findCitys();

       Map<String,Integer> map=new HashMap<>();
        ArrayList<HotelNum> list = new ArrayList<>();
        for(City city:citys){
            if(map.containsKey(city.getCname())){
                int i = map.get(city.getCname());
                i++;
                map.remove(city.getCname());
                map.put(city.getCname(),i);
            }else {
                map.put(city.getCname(),1);
            }
        }
        for(Map.Entry<String,Integer> m:map.entrySet()){
            list.add(new HotelNum(m.getKey(),m.getValue()));

        }
        logger.info(";;;"+list);

        String json = JsonUtils.objectToJson(list);
        logger.info("ss;;;"+json);
        model.addAttribute("list",json);
        return "echarts_map";
    }

}
