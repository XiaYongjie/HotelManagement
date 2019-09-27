package com.hcyq.hotel.common;

import com.hcyq.hotel.utils.GsonUtils;

public class Result {
    public static String toSuccess(Object data) {
        return GsonUtils.objectToJson(new ResultBean(1, "请求成功", data));
    }

    public static String toSuccess(String msg, Object data) {
        return GsonUtils.objectToJson(new ResultBean(1, msg, data));
    }

    public static String toSuccess(int status, String msg, Object data) {
        return GsonUtils.objectToJson(new ResultBean(status, msg, data));
    }


    public static String toError(Object data) {
        return GsonUtils.objectToJson(new ResultBean(0, "请求失败", data));
    }

    public static String toError(String msg, Object data) {
        return GsonUtils.objectToJson(new ResultBean(0, msg, data));
    }

    public static String toError(int status, String msg, Object data) {
        return GsonUtils.objectToJson(new ResultBean(status, msg, data));
    }
}
