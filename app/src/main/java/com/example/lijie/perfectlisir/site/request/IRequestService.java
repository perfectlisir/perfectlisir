package com.example.lijie.perfectlisir.site.request;

import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

/**
 * @Description 请求服务
 * @Author lijie
 * @Date 2017/3/16.
 */
public interface IRequestService {

    /**
     * 发起get请求
     * @param url action路径
     * @return Observable
     */
    @GET
    Observable<ResponseBody>  get(@Url String url);

    /**
     * 发起post请求
     * @param url action路径
     * @param parameters post参数
     * @return Observable
     */
    @POST()
    Observable<ResponseBody> post(@Url String url,@QueryMap Map<String, Object> parameters);

    /**
     * 上传（通过自定义请求体实现上传任意类型）
     * @param url action路径
     * @param body 自定义请求体
     * @return Observable
     */
    @POST()
    Observable<ResponseBody> upload(@Url String url, @Body RequestBody body);
}
