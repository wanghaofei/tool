package com.mytool;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import com.mytool.HttpProcessor.HttpHelper;
import com.mytool.HttpProcessor.VolleyProcessor;

/**
 * Created by wanghaofei on 17/11/23.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        HttpHelper.init(new VolleyProcessor(this));
    }
}
