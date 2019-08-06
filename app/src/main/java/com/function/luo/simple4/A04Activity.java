package com.function.luo.simple4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

import com.function.luo.daggerdemo.R;
import com.function.luo.simple3.Student;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by luo on 2019/8/6.
 */

public class A04Activity extends Activity {

    @Inject
    Student student1;
    @Inject
    Student student2;
    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.tv_value1)
    TextView tvValue1;
    @BindView(R.id.tv_value2)
    TextView tvValue2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a04);
        ButterKnife.bind(this);
        DaggerA04Component.builder()
                .a04Module(new A04Module(this))
                .build()
                .inject(this);

    }

    @OnClick(R.id.btn1)
    public void onViewClicked() {

        tvValue1.setText(student1.toString());

        tvValue2.setText(student2.toString());
    }

    public static void launch(Context mContext) {
        Intent intent = new Intent(mContext, A04Activity.class);
        mContext.startActivity(intent);
    }


}
