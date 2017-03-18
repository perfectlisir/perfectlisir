package com.example.lijie.perfectlisir.request;

import com.example.lijie.perfectlisir.Lisir;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @Description
 * @Author lijie
 * @Date 2017/3/14.
 */
public class RequestClient {
    private static RequestClient client;

    public  static RequestClient getClient(){
        if(client==null)
            client=new RequestClient();
        return client;
    }

    /**
     * 平常的接口请求
     * @return retrofit
     */
    public Retrofit getRetrofit(){
        return getRetrofit(null,null);
    }
    /**
     * 下载文件的请求
     * @param listener 下载进度监听
     * @return retrofit
     */
    public Retrofit getRetrofit(String apiurl,ProgressListener listener){
        String url = Lisir.httpurl;
        if (apiurl != null)
            url = apiurl;
        OkHttpClient client = Lisir.getClient();
//        if (listener != null){
//            client = client.newBuilder().addNetworkInterceptor(new ProcessInterceptor(listener)).build();
//        }
        Retrofit.Builder builder = getBuilder(url, client);
        return builder.build();

    }

    private Retrofit.Builder getBuilder(String url, OkHttpClient client) {
        return new Retrofit.Builder()
                //baseUrl
                .baseUrl(url)
                //gson转化器
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client);//把OkHttpClient对象写入
    }


    /**
     * @param url 域名
     * @return retrofit的构建器
     */
    public Retrofit getRetrofit(String url)
    {
        return getRetrofit(url,null);
    }
}
