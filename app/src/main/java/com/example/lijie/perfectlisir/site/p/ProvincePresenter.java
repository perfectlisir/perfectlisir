package com.example.lijie.perfectlisir.site.p;

import com.example.lijie.perfectlisir.mvp.presenter.BasePresenter;

import com.example.lijie.perfectlisir.mvp.presenter.IPresenterCallback;
import com.example.lijie.perfectlisir.site.v.ISiteView;
import com.example.lijie.perfectlisir.site.m.RegionInfo;
import com.example.lijie.perfectlisir.site.request.IGetModel;
import com.example.lijie.perfectlisir.site.request.ResponseSubscriber;

import rx.Subscription;

/**
 * @Description
 * @Author lijie
 * @Date 2017/3/17.
 */
public class ProvincePresenter extends BasePresenter<IGetModel<RegionInfo>,ISiteView> {
    public  void getRegion(){
        Subscription subscription =model.get("http://192.168.1.250:9090/api/",
                view.getUrlAction(),new ResponseSubscriber<>(view.getEClass(), new IPresenterCallback<RegionInfo>() {
            @Override
            public void onCompleted(RegionInfo entity) {
                view.onCompleted(entity);
            }

            @Override
            public void onError(int code, String msg) {
                view.onError(code,msg);
            }
        }));
        addSub(subscription);
    }
}
