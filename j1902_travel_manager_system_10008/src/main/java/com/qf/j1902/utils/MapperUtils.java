package com.qf.j1902.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MapperUtils {
    private final static ObjectMapper objectMapper = new ObjectMapper();

    public static ObjectMapper getInstance() {
        return objectMapper;
    }

    /**
     * 转换为 JSON 字符串
     *
     * @param obj
     * @return
     * @throws Exception
     */
    public static String obj2json(Object obj) throws Exception {
        return objectMapper.writeValueAsString(obj);
    }
    /**
     * 转换为 JavaBean
     *
     * @param jsonString
     * @param clazz
     * @return
     * @throws Exception
     */
    public static <T> T json2pojo(String jsonString, Class<T> clazz) throws Exception {
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        return objectMapper.readValue(jsonString, clazz);
    }

    /**
     * 将 JSON 对象转换为 JavaBean
     *
     * @param obj
     * @param clazz
     * @return
     */
    public static <T> T obj2pojo(Object obj, Class<T> clazz) {
        return objectMapper.convertValue(obj, clazz);
    }
}
