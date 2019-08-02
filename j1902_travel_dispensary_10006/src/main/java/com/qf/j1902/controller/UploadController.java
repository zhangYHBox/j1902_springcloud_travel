package com.qf.j1902.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * Created by Administrator on 2019/7/29.
 */
@Controller
public class UploadController {

    @RequestMapping("/goupload")
    public String upload(){
        return "upload";
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile(MultipartFile file, HttpServletRequest request){
        try {
            //创建文件在服务器端的存放路径
            String realPath = request.getServletContext().getRealPath("/upload");
            File fileDir = new File(realPath);
            if(!fileDir.exists()){
                fileDir.mkdirs();
                //生成文件在服务器端存放的名字
                String fileSuffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
                String fileName= UUID.randomUUID().toString()+fileSuffix;

                File files = new File(fileDir+"/"+fileName);
                //上传
                file.transferTo(files);
            }
        }catch (Exception e){
            e.printStackTrace();
            return "上传失败";
        }

        return "上传成功";
    }
}
