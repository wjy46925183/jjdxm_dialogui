package com.dou361.dialogui.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.dou361.dialogui.R;
import com.dou361.dialogui.DialogUIUtils;
import com.dou361.dialogui.config.BuildBean;

/**
 * Created by Administrator on 2016/10/9 0009.
 */
public class BottomSheetCancelHolder extends SuperHolder {
    public ListView lv;
    protected Button btnBottom;

    public BottomSheetCancelHolder(Context context) {
        super(context);
    }

    @Override
    protected void findViews() {
        lv = (ListView) rootView.findViewById(R.id.lv);
        btnBottom = (Button) rootView.findViewById(R.id.btn_bottom);
    }

    @Override
    protected int setLayoutRes() {
        return R.layout.dialogui_holder_bottom_cancel;
    }

    @Override
    public void assingDatasAndEvents(final Context context, final BuildBean bean) {
        if (TextUtils.isEmpty(bean.bottomTxt)){
            btnBottom.setVisibility(View.GONE);
        }else {
            btnBottom.setVisibility(View.VISIBLE);
            btnBottom.setText(bean.bottomTxt);
            btnBottom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DialogUIUtils.dismiss(bean.dialog,bean.alertDialog);
                    bean.itemListener.onBottomBtnClick();

                }
            });
        }


        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return bean.wordsIos.size();
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(final int position, View convertView, ViewGroup parent) {

                RelativeLayout root = (RelativeLayout) View.inflate(context,R.layout.dialogui_item_btn_bottomalert,null);
                Button view = (Button) root.findViewById(R.id.dialogui_btn);
                if (getCount() >=2){
                    if (position ==0){
                        view.setBackgroundResource(R.drawable.dialogui_selector_btn_all_top);
                    }else if (position == getCount() -1){
                        view.setBackgroundResource(R.drawable.dialogui_selector_btn_all_bottom);
                    }else {
                        view.setBackgroundResource(R.drawable.dialogui_selector_btn_no_corner);
                    }

                }else {
                    view.setBackgroundResource(R.drawable.dialogui_selector_btn_all);
                }

                view.setText(bean.wordsIos.get(position));
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        DialogUIUtils.dismiss(bean.dialog,bean.alertDialog);
                        bean.itemListener.onItemClick(bean.wordsIos.get(position),position);

                    }
                });

                return root;
            }
        };

        lv.setAdapter(adapter);
    }


}
