package com.qf.j1902.utils;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.CannedAccessControlList;
import com.aliyun.oss.model.CreateBucketRequest;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.qf.j1902.config.OSSClientConstants;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * Created by 杜碧天 on 2019/7/24.
 */

public class AliyunOssUtils {



    /** 上传文件*/
    public  String  upLoad(File file){

        String endpoint =OSSClientConstants.ENDPOINT;
        System.out.println("获取到的Point为:"+endpoint);
        String accessKeyId = OSSClientConstants.ACCESS_KEY_ID;
        String accessKeySecret =OSSClientConstants.ACCESS_KEY_SECRET;
        String bucketName = OSSClientConstants.BACKET_NAME;
        String fileHost =OSSClientConstants.FOLDER;

        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");

        // 判断文件
        if(file==null){
            return null;
        }
        String fileUrl = "";
        OSSClient client=new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            // 判断容器是否存在,不存在就创建
            if (!client.doesBucketExist(bucketName)) {
                client.createBucket(bucketName);
                CreateBucketRequest createBucketRequest = new CreateBucketRequest(bucketName);
                createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
                client.createBucket(createBucketRequest);
            }
            // 设置文件路径和名称
            fileUrl = fileHost + (UUIDUtils.getUUID() + file.getName().substring(file.getName().lastIndexOf("."),file.getName().length()));
            // 上传文件
            PutObjectResult result = client.putObject(new PutObjectRequest(bucketName, fileUrl, file));
            // 设置权限(公开读)
            client.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);


        }catch (OSSException oe){
           oe.printStackTrace();
        }catch (ClientException ce){
           ce.printStackTrace();
        }finally{
            if(client!=null){
                client.shutdown();
            }
        }
        return fileUrl;
    }
}
