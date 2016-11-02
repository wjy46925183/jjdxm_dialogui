package com.dou361.dialogui.bottomsheet;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dou361.dialogui.R;
import com.dou361.dialogui.adapter.SuperLvHolder;

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
 * 描 述：底部样式listview
 * <p>
 * <p>
 * 修订历史：
 * <p>
 * ========================================
 */
public class BottomCenterVerticalHolder extends SuperLvHolder<BottomSheetBean> {
    public ImageView ivIcon;
    public TextView mTextView;

    public BottomCenterVerticalHolder(Context context) {
        super(context);
        ivIcon = (ImageView) rootView.findViewById(R.id.iv_icon);
        mTextView = (TextView) rootView.findViewById(R.id.dialogui_tv_msg);
    }

    @Override
    protected int setLayoutRes() {
        return R.layout.dialogui_item_bottomsheet_center_vertical;
    }

    @Override
    public void assingDatasAndEvents(Context context, BottomSheetBean bean) {
        if (bean.icon <= 0) {
            ivIcon.setVisibility(View.GONE);
        } else {
            ivIcon.setImageResource(bean.icon);
            ivIcon.setVisibility(View.VISIBLE);
        }
        mTextView.setText(bean.text);
    }
}
