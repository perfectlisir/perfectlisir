package com.example.lijie.perfectlisir.site.m;

import com.example.lijie.perfectlisir.site.request.IPostModel;
import com.example.lijie.perfectlisir.site.request.ResponseSubscriber;

import java.util.Map;

import rx.Subscription;

/**
 * @Description
 * @Author lijie
 * @Date 2017/3/17.
 */
public class PostModelImpl<E> extends BaseModelImpl implements IPostModel<E> {
    @Override
    public Subscription post(String action, Map<String, Object> parameters, ResponseSubscriber<E> subscriber) {
        return postSubscription(action,parameters,subscriber);
    }

    @Override
    public Subscription post(String url, String action, Map<String, Object> parameters, ResponseSubscriber<E> subscriber) {
        return postSubscription(url,action,parameters,subscriber);
    }
}
