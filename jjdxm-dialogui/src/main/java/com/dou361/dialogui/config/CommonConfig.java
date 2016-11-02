package com.dou361.dialogui.config;

import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;

import com.dou361.dialogui.R;

/**
 * ========================================
 * <p/>
 * 版 权：dou361.com 版权所有 （C） 2015
 * <p/>
 * 作 者：陈冠明
 * <p/>
 * 个人网站：http://www.dou361.com
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2016/11/1 15:13
 * <p/>
 * 描 述：公共配置
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class CommonConfig {

    @ColorRes
    public static int iosBtnColor = R.color.ios_btntext_blue;
    @ColorRes
    public static int lvItemTxtColor = R.color.text_item_33;
    @ColorRes
    public static int mdBtnColor = R.color.btn_alert;
    @ColorRes
    public static int titleTxtColor = R.color.text_title_11;
    @ColorRes
    public static int msgTxtColor = R.color.text_title_11;
    @ColorRes
    public static int inputTxtColor = R.color.text_input_44;

    @DimenRes
    public static int titleTxtSize = R.dimen.dialogui_title_txt_size;
    @DimenRes
    public static int btnTxtSize = R.dimen.dialogui_btn_txt_size;
    @DimenRes
    public static int msgTxtSize = R.dimen.dialogui_msg_txt_size;
    @DimenRes
    public static int itemTxtSize = R.dimen.dialogui_item_txt_size;
    @DimenRes
    public static int inputTxtSize = R.dimen.dialogui_input_txt_size;


    public static CharSequence dialogui_btnTxt1 = "确定";
    public static CharSequence dialogui_btnTxt2 = "取消";
    public static CharSequence dialogui_bottomTxt = "取消";


    public static final int TYPE_LOADING_HORIZONTAL = 1;
    public static final int TYPE_LOADING_VERTICAL = 2;
    public static final int TYPE_MD_ALERT = 3;
    public static final int TYPE_MD_MULTI_CHOOSE = 4;
    public static final int TYPE_SINGLE_CHOOSE = 5;
    public static final int TYPE_ALERT = 6;
    public static final int TYPE_ALERT_HORIZONTAL = 7;
    public static final int TYPE_ALERT_VERTICAL = 8;
    public static final int TYPE_BOTTOM_SHEET_CANCEL = 9;
    public static final int TYPE_CENTER_SHEET = 10;
    public static final int TYPE_ALERT_INPUT = 11;
    public static final int TYPE_BOTTOM_SHEET = 12;
    public static final int TYPE_BOTTOM_SHEET_VERTICAL = 13;
    public static final int TYPE_BOTTOM_SHEET_HORIZONTAL = 14;
    public static final int TYPE_CUSTOM_ALERT = 15;
    public static final int TYPE_TOAST_TIE = 16;
    public static final int TYPE_MD_LOADING_HORIZONTAL = 17;
    public static final int TYPE_MD_LOADING_VERTICAL = 18;


}
