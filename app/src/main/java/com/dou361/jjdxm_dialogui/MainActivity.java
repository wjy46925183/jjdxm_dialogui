package com.dou361.jjdxm_dialogui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.dou361.dialogui.DialogUIUtils;
import com.dou361.dialogui.adapter.SuperRcvAdapter;
import com.dou361.dialogui.adapter.SuperRcvHolder;
import com.dou361.dialogui.bottomsheet.BottomSheetBean;
import com.dou361.dialogui.listener.DialogUIItemListener;
import com.dou361.dialogui.listener.DialogUIListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    Activity activity;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        activity = this;
        context = getApplication();
        DialogUIUtils.init(context);
    }

    String msg = "别总是来日方长，这世上挥手之间的都是人走茶凉。";

    @OnClick({R.id.btn_toast, R.id.btn_loading_vertical, R.id.btn_loading_horizontal, R.id.btn_md_alert, R.id.btn_tie_alert, R.id.btn_alert_horizontal,
            R.id.btn_alert_vertical, R.id.btn_bottom_sheet_cancel, R.id.btn_center_sheet, R.id.btn_alert_input,
            R.id.btn_alert_multichoose, R.id.btn_alert_singlechoose, R.id.btn_bottom_sheet, R.id.btn_md_bottom_vertical, R.id.btn_md_bottom_horizontal, R.id.btn_custom_alert})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_custom_alert:
                String[] words3 = new String[]{"1", "2", "3"};
                List<String> datas = Arrays.asList(words3);
                RecyclerView recyclerView = new RecyclerView(this);
                recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
                SuperRcvAdapter adapter = new SuperRcvAdapter(this) {
                    @Override
                    protected SuperRcvHolder generateCoustomViewHolder(int viewType) {

                        return new SuperRcvHolder<String>(inflate(R.layout.holder_item_text)) {

                            Button mButton;

                            @Override
                            public void assignDatasAndEvents(Activity context, final String data) {
                                if (mButton == null) {
                                    mButton = (Button) itemView.findViewById(R.id.btnee);
                                }
                                mButton.setText(data);
                                mButton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        showToast(data);
                                    }
                                });
                            }
                        };
                    }
                };
                recyclerView.setAdapter(adapter);
                adapter.addAll(datas);
                DialogUIUtils.showCustomAlert(this, recyclerView).show();
                break;
            case R.id.btn_toast:
                DialogUIUtils.showToastTie(this, msg).show();
                break;
            case R.id.btn_loading_vertical:
                DialogUIUtils.showLoadingVertical(this, "加载中...").show();
                break;
            case R.id.btn_loading_horizontal:
                DialogUIUtils.showLoadingHorizontal(this, "加载中...").show();
                break;
            case R.id.btn_md_alert:
                DialogUIUtils.showMdAlert(activity, "标题", msg, new DialogUIListener() {
                    @Override
                    public void onPositive() {
                        showToast("onPositive");
                    }

                    @Override
                    public void onNegative() {
                        showToast("onNegative");
                    }

                    @Override
                    public void onNeutral() {
                        showToast("onNeutral");
                    }

                }).show();
                break;
            case R.id.btn_tie_alert:
                DialogUIUtils.showAlert(activity, "标题", msg, new DialogUIListener() {
                    @Override
                    public void onPositive() {
                        showToast("onPositive");
                    }

                    @Override
                    public void onNegative() {
                        showToast("onNegative");
                    }

                    @Override
                    public void onNeutral() {
                        showToast("onNeutral");
                    }

                }).show();
                break;
            case R.id.btn_alert_horizontal:
                DialogUIUtils.showAlertHorizontal(activity, "标题", msg, new DialogUIListener() {
                    @Override
                    public void onPositive() {
                        showToast("onPositive");
                    }

                    @Override
                    public void onNegative() {
                        showToast("onNegative");
                    }

                    @Override
                    public void onNeutral() {
                        showToast("onNeutral");
                    }

                }).show();
                break;
            case R.id.btn_alert_vertical:
                DialogUIUtils.showAlertVertical(this, "标题", msg, new DialogUIListener() {
                    @Override
                    public void onPositive() {
                        showToast("onPositive");
                    }

                    @Override
                    public void onNegative() {
                        showToast("onNegative");
                    }

                    @Override
                    public void onNeutral() {
                        showToast("onNeutral");
                    }

                }).show();
                break;
            case R.id.btn_bottom_sheet_cancel: {
                final List<String> strings = new ArrayList<>();
                strings.add("1");
                strings.add("2");
                strings.add("3");
                DialogUIUtils.showBottomSheetAndCancel(activity, strings, "取消", new DialogUIItemListener() {
                    @Override
                    public void onItemClick(CharSequence text, int position) {
                        showToast(text);
                    }

                    @Override
                    public void onBottomBtnClick() {
                        showToast("onItemClick");
                    }
                }).show();
            }
            break;
            case R.id.btn_center_sheet:
                final List<String> strings = new ArrayList<>();
                strings.add("1");
                strings.add("2");
                strings.add("3");
                DialogUIUtils.showCenterSheet(activity, strings, new DialogUIItemListener() {
                    @Override
                    public void onItemClick(CharSequence text, int position) {
                        showToast(text);
                    }

                    @Override
                    public void onBottomBtnClick() {
                        showToast("onItemClick");
                    }
                }).show();

                break;
            case R.id.btn_alert_input:
                DialogUIUtils.showAlertInput(activity, "登录", "请输入用户名", "请输入密码", "登录", "取消", new DialogUIListener() {
                    @Override
                    public void onPositive() {

                    }

                    @Override
                    public void onNegative() {

                    }

                    @Override
                    public void onGetInput(CharSequence input1, CharSequence input2) {
                        super.onGetInput(input1, input2);
                        showToast("input1:" + input1 + "--input2:" + input2);
                    }
                }).show();
                break;
            case R.id.btn_alert_multichoose:
                String[] words = new String[]{"1", "2", "3"};
                boolean[] choseDefault = new boolean[]{false, false, false};
                DialogUIUtils.showMdMultiChoose(activity, "标题", words, choseDefault, new DialogUIListener() {
                    @Override
                    public void onPositive() {

                    }

                    @Override
                    public void onNegative() {

                    }
                }).show();
                break;
            case R.id.btn_alert_singlechoose:
                String[] words2 = new String[]{"1", "2", "3"};
                DialogUIUtils.showSingleChoose(activity, "单选", 0, words2, new DialogUIItemListener() {
                    @Override
                    public void onItemClick(CharSequence text, int position) {
                        showToast(text + "--" + position);
                    }
                }).show();
                break;
            case R.id.btn_bottom_sheet:
                List<BottomSheetBean> datass = new ArrayList<>();
                datass.add(new BottomSheetBean(0, "1"));
                datass.add(new BottomSheetBean(0, "2"));
                datass.add(new BottomSheetBean(0, "3"));
                DialogUIUtils.showBottomSheet(this, datass, new DialogUIItemListener() {
                    @Override
                    public void onItemClick(CharSequence text, int position) {

                    }
                }).show();//不好建立回
                break;
            case R.id.btn_md_bottom_vertical:
                List<BottomSheetBean> datas2 = new ArrayList<>();
                datas2.add(new BottomSheetBean(0, "1"));
                datas2.add(new BottomSheetBean(0, "2"));
                datas2.add(new BottomSheetBean(0, "3"));
                datas2.add(new BottomSheetBean(0, "4"));
                datas2.add(new BottomSheetBean(0, "5"));
                datas2.add(new BottomSheetBean(0, "6"));
                DialogUIUtils.showMdBottomSheetVertical(activity, "标题", datas2, "this is cancle button", new DialogUIItemListener() {
                    @Override
                    public void onItemClick(CharSequence text, int position) {
                        showToast(text + "---" + position);
                    }
                }).show();
                break;
            case R.id.btn_md_bottom_horizontal:
                List<BottomSheetBean> datas3 = new ArrayList<>();
                datas3.add(new BottomSheetBean(0, "1"));
                datas3.add(new BottomSheetBean(0, "2"));
                datas3.add(new BottomSheetBean(0, "3"));
                datas3.add(new BottomSheetBean(0, "4"));
                datas3.add(new BottomSheetBean(0, "5"));
                datas3.add(new BottomSheetBean(0, "6"));
                DialogUIUtils.showMdBottomSheetHorizontal(activity, "标题", datas3, "this is cancle button", 3, new DialogUIItemListener() {
                    @Override
                    public void onItemClick(CharSequence text, int position) {
                        showToast(text + "---" + position);
                    }
                }).show();
                break;


        }
    }


    public void showToast(CharSequence msg) {
        DialogUIUtils.showToastLong(msg.toString());
    }
}
