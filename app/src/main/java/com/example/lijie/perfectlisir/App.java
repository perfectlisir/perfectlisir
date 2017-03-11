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
    @Override
    public void onCreate() {
        super.onCreate();
//        这句是自动生成的，开始并没有！当你调用
        Apollo.get().init(SubscriberBinderImplement.instance(), AndroidSchedulers.mainThread());

    }
}
