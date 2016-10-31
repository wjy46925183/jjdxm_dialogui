package com.dou361.dialogui.interfaces;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.dou361.dialogui.config.ConfigBean;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
public interface Assignable {

    ConfigBean assignMdLoading(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable);

    ConfigBean assignMdAlert(Activity activity, CharSequence title, CharSequence msg, final DialogUIListener listener);

    ConfigBean assignMdSingleChoose(Activity context, CharSequence title, final int defaultChosen, final CharSequence[] words,
                                    final DialogUIItemListener listener);

    ConfigBean assignMdMultiChoose(Activity context, CharSequence title, final CharSequence[] words, final boolean[] checkedItems,
                                   final DialogUIListener btnListener);

    ConfigBean assignIosAlert(Context activity, CharSequence title, CharSequence msg, final DialogUIListener listener);

    ConfigBean assignIosAlertVertical(Context activity, CharSequence title, CharSequence msg, final DialogUIListener listener);

    ConfigBean assignIosSingleChoose(Context context, List<? extends CharSequence> words, final DialogUIItemListener listener);

    ConfigBean assignBottomItemDialog(Context context, List<? extends CharSequence> words, CharSequence bottomTxt, final DialogUIItemListener listener);


    ConfigBean assignNormalInput(Context context, CharSequence title, CharSequence hint1, CharSequence hint2,
                                 CharSequence firstTxt, CharSequence secondTxt, final DialogUIListener listener);

    ConfigBean assignCustom(Context context, View contentView, int gravity);

    ConfigBean assignCustomBottomSheet(Activity context, View contentView);


    ConfigBean assignLoading(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable);


    ConfigBean assignBottomSheetLv(Context context, CharSequence title, List datas, CharSequence bottomTxt, DialogUIItemListener listener);

    ConfigBean assignBottomSheetGv(Context context, CharSequence title, List datas, CharSequence bottomTxt, int columnsNum, DialogUIItemListener listener);


}
