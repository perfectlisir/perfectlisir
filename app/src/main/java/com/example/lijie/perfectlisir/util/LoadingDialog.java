package com.example.lijie.perfectlisir.util;

import android.content.Context;
import android.widget.TextView;

/**
 * @Description
 * @Author MoseLin
 * @Date 2016/10/20.
 */

public abstract class LoadingDialog extends DialogViewHolder
{
    public LoadingDialog(Context context)
    {
        super(context);
    }

    public void setMessage(String message)
    {
        if (getMsgView() != null)
            getMsgView().setText(message);
    }
    protected abstract TextView getMsgView();
}
