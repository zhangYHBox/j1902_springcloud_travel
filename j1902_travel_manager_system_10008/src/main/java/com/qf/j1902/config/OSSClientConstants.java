package com.qf.j1902.config;

import org.springframework.context.annotation.Configuration;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
@Configuration
public class OSSClientConstants {
    //阿里云API的外网域名
    public static final String ENDPOINT = "oss-cn-beijing.aliyuncs.com";
    //阿里云API的密钥Access Key ID
    public static final String ACCESS_KEY_ID = "LTAIriiXRLo99Yvh";
    //阿里云API的密钥Access Key Secret
    public static final String ACCESS_KEY_SECRET = "61NCbUMmSS1htsWBz7hsiCxDyR8hiX";
    //阿里云API的bucket名称
    public static final String BACKET_NAME = "lucien";
    //阿里云API的文件夹名称
    public static final String FOLDER="imgs/";
}
