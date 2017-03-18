package com.example.lijie.perfectlisir.mvp.view;


import android.content.Context;

/**
 * @Description 请求一般对加载框处理的接口
 * @Author MoseLin
 * @Date 2016/6/24.
 */
public interface ILoadingView extends IBaseView
{
    /**
     * 正在请求中显示加载框
     */
    void loading();

    /**
     * 请求完成关闭加载框
     */
    void dismiss();

    /**
     * 上下文
     * @return
     */
    Context getContext();

}
