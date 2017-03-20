package com.example.lijie.perfectlisir;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lsxiao.apllo.Apollo;
import com.lsxiao.apllo.entity.SubscriptionBinder;

import butterknife.ButterKnife;

/**
 * @Description
 * @Author lijie
 * @Date 2017/3/8.
 */
public abstract class BaseActivity extends AppCompatActivity {
    private SubscriptionBinder mBinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mBinder = Apollo.get().bind(this);
        ButterKnife.bind(this);
        afterCreate(savedInstanceState);
    }

    protected abstract int getLayoutId();

    protected abstract void afterCreate(Bundle savedInstanceState);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBinder.unbind();
    }


}
