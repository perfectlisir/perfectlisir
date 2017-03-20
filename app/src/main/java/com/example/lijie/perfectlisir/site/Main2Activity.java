package com.example.lijie.perfectlisir.site;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lijie.perfectlisir.BaseActivity;
import com.example.lijie.perfectlisir.Constant;
import com.example.lijie.perfectlisir.R;
import com.example.lijie.perfectlisir.pickerview.view.OptionsPickerView;
import com.example.lijie.perfectlisir.site.m.GetModelImpl;
import com.example.lijie.perfectlisir.site.m.RegionInfo;
import com.example.lijie.perfectlisir.site.p.ProvincePresenter;
import com.example.lijie.perfectlisir.site.v.Siteview;
import com.lsxiao.apllo.Apollo;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.OnClick;
import rx.Observable;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class Main2Activity extends BaseActivity {

    @Bind(R.id.ceshi1)
    Button ceshi1;
    @Bind(R.id.ceshi2)
    Button ceshi2;
    @Bind(R.id.text)
    TextView text;
    private ArrayList<RegionInfo.RegionData> item1;
    private ArrayList<ArrayList<RegionInfo.RegionCityData>> item2 = new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<RegionInfo.RegionAreaData>>> item3 = new ArrayList<>();
    private OptionsPickerView pvOptions;
    private ProvincePresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initdata();
    }

    private void initdata() {
        presenter = new ProvincePresenter();
        presenter.setModelView(new GetModelImpl<RegionInfo>(),new Siteview(this));
        presenter.getRegion();

        pvOptions = new OptionsPickerView(this);


    }

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
//                发送通知
                Apollo.get().send(Constant.INCART);
                break;
            case R.id.ceshi2:
                Apollo.get().send(Constant.DATAS);
                pvOptions.show();
                break;
        }
    }

    public void fresh(RegionInfo entity) {
        if (item1 == null) {
            item1 = entity.data;
            Observable.just(item1).subscribeOn(Schedulers.newThread()).subscribe(new Action1<ArrayList<RegionInfo.RegionData>>()
            {
                @Override
                public void call(ArrayList<RegionInfo.RegionData> regionDatas) {


                    for (RegionInfo.RegionData regionInfo : regionDatas) {
                        item2.add(regionInfo.list);
                    }
                    for (ArrayList<RegionInfo.RegionCityData> arrayList : item2) {
                        ArrayList<ArrayList<RegionInfo.RegionAreaData>> list2 = new ArrayList<>();
                        for (RegionInfo.RegionCityData regionInfo : arrayList) {
                            ArrayList<RegionInfo.RegionAreaData> q = regionInfo.list;
                            list2.add(q);
                        }
                        item3.add(list2);
                    }
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            pvOptions.setPicker(item1, item2, item3, true);
                            pvOptions.setCyclic(false, false, false);
                            pvOptions.setSelectOptions(0, 0, 0);
                        }
                    });
                }
            });
        }
        pvOptions.setOnoptionsSelectListener(new OptionsPickerView.OnOptionsSelectListener() {

            @Override
            public void onOptionsSelect(int options1, int option2, int options3) {
                // 返回的分别是三个级别的选中位置
                String tx;
                if (item3.get(options1).get(option2).size() > 0) {
                    tx = item1.get(options1).getPickerViewText() + item2.get(options1).get
                            (option2).getPickerViewText() + item3.get(options1).get(option2).get
                            (options3).getPickerViewText();
                } else
                    tx = item1.get(options1).getPickerViewText() + item2.get(options1).get
                            (option2).getPickerViewText();
                text.setText(tx);
            }
        });


    }



}
