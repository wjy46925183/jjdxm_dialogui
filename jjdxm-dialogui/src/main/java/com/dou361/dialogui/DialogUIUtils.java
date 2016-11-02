package com.dou361.dialogui;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatDialog;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

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
     * 弹出toast 默认白色背景可取消可点击
     *
     * @param context 上下文
     * @param msg     提示文本
     */
    public static BuildBean showToastTie(Context context, CharSequence msg) {
        return showToastTie(context, msg, true);
    }

    /**
     * 弹出toast 默认可取消可点击
     *
     * @param context   上下文
     * @param msg       提示文本
     * @param isWhiteBg true为白色背景false为灰色背景
     */
    public static BuildBean showToastTie(Context context, CharSequence msg, boolean isWhiteBg) {
        return showToastTie(context, msg, true, true, isWhiteBg);
    }

    /**
     * 弹出toast
     *
     * @param context          上下文
     * @param msg              提示文本
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param isWhiteBg        true为白色背景false为灰色背景
     */
    public static BuildBean showToastTie(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable, boolean isWhiteBg) {
        return DialogAssigner.getInstance().assignToastTie(context, msg, true, true, isWhiteBg);
    }

    /**
     * 横向加载框 默认白色背景可取消可点击
     *
     * @param context 上下文
     * @param msg     提示文本
     */
    public static BuildBean showLoadingHorizontal(Context context, CharSequence msg) {
        return showLoadingHorizontal(context, msg, true, true, true);
    }

    /**
     * 横向加载框 默认可取消可点击
     *
     * @param context   上下文
     * @param msg       提示文本
     * @param isWhiteBg true为白色背景false为灰色背景
     */
    public static BuildBean showLoadingHorizontal(Context context, CharSequence msg, boolean isWhiteBg) {
        return showLoadingHorizontal(context, msg, true, true, isWhiteBg);
    }

    /**
     * 横向加载框
     *
     * @param context          上下文
     * @param msg              提示文本
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param isWhiteBg        true为白色背景false为灰色背景
     */
    public static BuildBean showLoadingHorizontal(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable, boolean isWhiteBg) {
        return DialogAssigner.getInstance().assignLoadingHorizontal(context, msg, cancleable, outsideTouchable, isWhiteBg);
    }

    /**
     * md风格横向加载框 默认白色背景可取消可点击
     *
     * @param context 上下文
     * @param msg     提示文本
     */
    public static BuildBean showMdLoadingHorizontal(Context context, CharSequence msg) {
        return showMdLoadingHorizontal(context, msg, true, true, true);
    }

    /**
     * md风格横向加载框 默认可取消可点击
     *
     * @param context   上下文
     * @param msg       提示文本
     * @param isWhiteBg true为白色背景false为灰色背景
     */
    public static BuildBean showMdLoadingHorizontal(Context context, CharSequence msg, boolean isWhiteBg) {
        return showMdLoadingHorizontal(context, msg, true, true, isWhiteBg);
    }

    /**
     * md风格横向加载框
     *
     * @param context          上下文
     * @param msg              提示文本
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param isWhiteBg        true为白色背景false为灰色背景
     */
    public static BuildBean showMdLoadingHorizontal(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable, boolean isWhiteBg) {
        return DialogAssigner.getInstance().assignMdLoadingHorizontal(context, msg, cancleable, outsideTouchable, isWhiteBg);
    }

    /**
     * 竖向加载框  默认白色背景可取消可点击
     *
     * @param context 上下文
     * @param msg     提示文本
     */
    public static BuildBean showLoadingVertical(Context context, CharSequence msg) {
        return showLoadingVertical(context, msg, true, true, true);
    }

    /**
     * 竖向加载框 默认可取消可点击
     *
     * @param context   上下文
     * @param msg       提示文本
     * @param isWhiteBg true为白色背景false为灰色背景
     */
    public static BuildBean showLoadingVertical(Context context, CharSequence msg, boolean isWhiteBg) {
        return showLoadingVertical(context, msg, true, true, isWhiteBg);
    }

    /**
     * 竖向加载框
     *
     * @param context          上下文
     * @param msg              提示文本
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param isWhiteBg        true为白色背景false为灰色背景
     */
    public static BuildBean showLoadingVertical(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable, boolean isWhiteBg) {
        return DialogAssigner.getInstance().assignLoadingVertical(context, msg, cancleable, outsideTouchable, isWhiteBg);
    }

    /**
     * md风格竖向加载框  默认白色背景可取消可点击
     *
     * @param context 上下文
     * @param msg     提示文本
     */
    public static BuildBean showMdLoadingVertical(Context context, CharSequence msg) {
        return showMdLoadingVertical(context, msg, true, true, true);
    }

    /**
     * md风格竖向加载框 默认可取消可点击
     *
     * @param context   上下文
     * @param msg       提示文本
     * @param isWhiteBg true为白色背景false为灰色背景
     */
    public static BuildBean showMdLoadingVertical(Context context, CharSequence msg, boolean isWhiteBg) {
        return showMdLoadingVertical(context, msg, true, true, isWhiteBg);
    }

    /**
     * md风格竖向加载框
     *
     * @param context          上下文
     * @param msg              提示文本
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param isWhiteBg        true为白色背景false为灰色背景
     */
    public static BuildBean showMdLoadingVertical(Context context, CharSequence msg, boolean cancleable, boolean outsideTouchable, boolean isWhiteBg) {
        return DialogAssigner.getInstance().assignMdLoadingVertical(context, msg, cancleable, outsideTouchable, isWhiteBg);
    }

    /***
     * md风格弹出框 默认可取消可点击
     *
     * @param activity 所在activity
     * @param title    标题 不传则无标题
     * @param msg      消息
     * @param listener 事件监听
     * @return
     */
    public static BuildBean showMdAlert(Activity activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        return showMdAlert(activity, title, msg, true, true, listener);
    }

    /***
     * md风格弹出框
     *
     * @param activity         所在activity
     * @param title            标题 不传则无标题
     * @param msg              消息
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     * @return
     */
    public static BuildBean showMdAlert(Activity activity, CharSequence title, CharSequence msg, boolean cancleable, boolean outsideTouchable, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignMdAlert(activity, title, msg, cancleable, outsideTouchable, listener);
    }

    /**
     * md风格多选框  默认可取消可点击
     *
     * @param activity     所在activity
     * @param title        标题 不传则无标题
     * @param words        消息数组
     * @param checkedItems 默认选中项
     * @param listener     事件监听
     */
    public static BuildBean showMdMultiChoose(Activity activity, CharSequence title, CharSequence[] words, boolean[] checkedItems, DialogUIListener listener) {
        return showMdMultiChoose(activity, title, words, checkedItems, true, true, listener);
    }

    /***
     * md风格多选框
     *
     * @param activity         所在activity
     * @param title            标题 不传则无标题
     * @param words            消息数组
     * @param checkedItems     默认选中项
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     * @return
     */
    public static BuildBean showMdMultiChoose(Activity activity, CharSequence title, CharSequence[] words, boolean[] checkedItems, boolean cancleable, boolean outsideTouchable, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignMdMultiChoose(activity, title, words, checkedItems, cancleable, outsideTouchable, listener);
    }

    /**
     * 单选框  默认可取消可点击
     *
     * @param activity      所在activity
     * @param title         标题 不传则无标题
     * @param defaultChosen 默认选中项
     * @param words         消息数组
     * @param listener      事件监听
     */
    public static BuildBean showSingleChoose(Activity activity, CharSequence title, int defaultChosen, CharSequence[] words, DialogUIItemListener listener) {
        return showSingleChoose(activity, title, defaultChosen, words, true, true, listener);
    }

    /**
     * 单选框
     *
     * @param activity         所在activity
     * @param title            标题 不传则无标题
     * @param defaultChosen    默认选中项
     * @param words            消息数组
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     */
    public static BuildBean showSingleChoose(Activity activity, CharSequence title, int defaultChosen, CharSequence[] words, boolean cancleable, boolean outsideTouchable, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignSingleChoose(activity, title, defaultChosen, words, cancleable, outsideTouchable, listener);
    }

    /**
     * 提示弹出框 默认可取消可点击
     *
     * @param activity 所在activity
     * @param title    标题 不传则无标题
     * @param listener 事件监听
     */
    public static BuildBean showAlert(Activity activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        return showAlert(activity, title, msg, true, true, listener);
    }

    /**
     * 提示弹出框
     *
     * @param activity         所在activity
     * @param title            标题 不传则无标题
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     */
    public static BuildBean showAlert(Activity activity, CharSequence title, CharSequence msg, boolean cancleable, boolean outsideTouchable, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignAlert(activity, title, msg, cancleable, outsideTouchable, listener);
    }

    /**
     * 横向弹出框  默认可取消可点击
     *
     * @param activity 所在activity
     * @param title    标题 不传则无标题
     * @param msg      消息
     * @param listener 事件监听
     */
    public static BuildBean showAlertHorizontal(Context activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        return showAlertHorizontal(activity, title, msg, true, true, listener);
    }

    /**
     * 横向弹出框
     *
     * @param activity         所在activity
     * @param title            标题 不传则无标题
     * @param msg              消息
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     */
    public static BuildBean showAlertHorizontal(Context activity, CharSequence title, CharSequence msg, boolean cancleable, boolean outsideTouchable, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignAlertHorizontal(activity, title, msg, cancleable, outsideTouchable, listener);
    }

    /**
     * 竖向弹出框  默认可取消可点击
     *
     * @param activity 所在activity
     * @param title    标题 不传则无标题
     * @param msg      消息
     * @param listener 事件监听
     */
    public static BuildBean showAlertVertical(Context activity, CharSequence title, CharSequence msg, DialogUIListener listener) {
        return showAlertVertical(activity, title, msg, true, true, listener);
    }

    /**
     * 竖向弹出框
     *
     * @param activity         所在activity
     * @param title            标题 不传则无标题
     * @param msg              消息
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     */
    public static BuildBean showAlertVertical(Context activity, CharSequence title, CharSequence msg, boolean cancleable, boolean outsideTouchable, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignAlertVertical(activity, title, msg, cancleable, outsideTouchable, listener);
    }

    /**
     * 中间弹出列表 默认可取消可点击
     *
     * @param context  上下文
     * @param words    素组集合
     * @param listener 事件监听
     * @return
     */
    public static BuildBean showCenterSheet(Context context, List<? extends CharSequence> words, DialogUIItemListener listener) {
        return showCenterSheet(context, words, true, true, listener);
    }

    /***
     * 中间弹出列表
     *
     * @param context          上下文
     * @param words            素组集合
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     * @return
     */
    public static BuildBean showCenterSheet(Context context, List<? extends CharSequence> words, boolean cancleable, boolean outsideTouchable, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignCenterSheet(context, words, cancleable, outsideTouchable, listener);
    }

    /**
     * 带取消的底部弹出列表 默认可取消可点击
     *
     * @param context   上下文
     * @param words     素组集合
     * @param bottomTxt 底部按钮文本
     * @param listener  事件监听
     * @return
     */
    public static BuildBean showBottomSheetAndCancel(Context context, List<? extends CharSequence> words, CharSequence bottomTxt, DialogUIItemListener listener) {
        return showBottomSheetAndCancel(context, words, bottomTxt, true, true, listener);
    }

    /***
     * 带取消的底部弹出列表
     *
     * @param context          上下文
     * @param words            素组集合
     * @param bottomTxt        底部按钮文本
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     * @return
     */
    public static BuildBean showBottomSheetAndCancel(Context context, List<? extends CharSequence> words, CharSequence bottomTxt, boolean cancleable, boolean outsideTouchable, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignBottomSheetAndCancel(context, words, bottomTxt, cancleable, outsideTouchable, listener);
    }

    /**
     * 底部弹出列表 默认可取消可点击
     *
     * @param context  上下文
     * @param datas    集合需要BottomSheetBean对象
     * @param listener 事件监听
     * @return
     */
    public static BuildBean showBottomSheet(Activity context, List datas, DialogUIItemListener listener) {
        return showBottomSheet(context, datas, true, true, listener);
    }

    /***
     * 底部弹出列表
     *
     * @param context          上下文
     * @param datas            集合需要BottomSheetBean对象
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     * @return
     */
    public static BuildBean showBottomSheet(Activity context, List datas, boolean cancleable, boolean outsideTouchable, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignBottomSheet(context, datas, cancleable, outsideTouchable, listener);
    }

    /**
     * 输入框 默认可取消可点击
     *
     * @param context   上下文
     * @param title     标题
     * @param hint1     第一个文本框提示语
     * @param hint2     第二个文本框提示语
     * @param firstTxt  第一个按钮文本
     * @param secondTxt 第二个按钮文本
     * @param listener  事件监听
     * @return
     */
    public static BuildBean showAlertInput(Context context, CharSequence title, CharSequence hint1, CharSequence hint2, CharSequence firstTxt, CharSequence secondTxt, DialogUIListener listener) {
        return showAlertInput(context, title, hint1, hint2, firstTxt, secondTxt, true, true, listener);
    }

    /***
     * 输入框
     *
     * @param context          上下文
     * @param title            标题
     * @param hint1            第一个文本框提示语
     * @param hint2            第二个文本框提示语
     * @param firstTxt         第一个按钮文本
     * @param secondTxt        第二个按钮文本
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     * @return
     */
    public static BuildBean showAlertInput(Context context, CharSequence title, CharSequence hint1, CharSequence hint2, CharSequence firstTxt, CharSequence secondTxt, boolean cancleable, boolean outsideTouchable, DialogUIListener listener) {
        return DialogAssigner.getInstance().assignAlertInput(context, title, hint1, hint2, firstTxt, secondTxt, cancleable, outsideTouchable, listener);
    }

    /**
     * md风格竖向底部弹出列表 默认可取消可点击
     *
     * @param context   上下文
     * @param title     标题
     * @param datas     集合需要BottomSheetBean对象
     * @param bottomTxt 底部item文本
     * @param listener  事件监听
     * @return
     */
    public static BuildBean showMdBottomSheetVertical(Context context, CharSequence title, List datas, CharSequence bottomTxt, DialogUIItemListener listener) {
        return showMdBottomSheetVertical(context, title, datas, bottomTxt, true, true, listener);
    }

    /***
     * md风格竖向底部弹出列表
     *
     * @param context          上下文
     * @param title            标题
     * @param datas            集合需要BottomSheetBean对象
     * @param bottomTxt        底部item文本
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     * @return
     */
    public static BuildBean showMdBottomSheetVertical(Context context, CharSequence title, List datas, CharSequence bottomTxt, boolean cancleable, boolean outsideTouchable, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignMdBottomSheetVertical(context, title, datas, bottomTxt, cancleable, outsideTouchable, listener);
    }

    /**
     * md风格横向底部弹出列表 默认可取消可点击
     *
     * @param context          上下文
     * @param title            标题
     * @param datas            集合需要BottomSheetBean对象
     * @param bottomTxt        底部item文本
     * @param columnsNum       列数量
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     * @return
     */
    public static BuildBean showMdBottomSheetHorizontal(Context context, CharSequence title, List datas, CharSequence bottomTxt, int columnsNum, DialogUIItemListener listener) {
        return showMdBottomSheetHorizontal(context, title, datas, bottomTxt, columnsNum, true, true, listener);
    }

    /***
     * md风格横向底部弹出列表
     *
     * @param context          上下文
     * @param title            标题
     * @param datas            集合需要BottomSheetBean对象
     * @param bottomTxt        底部item文本
     * @param columnsNum       列数量
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @param listener         事件监听
     * @return
     */
    public static BuildBean showMdBottomSheetHorizontal(Context context, CharSequence title, List datas, CharSequence bottomTxt, int columnsNum, boolean cancleable, boolean outsideTouchable, DialogUIItemListener listener) {
        return DialogAssigner.getInstance().assignMdBottomSheetHorizontal(context, title, datas, bottomTxt, columnsNum, cancleable, outsideTouchable, listener);
    }

    /**
     * 自定义弹出框 默认居中可取消可点击
     *
     * @param context     上下问
     * @param contentView 自定义view
     * @return
     */
    public static BuildBean showCustomAlert(Context context, View contentView) {
        return showCustomAlert(context, contentView, Gravity.CENTER, true, true);
    }

    /**
     * 自定义弹出框 默认可取消可点击
     *
     * @param context     上下文
     * @param contentView 自定义view
     * @param gravity     显示window的位置例如Gravity.center
     * @return
     */
    public static BuildBean showCustomAlert(Context context, View contentView, int gravity) {
        return showCustomAlert(context, contentView, gravity, true, true);
    }

    /***
     * 自定义弹出框
     *
     * @param context          上下文
     * @param contentView      自定义view
     * @param gravity          显示window的位置例如Gravity.center
     * @param cancleable       true为可以取消false为不可取消
     * @param outsideTouchable true为可以点击空白区域false为不可点击
     * @return
     */
    public static BuildBean showCustomAlert(Context context, View contentView, int gravity, boolean cancleable, boolean outsideTouchable) {
        return DialogAssigner.getInstance().assignCustomAlert(context, contentView, gravity, cancleable, outsideTouchable);
    }


    /**
     * 短时间中下位置显示。线程安全，可以在非UI线程调用。
     */
    public static void showToastShort(final int resId) {
        showToastShort(getString(resId));
    }

    /**
     * 短时间中下位置显示。
     */
    public static void showToastShort(final String str) {
        showToast2Bottom(str, Toast.LENGTH_SHORT);
    }

    /**
     * 长时间中下位置显示。
     */
    public static void showToastLong(final int resId) {
        showToastLong(getString(resId));
    }

    /**
     * 长时间中下位置显示。
     */
    public static void showToastLong(final String str) {
        showToast2Bottom(str, Toast.LENGTH_LONG);
    }

    /**
     * 只定义一个Toast
     */
    private static Toast mToastBottom;

    /**
     * 对toast的简易封装。线程不安全，不可以在非UI线程调用。
     */
    private static void showToast2Bottom(String str, int showTime) {
        if (appContext == null) {
            throw new RuntimeException("DialogUIUtils not initialized!");
        }
        if (mToastBottom == null) {
            mToastBottom = Toast.makeText(appContext, str, showTime);
        } else {
            mToastBottom.setText(str);
        }
        mToastBottom.show();
    }

    /**
     * 短时间居中位置显示。
     */
    public static void showToastCenterShort(final int resId) {
        showToastCenterShort(getString(resId));
    }

    /**
     * 短时间居中位置显示。
     */
    public static void showToastCenterShort(final String str) {
        showToast2Center(str, Toast.LENGTH_SHORT);
    }

    /**
     * 长时间居中位置显示。
     */
    public static void showToastCenterLong(final int resId) {
        showToastCenterLong(getString(resId));
    }

    /**
     * 长时间居中位置显示。
     */
    public static void showToastCenterLong(final String str) {
        showToast2Center(str, Toast.LENGTH_LONG);
    }

    /**
     * 只定义一个Toast
     */
    private static Toast mToastCenter;

    /**
     * 对toast的简易封装。
     */
    private static void showToast2Center(String str, int showTime) {
        if (appContext == null) {
            throw new RuntimeException("DialogUIUtils not initialized!");
        }
        if (mToastCenter == null) {
            mToastCenter = Toast.makeText(appContext, str, showTime);
            mToastCenter.setGravity(Gravity.CENTER, 0, 0);
        } else {
            mToastCenter.show();
        }
    }

    /**
     * 获取文字
     */
    public static String getString(int resId) {
        return appContext.getResources().getString(resId);
    }

}
