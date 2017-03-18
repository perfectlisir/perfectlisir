package com.example.lijie.perfectlisir;

import android.content.Context;

import com.example.lijie.perfectlisir.request.HeaderInterceptor;
import com.example.lijie.perfectlisir.request.RequestCacheInterceptor;
import com.example.lijie.perfectlisir.util.HttpsUtil;

import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;

/**
 * @Description
 * @Author lijie
 * @Date 2017/3/14.
 */
public class Lisir {
    public static Context context;
    public static String httpurl;
    private static OkHttpClient client;
    private static OkHttpClient.Builder builder;
    private static boolean isChange = false;

    /**
     * 请求无header初始化
     * @param mContext Application context
     * @param url look httpUrl
     */
    public static void init(Context mContext, String url)
    {
        init(mContext, url, null);

    }
    /**
     * 给请求添加header
     * @param mContext Application context
     * @param url look httpUrl
     * @param header request header
     */
    public static void init(Context mContext, String url, final Map<String, String> header)
    {
        context = mContext;
        httpurl = url;



        //http cache path
        File cacheFile = new File(mContext.getExternalCacheDir(), "responses");
        //cache size
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100);
        //init OkhttpClient
        builder = HttpsUtil.getHttpsOkHttpClient(context)
                .addInterceptor(new RequestCacheInterceptor(context))//应用拦截器
                .addNetworkInterceptor(new RequestCacheInterceptor(context))//网络拦截器
                .connectTimeout(30, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .cache(cache);

        if (header != null) {

            builder.addInterceptor(new HeaderInterceptor(header));

        }
    }

    public static OkHttpClient.Builder getBuilder()
    {
        isChange = true;
        return builder;
    }

    public static OkHttpClient getClient()
    {
        if(client == null || isChange)
        {
            client = builder.build();

            isChange = false;
        }
        return client;
    }

}
