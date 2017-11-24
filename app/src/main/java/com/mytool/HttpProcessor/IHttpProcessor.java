package com.mytool.HttpProcessor;

import java.util.Map;

/**
 * Created by wanghaofei on 17/11/23.
 */

public interface IHttpProcessor {


    void post(String url, Map<String,Object> params, ICallback callback);

    void get(String url, Map<String,Object> params, ICallback callback);

}
