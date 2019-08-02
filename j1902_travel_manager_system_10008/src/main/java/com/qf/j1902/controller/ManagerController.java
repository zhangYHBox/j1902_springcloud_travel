package com.qf.j1902.controller;

import com.qf.j1902.pojo.Imgurl;
import com.qf.j1902.service.MailService;
import com.qf.j1902.service.RemotedService;
import com.qf.j1902.utils.AliyunOssUtils;
import com.qf.j1902.utils.DeleteFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2019/7/26.
 */
@Controller
public class ManagerController {
    @Autowired
    private MailService mailService;

    @Autowired
    private RemotedService remoteService;

    //主页面首页
    @RequestMapping("main.html")
    public String element(){
        return "main";
    }

    //进去认证第一步
    @RequestMapping("form.html")
    public String form(){
        return "apply";
    }

    //认证开始
    @RequestMapping("apply.html")
    public String apply(){
        return "apply";
    }

    //认证第一步
    @RequestMapping("apply-1.html")
    public String apply1(@RequestParam("realname") String realname,
                         @RequestParam("cardnum") String cardnum,
                         @RequestParam("tel") String tel, Model model){

        model.addAttribute("realname",realname);
        model.addAttribute("cardnum",cardnum);
        model.addAttribute("tel",tel);
        return "apply-1";
    }

    //认证第二步
    @RequestMapping("apply-2.html")
    public String apply2(MultipartHttpServletRequest request,
                         @RequestParam("realname") String realname,
                         @RequestParam("cardnum") String cardnum,
                         @RequestParam("tel") String tel,
                         Model model){
        model.addAttribute("realname",realname);
        model.addAttribute("cardnum",cardnum);
        model.addAttribute("tel",tel);



       /* String code="";
        String newFileName = null;
        AliyunOssUtils ossUtils = new AliyunOssUtils();
        Iterator<String> fileNames = request.getFileNames();

        try {
            while (fileNames.hasNext()) {

                //把fileNames集合中的值打出来
                String fileName=fileNames.next();
                System.out.println("fileName: "+fileName);

                *//*
                 * request.getFiles(fileName)方法即通过fileName这个Key, 得到对应的文件
                 * 集合列表. 只是在这个Map中, 文件被包装成MultipartFile类型
                 *//*
                List<MultipartFile> fileList=request.getFiles(fileName);

                if (fileList.size()>0) {

                    //遍历文件列表
                    Iterator<MultipartFile> fileIte=fileList.iterator();

                    while (fileIte.hasNext()) {

                        //获得每一个文件
                        MultipartFile multipartFile = fileIte.next();

                        if (multipartFile != null) {
                            String filename = multipartFile.getOriginalFilename();
                            if (!"".equals(filename.trim())) {

                                File newFile = new File(filename);
                                FileOutputStream os = new FileOutputStream(newFile);
                                os.write(multipartFile.getBytes());
                                os.close();
                                multipartFile.transferTo(newFile);
                                // 上传到OSS
                                String uploadUrl = ossUtils.upLoad(newFile);
                                newFileName= "http://dubitianoss.oss-cn-beijing.aliyuncs.com/"+uploadUrl;
                                Imgurl imgurl = new Imgurl();
                                imgurl.setName(newFileName);
                                int add = service.add(imgurl);
                                if(add==1){
                                    code="0";
                                }else {
                                    code="1";
                                }
                                System.err.println(code);
                                System.err.println(uploadUrl);

                                // 删除上传的文件
                                File file1=new File("");
                                String s = file1.getAbsolutePath();
                                DeleteFileUtil.delete(s + "\\" + filename);
                            }

                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return code;*/




        return "apply-2";
    }

    //认证第二步 邮箱验证密码
    @RequestMapping("apply-3.html")
    public String apply3(@RequestParam("email") String email,
                         @RequestParam("realname") String realname,
                         @RequestParam("cardnum") String cardnum,
                         @RequestParam("tel") String tel,
                         HttpSession session,
                         Model model){

        model.addAttribute("realname",realname);
        model.addAttribute("cardnum",cardnum);
        model.addAttribute("tel",tel);
        model.addAttribute("email",email);

        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        String message = "您的注册验证码为："+checkCode;
        try {
            session.setAttribute("SessionKey",checkCode);
            mailService.sendSimpleMail(email, "注册验证码", message);
        }catch (Exception e){
            return "apply-3";
        }
        return "apply-3";
    }

    //完成审核
    @RequestMapping("/atermember")
    public String atermember(@RequestParam("email") String email,
                             @RequestParam("realname") String realname,
                             @RequestParam("cardnum") String cardnum,
                             @RequestParam("tel") String tel,
                             Model model,HttpSession session){
        String loginname = (String)session.getAttribute("loginname");
        Integer updateenter = remoteService.updateenter(loginname, realname, email, cardnum, tel);

        return "main";
    }

    //退出
    @RequestMapping("/")
    public String Login(){
        return "index";
    }


    //提交服务页面
    @RequestMapping("product.html")
    public String prodect(){

        return "product";
    }

    //商品的提交信息
    @RequestMapping("/shangpin")
    public String shangpin(){
        return "success";
    }

}
