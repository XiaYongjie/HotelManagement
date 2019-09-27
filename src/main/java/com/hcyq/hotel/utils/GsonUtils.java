package com.hcyq.hotel.utils;
import java.lang.reflect.Type;
import com.google.gson.Gson;

public class GsonUtils {


    /**
     * 1，该方法主要功能是将json字符串转换成Java类对象
     *
     * @param json
     *            json字符串
     * @param cls
     *            Java类的字节码对象
     * @return 解析后的Java类对象
     * @throws Exception
     *             如果解析中出了问题，或者是json不完整都会抛出这个异常信息
     */
    public static <T> T jsonToObject(String json, Class<T> cls) throws Exception {
        return new Gson().fromJson(json, cls);
    }

    /**
     * 2，该方法主要功能是将Java类对象转换成json字符串
     *
     * @param obj
     *            Java对象
     * @return json字符串
     */
    public static String objectToJson(Object obj) {
        return new Gson().toJson(obj);
    }

    /**
     * 3,该方法主要功能是将json字符串转换成指定类型的对象
     *
     * @param json
     *            json字符串
     * @param typeOfT
     *            指定类型
     * @return 指定类型的对象
     */
    public static  <T> T jsonToObject(String json, Type typeOfT) throws Exception {
        return new Gson().fromJson(json, typeOfT);
    }
}
