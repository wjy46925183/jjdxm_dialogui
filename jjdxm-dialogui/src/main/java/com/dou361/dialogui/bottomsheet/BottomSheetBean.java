package com.dou361.dialogui.bottomsheet;

import android.support.annotation.DrawableRes;

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
 * 创建日期：2016/10/31 23:05
 * <p>
 * 描 述：底部样式
 * <p>
 * <p>
 * 修订历史：
 * <p>
 * ========================================
 */
public class BottomSheetBean {
    public @DrawableRes  int icon;
    public String text;

    public BottomSheetBean(){

    }

    public BottomSheetBean(int icon, String text) {
        this.icon = icon;
        this.text = text;
    }
}
