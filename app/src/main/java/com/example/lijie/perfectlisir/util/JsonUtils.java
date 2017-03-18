package com.example.lijie.perfectlisir.util;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @Description
 * @Author MoseLin
 * @Date 2016/10/24.
 */
public class JsonUtils
{

    /**
     * 检查请求返回的结果是否成功
     *
     * @param json
     * @return
     */
    public static boolean checkResult(String json) {
        boolean b = false;
        try {
            JSONObject object = new JSONObject(json);

                if (object.has(Constant.RET))
                    b = object.optInt(Constant.RET)==1;
                else
                    b = true;
        } catch (JSONException e) {
            e.printStackTrace();
            b = false;
        }
        return b;
    }

    /**
     * 请求失败时解析出提示信息
     *
     * @param json
     * @return
     */
    public static String getMessage(String json) {
        String message = null;
        try {
            JSONObject object = new JSONObject(json);
            if (object != null) {
                message = object.optString(Constant.MSG);
            }

        } catch (JSONException e) {
            e.printStackTrace();
            message = "请求服务器出错，请稍候再试！";
        }
        return message;
    }

    /**
     * 获取错误码
     *
     * @param json
     * @return
     */
    public static int getCode(String json) {
        int code = 500;
        try {
            JSONObject object = new JSONObject(json);
                code = object.optInt(Constant.RET);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return code;
    }
}
