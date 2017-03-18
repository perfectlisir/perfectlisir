package com.example.lijie.perfectlisir.site.request;


import com.example.lijie.perfectlisir.mvp.model.IBaseModel;

import java.util.Map;

import rx.Subscription;

/**
 * @Description
 * @Author MoseLin
 * @Date 2016/10/24.
 */

public interface IPostModel<E> extends IBaseModel
{
    /**
     * 发送post请求
     * @param action action 路径
     * @param parameters post参数
     * @param subscriber 订阅者
     * @return Subscription
     */
    Subscription post(String action, Map<String, Object> parameters, ResponseSubscriber<E> subscriber);
    /**
     *
     * @param url 请求API的地址
     * @param action 请求的动作路径
     * @param parameters 提交的参数
     * @param subscriber subscriber
     * @return Subscription
     */
    Subscription post(String url, String action, Map<String, Object> parameters, ResponseSubscriber<E> subscriber);

}
