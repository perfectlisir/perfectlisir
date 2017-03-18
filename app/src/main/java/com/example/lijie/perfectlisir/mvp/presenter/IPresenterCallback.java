package com.example.lijie.perfectlisir.mvp.presenter;

/**
 * @Description
 * @Author lijie
 * @Date 2017/3/11.
 */
public interface IPresenterCallback<E> {
    /**
     *
     * @param entity 实体类泛型
     */
    void onCompleted(E entity);

    /**
     *
     * @param code 错误码
     * @param msg  提示信息
     */
    void onError(int code,String msg);
}
