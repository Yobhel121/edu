package com.yobhel.flume.interceptors.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

/**
 * 类描述：TODO
 *
 * @author yezhimin
 * @date 2023-10-12 19:38
 **/
public class JSONUtil {
    public static boolean isJSONValidate(String log) {
        try {
            JSON.parse(log);
            return true;
        } catch (JSONException e) {
            return false;
        }
    }
}
