package com.example.lijie.perfectlisir.site.request;


import com.example.lijie.perfectlisir.mvp.model.IBaseModel;

import rx.Subscription;

/**
 * @Description
 * @Author MoseLin
 * @Date 2016/10/24.
 */

public interface IGetModel<E> extends IBaseModel
{
    /**
     * 发送get请求
     * @param action action路径
     * @param subscriber 订阅者
     * @return Subscription
     */
    Subscription get(String action, ResponseSubscriber<E> subscriber);

    /**
     *
     * @param url 请求API地址的ip或域名
     * @param action 请求动作路径
     * @param subscriber subscriber
     * @return Subscription
     */
    Subscription get(String url, String action, ResponseSubscriber<E> subscriber);
}
