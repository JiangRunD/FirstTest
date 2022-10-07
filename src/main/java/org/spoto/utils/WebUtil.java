package org.spoto.utils;

import com.alibaba.fastjson.JSONObject;

public class WebUtil {

    public static String returnData(Object obj){
        JSONObject json= (JSONObject) JSONObject.toJSON(obj);
        return json.toString();
    }
}
