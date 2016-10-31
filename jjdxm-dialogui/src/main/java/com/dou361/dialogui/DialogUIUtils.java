package com.dou361.dialogui;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatDialog;
import android.view.View;

import com.dou361.dialogui.config.ConfigBean;
import com.dou361.dialogui.interfaces.DialogUIListener;
import com.dou361.dialogui.interfaces.DialogUIItemListener;

import java.util.List;

/**
 * ========================================
 * <p>
 * 版 权：dou361.com 版权所有 （C） 2015
 * <p>
 * 作 者：陈冠明
 * <p>
 * 个人网站：http://www.dou361.com
 * <p>
 * 版 本：1.0
 * <p>
 * 创建日期：2016/10/31 22:17
 * <p>
 * 描 述：一个对外UI管理容器工具类
 * <p>
 * <p>
 * 修订历史：
 * <p>
 * ========================================
 */
public class DialogUIUtils {


    public static Context context;

    private static int singleChosen;


    public static void init(Context context) {
        DialogUIUtils.context = context;
    }

    public static void dismiss(DialogInterface... dialogs) {
        if (dialogs != null && dialogs.length > 0) {
            for (DialogInterface dialog : dialogs) {
                if (dialog instanceof Dialog) {
                    Dialog dialog1 = (Dialog) dialog;
                    if (dialog1.isShowing()) {
                        dialog1.dismiss();
                    }
                } else if (dialog instanceof AppCompatDialog) {
                    AppCompatDialog dialog2 = (AppCompatDialog) dialog;
                    if (dialog2.isShowing()) {
                        dialog2.dismiss();
                    }
                }
            }

        }
    }

    public static ConfigBean buildLoading(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable) {
        return DialogAssigner.getInstance().assignLoading(context, msg, cancleable, outsideTouchable);
    }

    public static ConfigBean buildMdLoading(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable) {
        return DialogAssigner.getInstance().assignMdLoading(context, msg, cancleable, outsideTouchable);
    }


    public static ConfigBean buildMdAlert(Activity activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignMdAlert(activity, title, msg, listener);
    }


    public static ConfigBean buildMdSingleChoose(Activity context, CharSequence title, int defaultChosen, CharSequence[] words, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignMdSingleChoose(context, title, defaultChosen, words, listener);
    }


    public static ConfigBean buildMdMultiChoose(Activity context, CharSequence title, CharSequence[] words, boolean[] checkedItems, DialogUIListener btnListener) {
        return DialogAssigner.getInstance().assignMdMultiChoose(context, title, words, checkedItems, btnListener);
    }


    public static ConfigBean buildIosAlert(Context activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignIosAlert(activity, title, msg, listener);
    }


    public static ConfigBean buildIosAlertVertical(Context activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignIosAlertVertical(activity, title, msg, listener);
    }


    public static ConfigBean buildIosSingleChoose(Context context, List<? extends CharSequence> words, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignIosSingleChoose(context, words, listener);
    }


    public static ConfigBean buildBottomItemDialog(Context context, List<? extends CharSequence> words, CharSequence bottomTxt, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignBottomItemDialog(context, words, bottomTxt, listener);
    }


    public static ConfigBean buildNormalInput(Context context, CharSequence title, CharSequence hint1, CharSequence hint2, CharSequence firstTxt, CharSequence secondTxt, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignNormalInput(context, title, hint1, hint2, firstTxt, secondTxt, listener);
    }

    public static ConfigBean buildCustom(Context context, View contentView, int gravity) {
        return DialogAssigner.getInstance().assignCustom(context, contentView, gravity);
    }

    public static ConfigBean buildCustomBottomSheet(Activity context, View contentView) {
        return DialogAssigner.getInstance().assignCustomBottomSheet(context, contentView);
    }

    public static ConfigBean buildBottomSheetLv(Context context, CharSequence title, List datas, CharSequence bottomTxt, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignBottomSheetLv(context, title, datas, bottomTxt, listener);
    }

    public static ConfigBean buildBottomSheetGv(Context context, CharSequence title, List datas, CharSequence bottomTxt, int columnsNum, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignBottomSheetGv(context, title, datas, bottomTxt, columnsNum, listener);
    }

}
