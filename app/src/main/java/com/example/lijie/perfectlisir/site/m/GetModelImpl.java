package com.example.lijie.perfectlisir.site.m;

import com.example.lijie.perfectlisir.site.request.IGetModel;
import com.example.lijie.perfectlisir.site.request.ResponseSubscriber;

import rx.Subscription;

/**
 * @Description
 * @Author lijie
 * @Date 2017/3/17.
 */
public class GetModelImpl<E> extends BaseModelImpl implements IGetModel<E> {
    @Override
    public Subscription get(String action, ResponseSubscriber subscriber) {
        return getSubscription(action,subscriber);
    }

    @Override
    public Subscription get(String url, String action, ResponseSubscriber subscriber) {
        return getSubscription(url,action,subscriber);
    }
}
