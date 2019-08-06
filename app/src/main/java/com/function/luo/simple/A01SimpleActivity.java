package com.function.luo.simple;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.Toast;

import com.function.luo.daggerdemo.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by luo on 2019/8/6.
 */

public class A01SimpleActivity extends Activity {

    @BindView(R.id.btn1)
    Button btn1;

    @Inject
    User user;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_simple);
        ButterKnife.bind(this);

        //添加新代码.a01SimpleModule(new A01SimpleModule(this))
        DaggerA01SimpleComponent.builder()
                .a01SimpleModule(new A01SimpleModule(this))
                .build()
                .inject(this);

    }

    @OnClick(R.id.btn1)
    public void onViewClicked() {

        Toast.makeText(this,user.toString(),Toast.LENGTH_LONG).show();

    }

    public static void launch(Context mContext) {
        Intent intent = new Intent(mContext,A01SimpleActivity.class);
        mContext.startActivity(intent);
    }
}
