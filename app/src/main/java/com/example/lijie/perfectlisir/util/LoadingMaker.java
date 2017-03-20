package com.example.lijie.perfectlisir.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;

/**
 * @Description
 * @Author MoseLin
 * @Date 2016/10/20.
 */

public class LoadingMaker
{
    @SuppressLint("StaticFieldLeak")
    private static LoadingDialog loading;
    public static LoadingDialog showProgressDialog(Context context) {
        return showProgressDialog(context, null, true, null);
    }
    public static LoadingDialog showProgressDialog(Context context, String message) {
        return showProgressDialog(context, message, true, null);
    }

    public static LoadingDialog showProgressDialog(Context context, String message, boolean cancelable) {
        return showProgressDialog(context,message, cancelable, null);
    }

    private static LoadingDialog showProgressDialog(Context context,
                                                    String message, boolean cancelable, DialogInterface.OnDismissListener listener) {
        if (loading == null) {
            crateDialog(context);
        } else if (loading.getContext() != context) {
            dismissProgressDialog();
            crateDialog(context);
        }

        loading.setCanceledOnTouchOutside(cancelable);
        loading.setListener(listener);
        loading.setMessage(message);
        loading.show();

        return loading;
    }

    private static void crateDialog(Context context)
    {
        try
        {
            loading = Loading.class.getConstructor(Context.class).newInstance(context);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void dismissProgressDialog() {
        if (null == loading) {
            return;
        }
        if (loading.isShowing()) {
            loading.dismiss();
            loading = null;

        }

    }

    public static void setOnCancelListener(DialogInterface.OnDismissListener listener) {
        if (null != loading) {
            loading.setListener(listener);
        }
    }
}
