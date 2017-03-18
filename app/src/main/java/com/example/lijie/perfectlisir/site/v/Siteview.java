package com.example.lijie.perfectlisir.site.v;

import android.content.Context;

import com.example.lijie.perfectlisir.site.m.RegionInfo;

import java.util.Map;

/**
 * @Description
 * @Author lijie
 * @Date 2017/3/18.
 */
public class Siteview implements ISiteView {
    @Override
    public Map<String, Object> getParameters() {
        return null;
    }

    @Override
    public void onCompleted(RegionInfo entity) {

    }

    @Override
    public void onError(int code, String msg) {

    }

    @Override
    public String getUrlAction() {
        return null;
    }

    @Override
    public Class<RegionInfo> getEClass() {
        return null;
    }

    @Override
    public void loading() {

    }

    @Override
    public void dismiss() {

    }

    @Override
    public Context getContext() {
        return null;
    }
}
