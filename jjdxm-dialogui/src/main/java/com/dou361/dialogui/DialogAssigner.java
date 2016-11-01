package com.dou361.dialogui;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.dou361.dialogui.config.BuildBean;
import com.dou361.dialogui.config.CommonConfig;
import com.dou361.dialogui.listener.Assignable;
import com.dou361.dialogui.listener.DialogUIItemListener;
import com.dou361.dialogui.listener.DialogUIListener;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9 0009.
 */
public class DialogAssigner implements Assignable {

    private static DialogAssigner instance;

    private DialogAssigner() {

    }

    public static DialogAssigner getInstance() {
        if (instance == null) {
            instance = new DialogAssigner();
        }
        return instance;
    }


    @Override
    public BuildBean assignLoadingHorizontal(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.msg = msg;
        bean.type = CommonConfig.TYPE_LOADING_HORIZONTAL;
        return bean;
    }

    @Override
    public BuildBean assignMdAlert(Activity activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = activity;
        bean.msg = msg;
        bean.title = title;
        bean.listener = listener;
        bean.type = CommonConfig.TYPE_MD_ALERT;
        bean.btn1Color = CommonConfig.mdBtnColor;
        bean.btn2Color = CommonConfig.mdBtnColor;
        bean.btn3Color = CommonConfig.mdBtnColor;
        return bean;
    }

    @Override
    public BuildBean assignSingleChoose(Activity context, CharSequence title, int defaultChosen, CharSequence[] words, DialogUIItemListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.title = title;
        bean.itemListener = listener;
        bean.wordsMd = words;
        bean.type = CommonConfig.TYPE_SINGLE_CHOOSE;
        bean.defaultChosen = defaultChosen;
        bean.btn1Color = CommonConfig.mdBtnColor;
        bean.btn2Color = CommonConfig.mdBtnColor;
        bean.btn3Color = CommonConfig.mdBtnColor;
        return bean;
    }

    @Override
    public BuildBean assignMdMultiChoose(Activity context, CharSequence title, CharSequence[] words, boolean[] checkedItems, DialogUIListener btnListener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.msg = title;
        bean.title = title;
        bean.listener = btnListener;
        bean.wordsMd = words;
        bean.checkedItems = checkedItems;
        bean.type = CommonConfig.TYPE_MD_MULTI_CHOOSE;
        bean.btn1Color = CommonConfig.mdBtnColor;
        bean.btn2Color = CommonConfig.mdBtnColor;
        bean.btn3Color = CommonConfig.mdBtnColor;
        return bean;
    }

    @Override
    public BuildBean assignAlert(Context activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = activity;
        bean.msg = msg;
        bean.title = title;
        bean.text2 = "";
        bean.listener = listener;
        bean.type = CommonConfig.TYPE_ALERT;
        return bean;
    }

    @Override
    public BuildBean assignAlertHorizontal(Context activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = activity;
        bean.msg = msg;
        bean.title = title;
        bean.listener = listener;
        bean.type = CommonConfig.TYPE_ALERT_HORIZONTAL;
        return bean;
    }

    @Override
    public BuildBean assignAlertVertical(Context activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = activity;
        bean.msg = msg;
        bean.title = title;
        bean.listener = listener;
        bean.type = CommonConfig.TYPE_ALERT_VERTICAL;
        return bean;
    }

    @Override
    public BuildBean assignCenterSheet(Context context, List<? extends CharSequence> words, DialogUIItemListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.itemListener = listener;
        bean.wordsIos = words;
        bean.type = CommonConfig.TYPE_CENTER_SHEET;

        return bean;
    }

    @Override
    public BuildBean assignBottomSheetAndCancel(Context context, List<? extends CharSequence> words, CharSequence bottomTxt, DialogUIItemListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.itemListener = listener;
        bean.wordsIos = words;
        bean.type = CommonConfig.TYPE_BOTTOM_SHEET_CANCEL;
        return bean;
    }

    @Override
    public BuildBean assignAlertInput(Context context, CharSequence title, CharSequence hint1, CharSequence hint2,
                                      CharSequence firstTxt, CharSequence secondTxt, DialogUIListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.listener = listener;
        bean.title = title;
        bean.hint1 = hint1;
        bean.hint2 = hint2;
        bean.text1 = firstTxt;
        bean.text2 = secondTxt;
        bean.type = CommonConfig.TYPE_ALERT_INPUT;
        return bean;
    }

    @Override
    public BuildBean assignCustomAlert(Context context, View contentView, int gravity) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.customView = contentView;
        bean.gravity = gravity;
        bean.type = CommonConfig.TYPE_CUSTOM_ALERT;
        return bean;
    }

    @Override
    public BuildBean assignBottomSheet(Activity context, View contentView) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.customView = contentView;
        bean.type = CommonConfig.TYPE_BOTTOM_SHEET;
        return bean;
    }

    @Override
    public BuildBean assignLoadingVertical(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.msg = msg;
        bean.type = CommonConfig.TYPE_LOADING_VERTICAL;

        return bean;
    }

    @Override
    public BuildBean assignMdBottomSheetVertical(Context context, CharSequence title, List datas, CharSequence bottomTxt, DialogUIItemListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.title = title;
        bean.lvDatas = datas;
        bean.bottomTxt = bottomTxt;
        bean.itemListener = listener;
        bean.type = CommonConfig.TYPE_BOTTOM_SHEET_VERTICAL;
        return bean;
    }

    @Override
    public BuildBean assignMdBottomSheetHorizontal(Context context, CharSequence title, List datas, CharSequence bottomTxt, int columnsNum, DialogUIItemListener listener) {
        BuildBean bean = new BuildBean();
        bean.context = context;
        bean.title = title;
        bean.lvDatas = datas;
        bean.bottomTxt = bottomTxt;
        bean.itemListener = listener;
        bean.gridColumns = columnsNum;
        bean.type = CommonConfig.TYPE_BOTTOM_SHEET_HORIZONTAL;
        return bean;
    }


}
