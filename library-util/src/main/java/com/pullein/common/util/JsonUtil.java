package com.pullein.common.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * ProjectName: X-Util
 * ClassName: JsonUtil
 * Author: XG
 * CreateDate: 2020/1/14 22:35
 * Description:Json工具类
 */
public class JsonUtil {
    private JsonUtil() {
    }

    public static <T> String toJson(T t) {
        String result = "";
        try {
            result = new Gson().toJson(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static <T> T toBean(String string, Class<T> t) {
        T result = null;
        try {
            result = new Gson().fromJson(string, t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static <T> T toBean(JsonElement json, Class<T> t) {
        T result = null;
        try {
            result = new Gson().fromJson(json, t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static <T> T toBean(String string, Type t) {
        T result = null;
        try {
            result = new Gson().fromJson(string, t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static <T> ArrayList<T> toList(JsonArray array, Class<T> cls) {
        ArrayList<T> list = new ArrayList<>();
        try {
            for (final JsonElement json : array) {
                T entity = new Gson().fromJson(json, cls);
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static <T> ArrayList<T> toList(String array, Class<T> cls) {
        ArrayList<T> list = new ArrayList<>();
        try {
            JsonArray jsonElements = JsonParser.parseString(array).getAsJsonArray();
            list.addAll(toList(jsonElements, cls));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
