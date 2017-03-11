package com.example.lijie.perfectlisir;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lsxiao.apllo.Apollo;

import butterknife.Bind;
import butterknife.OnClick;

public class Main2Activity extends BaseActivity {

    @Bind(R.id.ceshi1)
    Button ceshi1;
    @Bind(R.id.ceshi2)
    Button ceshi2;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main2;
    }

    @Override
    protected void afterCreate(Bundle savedInstanceState) {

    }

    @OnClick({R.id.ceshi1, R.id.ceshi2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ceshi1:
                Apollo.get().send(Constant.INCART);
                break;
            case R.id.ceshi2:
                Apollo.get().send(Constant.DATAS);
                break;
        }
    }
}
