package com.qf.j1902.utils;

import java.util.UUID;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
public class UUIDUtils {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
