package com.example.lijie.perfectlisir.request;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * @Description 下载或上传请求时添加进度指示的过虑器
 * @Author MoseLin
 * @Date 2016/7/4.
 */
public class ProcessInterceptor implements Interceptor
{

    private final ProgressListener listener;

    public ProcessInterceptor(ProgressListener listener)
    {
        this.listener = listener;
    }

    @Override
    public Response intercept(Chain chain) throws IOException
    {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder().body(
                new ProgressResponseBody(originalResponse.body(), listener))
                .build();
    }
}
