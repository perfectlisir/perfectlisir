package com.example.lijie.perfectlisir;

import android.app.Application;

import com.lsxiao.apllo.Apollo;
import com.lsxiao.apollo.generate.SubscriberBinderImplement;

import rx.android.schedulers.AndroidSchedulers;

/**
 * @Description
 * @Author lijie
 * @Date 2017/3/8.
 */
public class App extends Application {
    private static App instance;

    //    public PatchManager mPatchManager;
    public int requestCount = 0;//计数同时请求网络的数量，当为0时关闭加载框
    private String token;

    private String url = "https://1.elmsc.com/api/";
    @Override
    public void onCreate() {
        super.onCreate();
//        这句是自动生成的，开始并没有！当你调用
        Apollo.get().init(SubscriberBinderImplement.instance(), AndroidSchedulers.mainThread());

    }

    public static App getInstance()
    {
        return instance;
    }
}
