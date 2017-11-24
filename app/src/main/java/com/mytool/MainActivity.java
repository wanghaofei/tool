package com.mytool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mytool.HttpProcessor.HttpCallback;
import com.mytool.HttpProcessor.HttpHelper;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String url = "http://c.3g.163.com/photo/api/set/0001%2F2250173.json";
    private Map<String,Object> params = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void netClick(View view){


        //网络请求
        HttpHelper.obtain().post(url, params, new HttpCallback<String>() {
            @Override
            public void onSuccess(String result) {

            }

            @Override
            public void onFailure(String e) {

            }
        });
    }

}
