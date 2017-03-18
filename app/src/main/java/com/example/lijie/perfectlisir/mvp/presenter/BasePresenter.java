package com.example.lijie.perfectlisir.mvp.presenter;

import com.example.lijie.perfectlisir.mvp.model.IBaseModel;
import com.example.lijie.perfectlisir.mvp.view.IBaseView;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * @Description
 * @Author lijie
 * @Date 2017/3/11.
 */
public  abstract class BasePresenter<M extends IBaseModel,V extends IBaseView> {
    protected M model;
    protected V view;
    private CompositeSubscription sub=new CompositeSubscription();

    public void setModel(M model) {
        this.model = model;
    }
    public void setView(V view) {
        this.view = view;
    }
    public void setModelView(M model,V view){
        this.model = model;
        this.view = view;
    }

    protected void addSub(Subscription subscription){
        if(sub!=null){
            sub.add(subscription);
        }
    }

    /**
     * 取消注册RxJava 防止内存溢出
     */

    private void unRegistRx(){
        if(sub!=null&&sub.hasSubscriptions()){
            sub.unsubscribe();
            view=null;
        }
    }
}
