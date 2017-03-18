package com.example.lijie.perfectlisir.pickerview.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.elmsc.buyer.third.pickerview.adapter.ArrayWheelAdapter;
import com.elmsc.buyer.third.pickerview.lib.WheelView;
import com.elmsc.buyer.third.pickerview.listener.OnItemSelectedListener;

import java.util.ArrayList;

/**
 * Created by Moselin on 2016/11/21.
 */

public class AddressOptions<T>
{
    private LinearLayout layout;
    private ArrayList<WheelView> optionViews;

    private ArrayList<ArrayList<T>> mOptions;


    public View getView()
    {
        return layout;
    }

    public void setView(LinearLayout layout)
    {
        this.layout = layout;
    }

    public AddressOptions(LinearLayout layout)
    {
        super();
        this.layout = layout;
        setView(layout);
    }

    public void setPicker(ArrayList<T>... options)
    {
        mOptions = new ArrayList<>();
        optionViews = new ArrayList<>();
        for (int i = 0; i < options.length; i++)
        {
            mOptions.add(options[i]);
            WheelView wheelView = new WheelView(layout.getContext());
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            params.weight = 1;
            wheelView.setLayoutParams(params);
            ArrayWheelAdapter adapter = new ArrayWheelAdapter(options[i]);
            wheelView.setAdapter(adapter);
            wheelView.setCurrentItem(0);
            wheelView.setCyclic(false);
            layout.addView(wheelView);
            optionViews.add(wheelView);
        }

    }

    public void setOnItemSelectedListener(final OnItemSelectedListener... listeners)
    {
        if (listeners.length > optionViews.size())
        {
            throw new ArrayIndexOutOfBoundsException("监听器数量超过了view的数量了");
        }
        for (int i = 0; i < listeners.length; i++)
        {
            WheelView wheelView = optionViews.get(i);
            wheelView.setOnItemSelectedListener(listeners[i]);
        }
    }

    public void notifyDataChange(ArrayList<T>... options)
    {
        if (options.length > optionViews.size())
        {
            throw new ArrayIndexOutOfBoundsException("数据超过了view的数量了");
        }
        for (int i = 0; i < options.length; i++)
        {
            if (options[i] != null && options[i].size() > 0)
            {
                ArrayWheelAdapter adapter = new ArrayWheelAdapter(options[i]);
                WheelView wheelView = optionViews.get(i);
                wheelView.setAdapter(adapter);
                wheelView.setCurrentItem(0);
                layout.removeViewAt(i);
                layout.addView(wheelView,i);
            }
        }
    }

    public void setCurrentItems(int... option)
    {
        if (option.length > optionViews.size())
        {
            throw new ArrayIndexOutOfBoundsException("位置超过了view的数量了");
        }
        for (int i = 0; i < option.length; i++)
        {
            if (option[i] > -1)
                optionViews.get(i).setCurrentItem(option[i]);
        }
    }
}
