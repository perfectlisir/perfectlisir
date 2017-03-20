package com.example.lijie.perfectlisir.pickerview.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lijie.perfectlisir.R;
import com.example.lijie.perfectlisir.pickerview.listener.OnDismissListener;
import com.example.lijie.perfectlisir.pickerview.listener.OnItemSelectedListener;

import java.util.ArrayList;

/**
 * Created by Moselin on 2016/11/21.
 */

public class AddressPickerView<T> extends BasePickerView implements View.OnClickListener
{
    AddressOptions wheelOptions;
    private View btnSubmit, btnCancel;
    private TextView tvTitle;
    private static final String TAG_SUBMIT = "submit";
    private static final String TAG_CANCEL = "cancel";
    private OnDismissListener listener;

    public AddressPickerView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.address_options, contentContainer);
        // -----确定和取消按钮
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setTag(TAG_SUBMIT);
        btnCancel = findViewById(R.id.btnCancel);
        btnCancel.setTag(TAG_CANCEL);
        btnSubmit.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        //顶部标题
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        // ----转轮
        final LinearLayout optionsPicker = (LinearLayout) findViewById(R.id.optionsPicker);
        wheelOptions = new AddressOptions(optionsPicker);
    }
    /**
     * 设置选中的item位置
     * @param option1
     */
    public void setSelectOptions(int... option1){
        wheelOptions.setCurrentItems(option1);
    }
    public void setPicker(ArrayList<T>... options){
        wheelOptions.setPicker(options);
    }
    public void notifyDataChange(ArrayList<T>... options){
        wheelOptions.notifyDataChange(options);
    }
    @Override
    public void onClick(View v)
    {
        String tag=(String) v.getTag();
        if(tag.equals(TAG_CANCEL))
        {
            if (this.listener !=null)
                listener.onDismiss(null);
            dismiss();
            return;
        }
        else
        {
            dismiss();
            return;
        }
    }

    public void setOnItemSelectedListener(OnItemSelectedListener... listeners){
        wheelOptions.setOnItemSelectedListener(listeners);
    }

    public void setTitle(String title){
        tvTitle.setText(title);
    }
    public void setListener(OnDismissListener listener)
    {
        this.listener = listener;
    }

}
