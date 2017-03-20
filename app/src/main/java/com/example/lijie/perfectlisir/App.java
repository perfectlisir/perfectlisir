package com.example.lijie.perfectlisir;

import android.app.Application;

import com.example.lijie.perfectlisir.request.HeaderInterceptor;
import com.example.lijie.perfectlisir.util.SPUtils;
import com.lsxiao.apllo.Apollo;
import com.lsxiao.apollo.generate.SubscriberBinderImplement;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.Response;
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
//    private String url = "http://192.168.1.250:4000/mockjsdata/6/";     //模拟接口
        private String url = "http://192.168.1.250:9090/api/";      //250接口
//    private String url = "https://1.elmsc.com/api/";
    @Override
    public void onCreate() {
        super.onCreate();
//        这句是自动生成的，开始并没有！当你调用
        Apollo.get().init(SubscriberBinderImplement.instance(), AndroidSchedulers.mainThread());
        Lisir.init(App.this, url) ;
        instance = this;
    }

    public static App getInstance()
    {
        return instance;
    }


    private void initMosl()
    {
        token = SPUtils.getString(this, Constant.TOKEN, "");

        addResponseInterceptor();
    }

    public Map<String, String> getRequestHead() {

        Map<String, String> map = new HashMap<>();
        map.put("X-Requested-With", "Android");
        //        map.put("t", "af6c1e5c-47b8-4f5e-bde0-c64ea11eb07f");
        map.put("t", token);
        map.put("f", "1");
        map.put("appv", BuildConfig.VERSION_NAME);
        return map;

    }

    public void addResponseInterceptor(){//响应返回t,进行截取
       Lisir.getBuilder().addInterceptor(new Interceptor()
        {
            @Override
            public Response intercept(Chain chain) throws IOException
            {
                Response response = chain.proceed(chain.request());
                if (response.header("t") != null)//这个在有请求t的时候不执行
                {
                    addRequestHead(response.header("t"));
                }
                return response;
            }
        });
    }

    public void addRequestHead(String t)
    {
        token = t;
        Lisir.getBuilder().addInterceptor(new HeaderInterceptor(getRequestHead()));
        SPUtils.putString(App.this, Constant.TOKEN, token);
    }
}
