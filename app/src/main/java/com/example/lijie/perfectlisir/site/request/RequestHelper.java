package com.example.lijie.perfectlisir.site.request;


import com.example.lijie.perfectlisir.request.RequestClient;
//网络请求工具类
public class RequestHelper
{
    public static IRequestService getRequestService(){

        return RequestClient.getClient().getRetrofit().create(IRequestService.class);
    }
    public static IRequestService getRequestService(String url){

        return RequestClient.getClient().getRetrofit(url).create(IRequestService.class);
    }
}
