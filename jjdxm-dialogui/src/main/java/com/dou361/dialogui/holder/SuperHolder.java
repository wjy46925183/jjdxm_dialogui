package com.dou361.dialogui.holder;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.View;

import com.dou361.dialogui.config.BuildBean;


/**
 * Created by Administrator on 2016/4/15 0015.
 */
public abstract class SuperHolder {
    public View rootView;

    public SuperHolder(Context context) {
        rootView = View.inflate(context, setLayoutRes(), null);
        findViews();
    }

    protected abstract void findViews();

    protected abstract
    @LayoutRes
    int setLayoutRes();

    /**
     * 一般情况下，实现这个方法就足够了
     *
     * @param context
     * @param bean
     */
    public abstract void assingDatasAndEvents(Context context, BuildBean bean);


}
