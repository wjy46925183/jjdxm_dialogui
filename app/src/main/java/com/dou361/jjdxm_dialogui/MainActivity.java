package com.dou361.jjdxm_dialogui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dou361.dialogui.DialogUIUtils;
import com.dou361.dialogui.adapter.SuperRcvAdapter;
import com.dou361.dialogui.adapter.SuperRcvHolder;
import com.dou361.dialogui.bottomsheet.BottomSheetBean;
import com.dou361.dialogui.listener.DialogUIItemListener;
import com.dou361.dialogui.listener.DialogUIListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.btn_loading_vertical)
    Button btnCommonProgress;
    @Bind(R.id.btn_loading_horizontal)
    Button btnContextProgress;
    @Bind(R.id.btn_md_alert)
    Button btnMaterialAlert;
    @Bind(R.id.btn_alert_horizontal)
    Button btnIosAlert;
    @Bind(R.id.btn_bottom_sheet_cancel)
    Button btnIosBottomSheet;
    @Bind(R.id.btn_center_sheet)
    Button btnIosCenterList;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    Activity activity;
    Context context;
    @Bind(R.id.btn_alert_vertical)
    Button btnIosAlertVertical;
    @Bind(R.id.btn_alert_input)
    Button btnIosAlert2;
    @Bind(R.id.btn_alert_multichoose)
    Button btnIosAlertVertical2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        activity = this;
        context = getApplication();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    public void onStart() {
        super.onStart();


    }

    String msg = "如果你有心理咨询师般的敏锐，你会进一步发现——这个姑娘企图用考研来掩饰自己对于毕业的恐惧。";
           /* "\n" +
            "像琴姑娘这样的毕业生很多，她们一段时间内会认真地复习考研。可用不了多久，她们便会动摇，便会找出诸多借口给自己开脱，最后考研一事半途而废。\n" +
            "\n" +
            "原因，当事人根本不相信这件事能改变她的命运，能带给她想要的生活。她们相信自己不够努力，也愿意别人骂自己不努力。\n" +
            "\n" +
            "他们不愿意思考自己到底该干什么？他们抱着一个幻想，假如我真的努力就能解决问题了吧！于是他们把一个不可控的事件，在心理变成了可控，从而增加安全感。\n" +
            "\n" +
            "人真的可以为了逃避真正的思考，而做出任何你想象不到的事。\n" +
            "\n" +
            "这种目标是不重结果的，其实它跟刷微博是一个道理，它通过获取无用信息来给自己的生活制造一点喘息。\n" +
            "\n" +
            "只不过陷在“学习”中，要比陷在微博上更能安慰自己的内心，那个已经破了个大洞的内心。\n" +
            "\n" +
            "作者：剑圣喵大师\n" +
            "链接：https://www.zhihu.com/question/50126427/answer/119551026\n" +
            "来源：知乎\n" +
            "著作权归作者所有，转载请联系作者获得授权。";*/

    @Override
    public void onStop() {
        super.onStop();

    }

    @OnClick({R.id.btn_loading_vertical, R.id.btn_loading_horizontal, R.id.btn_md_alert, R.id.btn_tie_alert, R.id.btn_alert_horizontal,
            R.id.btn_alert_vertical, R.id.btn_bottom_sheet_cancel, R.id.btn_center_sheet, R.id.btn_alert_input,
            R.id.btn_alert_multichoose, R.id.btn_alert_singlechoose, R.id.btn_bottom_sheet, R.id.btn_md_bottom_vertical, R.id.btn_md_bottom_horizontal, R.id.btn_custom_alert})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_loading_vertical:
                DialogUIUtils.showLoadingVertical(this, "加载中...", true, true).show();
                break;
            case R.id.btn_loading_horizontal:
                DialogUIUtils.showLoadingHorizontal(this, msg, true, true).show();
                break;
            case R.id.btn_md_alert:
                DialogUIUtils.showMdAlert(activity, "title", msg, new DialogUIListener() {
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
                DialogUIUtils.showAlert(activity, "title", msg, new DialogUIListener() {
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
                DialogUIUtils.showAlertHorizontal(activity, "title", msg, new DialogUIListener() {
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
                DialogUIUtils.showAlertVertical(this, "title", msg, new DialogUIListener() {
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
                strings.add(msg);
                strings.add("4");
                strings.add("5");
                DialogUIUtils.showBottomSheetAndCancel(activity, strings, "cancle", new DialogUIItemListener() {
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
                strings.add(msg);
                strings.add("4");
                strings.add("5");
                strings.add(msg);
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
                String[] words = new String[]{"12", "78", "45", "89", "88", "00"};
                boolean[] choseDefault = new boolean[]{false, false, false, false, true, false};
                DialogUIUtils.showMdMultiChoose(activity, "xuanze", words, choseDefault, new DialogUIListener() {
                    @Override
                    public void onPositive() {

                    }

                    @Override
                    public void onNegative() {

                    }
                }).show();
                break;
            case R.id.btn_alert_singlechoose:
                String[] words2 = new String[]{"12", "78", "45", "89", "88", "00"};
                DialogUIUtils.showSingleChoose(activity, "单选", 2, words2, new DialogUIItemListener() {
                    @Override
                    public void onItemClick(CharSequence text, int position) {
                        showToast(text + "--" + position);
                    }
                }).show();
                break;
            case R.id.btn_bottom_sheet:
                String[] words3 = new String[]{"12", "78", "45", "89", "88", "00"};
                List<String> datas = Arrays.asList(words3);
                RecyclerView recyclerView = new RecyclerView(this);
                recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
                SuperRcvAdapter adapter = new SuperRcvAdapter(this) {
                    @Override
                    protected SuperRcvHolder generateCoustomViewHolder(int viewType) {

                        return new SuperRcvHolder<String>(inflate(R.layout.item_text)) {

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
                adapter.addAll(datas);
                adapter.addAll(datas);
                DialogUIUtils.showBottomSheet(this, recyclerView).show();//不好建立回
                break;
            case R.id.btn_md_bottom_vertical:
                List<BottomSheetBean> datas2 = new ArrayList<>();
                datas2.add(new BottomSheetBean(R.mipmap.ic_launcher, "1"));
                datas2.add(new BottomSheetBean(R.mipmap.ic_launcher, "222"));
                datas2.add(new BottomSheetBean(R.mipmap.ic_launcher, "333333"));
                datas2.add(new BottomSheetBean(R.mipmap.ic_launcher, "444"));
                datas2.add(new BottomSheetBean(R.mipmap.ic_launcher, "55"));
                datas2.add(new BottomSheetBean(R.mipmap.ic_launcher, "666"));
                datas2.add(new BottomSheetBean(R.mipmap.ic_launcher, "7777"));
                datas2.add(new BottomSheetBean(R.mipmap.ic_launcher, "fddsf"));
                datas2.add(new BottomSheetBean(R.mipmap.ic_launcher, "67gfhfg"));
                datas2.add(new BottomSheetBean(R.mipmap.ic_launcher, "oooooppp"));
                DialogUIUtils.showMdBottomSheetVertical(activity, "拉出来溜溜", datas2, "this is cancle button", new DialogUIItemListener() {
                    @Override
                    public void onItemClick(CharSequence text, int position) {
                        showToast(text + "---" + position);
                    }
                }).show();
                break;
            case R.id.btn_md_bottom_horizontal:
                List<BottomSheetBean> datas3 = new ArrayList<>();
                datas3.add(new BottomSheetBean(R.mipmap.ic_launcher, "1"));
                datas3.add(new BottomSheetBean(R.mipmap.ic_launcher, "222"));
                datas3.add(new BottomSheetBean(R.mipmap.ic_launcher, "333333"));
                datas3.add(new BottomSheetBean(R.mipmap.ic_launcher, "444"));
                datas3.add(new BottomSheetBean(R.mipmap.ic_launcher, "55"));
                datas3.add(new BottomSheetBean(R.mipmap.ic_launcher, "666"));
                datas3.add(new BottomSheetBean(R.mipmap.ic_launcher, "7777"));
                datas3.add(new BottomSheetBean(R.mipmap.ic_launcher, "fddsf"));
                datas3.add(new BottomSheetBean(R.mipmap.ic_launcher, "67gfhfg"));
                datas3.add(new BottomSheetBean(R.mipmap.ic_launcher, "oooooppp"));
                DialogUIUtils.showMdBottomSheetHorizontal(activity, "拉出来溜溜", datas3, "this is cancle button", 3, new DialogUIItemListener() {
                    @Override
                    public void onItemClick(CharSequence text, int position) {
                        showToast(text + "---" + position);
                    }
                }).show();
                break;


        }
    }


    public void showToast(CharSequence msg) {
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

    }
}
