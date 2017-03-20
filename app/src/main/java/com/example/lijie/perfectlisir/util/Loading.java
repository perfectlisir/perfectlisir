package com.example.lijie.perfectlisir.util;

import android.content.Context;
import android.widget.TextView;

import com.example.lijie.perfectlisir.R;

import butterknife.Bind;

/**
 * @Description
 * @Author MoseLin
 * @Date 2016/10/20.
 */

public class Loading extends LoadingDialog
{
    @Bind(R.id.id_tv_loadingmsg)
    TextView idTvLoadingmsg;

    public Loading(Context context)
    {
        super(context);
    }

    @Override
    protected TextView getMsgView()
    {
        return idTvLoadingmsg;
    }

    @Override
    protected int getWidth()
    {
        return ScreenUtils.getScreenWidth(getContext())/3;
    }

    @Override
    protected int getLayoutId()
    {
        return R.layout.loading;
    }

    @Override
    protected int getStyle()
    {
        return R.style.progress_dialog;
    }
}
