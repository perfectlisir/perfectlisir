package com.example.lijie.perfectlisir.site.v;

import android.content.Context;

import com.example.lijie.perfectlisir.ApiAction;
import com.example.lijie.perfectlisir.pickerview.utils.L;
import com.example.lijie.perfectlisir.site.Main2Activity;
import com.example.lijie.perfectlisir.site.m.RegionInfo;

import java.util.Map;

/**
 * @Description
 * @Author lijie
 * @Date 2017/3/18.
 */
public class Siteview implements ISiteView {
    private Main2Activity activity;

    public Siteview(Main2Activity activity) {
        this.activity = activity;
    }

    @Override
    public Map<String, Object> getParameters() {
        return null;
    }

    @Override
    public void onCompleted(RegionInfo entity) {
        activity.fresh(entity);
    }

    @Override
    public void onError(int code, String msg) {
        L.w(msg);
    }

    @Override
    public String getUrlAction() {
      return ApiAction.REGION_ALL3;
    }

    @Override
    public Class<RegionInfo> getEClass() {
        return RegionInfo.class;
    }

    @Override
    public void loading() {

    }

    @Override
    public void dismiss() {

    }

    @Override
    public Context getContext() {
        return activity;
    }
}
