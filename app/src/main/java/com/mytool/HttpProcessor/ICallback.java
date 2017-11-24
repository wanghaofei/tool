package com.mytool.HttpProcessor;

/**
 * 返回数据回调
 * Created by wanghaofei on 17/11/23.
 */

public interface ICallback {

    void onSuccess(String result);
    void onFailure(String e);

}
