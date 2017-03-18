package com.example.lijie.perfectlisir.site.request;


import com.example.lijie.perfectlisir.App;
import com.example.lijie.perfectlisir.mvp.presenter.IPresenterCallback;
import com.example.lijie.perfectlisir.pickerview.utils.L;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;

/**
 * @Description 重写RxJava的订阅者（请求服务器调用）
 * @Author MoseLin
 * @Date 2016/6/24.
 */
public class RequestSubscriber<E> extends Subscriber<E>
{

    private IPresenterCallback<E> callback;
    private String msg;
    public RequestSubscriber(IPresenterCallback<E> callback){
        this.callback = callback;
        App.getInstance().requestCount++;
    }
    @Override
    public void onCompleted()
    {
        dismissLoading();
    }

    private void dismissLoading()
    {
        App.getInstance().requestCount--;
        if (App.getInstance().requestCount == 0){
//            LoadingMaker.dismissProgressDialog();
        }
    }

    @Override
    public void onError(Throwable e)
    {
        dismissLoading();
        if (e instanceof HttpException) {
            HttpException httpException = (HttpException) e;
            int code = httpException.code();
            msg = httpException.getMessage();
//            if (code == 504) {
//                msg = "网络出错了啦";
//            }
//            L.v(code+msg);
            httpCode(code);
            callback.onError(code,msg);
        } else {
            L.v(e.getMessage());
            callback.onError(-1,e.getMessage());
        }

    }

    @Override
    public void onNext(E o)
    {
        callback.onCompleted(o);
    }

    public void httpCode(int code){
        switch (code){
            case 400:
                msg="错误请求";
                L.v(code+msg);
                break;
            case 404:
                msg="服务器找不到请求的网页";
                L.v(code+msg);
                break;
            case 500:
                msg="服务器内部错误";
                L.v(code+msg);
                break;
            case 504:
                msg="当前网络不可用";
                L.v(code+msg);
                break;
            case 505:
                msg="服务器不支持请求中所使用的 HTTP 协议版本。";
                L.v(code+msg);
                break;
        }
    }
}
