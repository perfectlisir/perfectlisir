package com.example.lijie.perfectlisir.pickerview.view;

import android.content.Context;
import android.view.View;

import com.example.lijie.perfectlisir.R;
import com.example.lijie.perfectlisir.pickerview.adapter.ArrayWheelAdapter;
import com.example.lijie.perfectlisir.pickerview.lib.WheelView;

import java.util.ArrayList;
import java.util.Arrays;


public class WheelBank
{
    private Context context;
    private View view;
    private WheelView wvCardType;
    private WheelView wvBankName;

    private ArrayList<String> cardTypeList = new ArrayList<>();
    private ArrayList<String> bankNameList = new ArrayList<>();

    public WheelBank(View view)
    {
        super();
        this.view = view;
        this.context = view.getContext();
        cardTypeList.addAll(Arrays.asList(context.getResources().getStringArray(R.array
                .bankCardTypes)));
        bankNameList.addAll(Arrays.asList(context.getResources().getStringArray(R.array
                .bankNames)));
    }

    public void setPicker(int cardTypePosition, int bankNamePosition)
    {
        int textSize = 17;

        // 银行卡类型
        wvCardType = (WheelView) view.findViewById(R.id.cardType);
        wvCardType.setAdapter(new ArrayWheelAdapter<>(cardTypeList, cardTypeList.size()));
        wvCardType.setCurrentItem(cardTypePosition);
        wvCardType.setTextSize(textSize);

        // 银行名称
        wvBankName = (WheelView) view.findViewById(R.id.bankName);
        wvBankName.setAdapter(new ArrayWheelAdapter<>(bankNameList, bankNameList.size()));
        wvBankName.setCurrentItem(bankNamePosition);
        wvBankName.setTextSize(textSize);
    }

    /**
     * 设置是否循环滚动
     *
     * @param cyclic
     */
    public void setCyclic(boolean cyclic)
    {
        wvCardType.setCyclic(cyclic);
        wvBankName.setCyclic(cyclic);
    }

    public String getBankCardType()
    {
        StringBuffer sb = new StringBuffer();
        sb.append(bankNameList.get(wvBankName.getCurrentItem())).append(" - ").append(cardTypeList
                .get(wvCardType.getCurrentItem()));
        return sb.toString();
    }
}
