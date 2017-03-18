package com.example.lijie.perfectlisir;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.lijie.perfectlisir.site.Main2Activity;
import com.lsxiao.apllo.annotations.Receive;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    @Bind(R.id.tv)
    Button tv;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void afterCreate(Bundle savedInstanceState) {

    }

    @OnClick(R.id.tv)
    public void onClick() {

        startActivity(new Intent(this, Main2Activity.class));
        //跳转千万不能把activity关闭
    }

    @Receive(tag = Constant.INCART)
    public void cartrefresh() {
        Log.i("测试", "按键一");
    }

    @Receive(tag = Constant.DATAS)
    public void datafrsh() {
        Log.i("测试", "按键二");
    }


}
