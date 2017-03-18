package com.example.lijie.perfectlisir.pickerview.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.elmsc.buyer.R;

public class BankPickerView extends BasePickerView implements View.OnClickListener
{

    private WheelBank wheelBank;
    private View btnSubmit, btnCancel, bankPicker;
    private TextView tvTitle;
    private static final String TAG_SUBMIT = "submit";
    private static final String TAG_CANCEL = "cancel";
    private OnBankSelectListener bankSelectListener;

    public BankPickerView(Context context)
    {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.pickerview_bank, contentContainer);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setTag(TAG_SUBMIT);
        btnCancel = findViewById(R.id.btnCancel);
        btnCancel.setTag(TAG_CANCEL);
        btnSubmit.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

        bankPicker = findViewById(R.id.bankPicker);
        wheelBank = new WheelBank(bankPicker);
        wheelBank.setPicker(0, 0);
    }

    public void setTitle(String title)
    {
        tvTitle.setText(title);
    }

    /**
     * 设置是否循环滚动
     *
     * @param cyclic
     */
    public void setCyclic(boolean cyclic)
    {
        wheelBank.setCyclic(cyclic);
    }

    @Override
    public void onClick(View v)
    {
        String tag = (String) v.getTag();
        if (tag.equals(TAG_SUBMIT))
        {
            if (bankSelectListener != null)
                bankSelectListener.onBankSelect(wheelBank.getBankCardType());
        }
        dismiss();
    }


    public interface OnBankSelectListener
    {
        public void onBankSelect(String s);
    }

    public void setOnBankSelectListener(OnBankSelectListener bankSelectListener)
    {
        this.bankSelectListener = bankSelectListener;
    }
}
