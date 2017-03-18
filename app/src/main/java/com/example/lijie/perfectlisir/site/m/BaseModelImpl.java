package com.example.lijie.perfectlisir.site.m;

import com.example.lijie.perfectlisir.site.request.RequestHelper;
import com.example.lijie.perfectlisir.site.request.ResponseSubscriber;

import java.util.Map;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * @Description
 * @Author lijie
 * @Date 2017/3/16.
 */
public class BaseModelImpl {
    /**
     * get请求带api服务器地址或域名
     * @param url 服务器地址或域名
     * @param action 动作路径地址
     * @param subscriber 订阅者回调
     * @param <T> 泛型实体
     * @return 订阅者
     */
    public static <T>Subscription getSubscription(String url, String action , ResponseSubscriber<T> subscriber ){
        return RequestHelper.getRequestService(url)//相当于 IRequestService.class
                .get(action).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * get 请求不带api服务地址或域名
     * @param action 动作路径
     * @param subscriber 订阅者回调
     * @param <T> 泛型实体
     * @return 订阅者
     */
    public static <T>Subscription getSubscription( String action , ResponseSubscriber<T> subscriber ){

        return RequestHelper.getRequestService().get(action).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * post请求带api服务器地址或域名
     * @param url 服务器地址或域名
     * @param action 动作路径
     * @param map post参数
     * @param subscriber 订阅者回调
     * @param <T> 泛型实体
     * @return 订阅者
     */
    public static <T>Subscription postSubscription(String url, String action , Map<String,Object> map, ResponseSubscriber<T> subscriber){
        return RequestHelper.getRequestService(url).post(action,map).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * post请求不带带api服务器地址或域名
     * @param action 动作路径
     * @param map post参数
     * @param subscriber 订阅者回调
     * @param <T> 泛型实体
     * @return 订阅者
     */
    public static <T>Subscription postSubscription(String action , Map<String,Object> map, ResponseSubscriber<T> subscriber){
        return RequestHelper.getRequestService().post(action,map).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
