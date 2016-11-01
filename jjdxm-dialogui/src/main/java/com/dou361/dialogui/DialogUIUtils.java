package com.dou361.dialogui;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatDialog;
import android.view.View;

import com.dou361.dialogui.config.BuildBean;
import com.dou361.dialogui.listener.DialogUIItemListener;
import com.dou361.dialogui.listener.DialogUIListener;

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

    public static Context appContext;

    public static void init(Context appContext) {
        DialogUIUtils.appContext = appContext;
    }

    /**
     * 关闭弹出框
     */
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

    /**
     * 横向加载框
     */
    public static BuildBean showLoadingHorizontal(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable) {
        return DialogAssigner.getInstance().assignLoadingHorizontal(context, msg, cancleable, outsideTouchable);
    }

    /**
     * 竖向加载框
     */
    public static BuildBean showLoadingVertical(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable) {
        return DialogAssigner.getInstance().assignLoadingVertical(context, msg, cancleable, outsideTouchable);
    }

    /**
     * md风格弹出框
     */
    public static BuildBean showMdAlert(Activity activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignMdAlert(activity, title, msg, listener);
    }

    /**
     * md风格多选框
     */
    public static BuildBean showMdMultiChoose(Activity context, CharSequence title, CharSequence[] words, boolean[] checkedItems, DialogUIListener btnListener) {
        return DialogAssigner.getInstance().assignMdMultiChoose(context, title, words, checkedItems, btnListener);
    }

    /**
     * 单选框
     */
    public static BuildBean showSingleChoose(Activity context, CharSequence title, int defaultChosen, CharSequence[] words, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignSingleChoose(context, title, defaultChosen, words, listener);
    }

    /**
     * 提示弹出框
     */
    public static BuildBean showAlert(Context activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignAlert(activity, title, msg, listener);
    }

    /**
     * 横向弹出框
     */
    public static BuildBean showAlertHorizontal(Context activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignAlertHorizontal(activity, title, msg, listener);
    }

    /**
     * 竖向弹出框
     */
    public static BuildBean showAlertVertical(Context activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignAlertVertical(activity, title, msg, listener);
    }

    /**
     * 中间弹出列表
     */
    public static BuildBean showCenterSheet(Context context, List<? extends CharSequence> words, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignCenterSheet(context, words, listener);
    }

    /**
     * 带取消的底部弹出列表
     */
    public static BuildBean showBottomSheetAndCancel(Context context, List<? extends CharSequence> words, CharSequence bottomTxt, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignBottomSheetAndCancel(context, words, bottomTxt, listener);
    }

    /**
     * 底部弹出列表
     */
    public static BuildBean showBottomSheet(Activity context, View contentView) {
        return DialogAssigner.getInstance().assignBottomSheet(context, contentView);
    }

    /**
     * 输入框
     */
    public static BuildBean showAlertInput(Context context, CharSequence title, CharSequence hint1, CharSequence hint2, CharSequence firstTxt, CharSequence secondTxt, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignAlertInput(context, title, hint1, hint2, firstTxt, secondTxt, listener);
    }

    /**
     * md风格竖向底部弹出列表
     */
    public static BuildBean showMdBottomSheetVertical(Context context, CharSequence title, List datas, CharSequence bottomTxt, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignMdBottomSheetVertical(context, title, datas, bottomTxt, listener);
    }

    /**
     * md风格横向底部弹出列表
     */
    public static BuildBean showMdBottomSheetHorizontal(Context context, CharSequence title, List datas, CharSequence bottomTxt, int columnsNum, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignMdBottomSheetHorizontal(context, title, datas, bottomTxt, columnsNum, listener);
    }

    /**
     * 自定义弹出框
     */
    public static BuildBean showCustomAlert(Context context, View contentView, int gravity) {
        return DialogAssigner.getInstance().assignCustomAlert(context, contentView, gravity);
    }

}
