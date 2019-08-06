package com.function.luo.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.function.luo.daggerdemo.MainActivity;
import com.function.luo.daggerdemo.R;
import com.function.luo.simple.User;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by luo on 2019/8/6.
 */

public class A02Activity extends Activity {

    @Inject
    User user;
    @Inject
    SharedPreferences sp;
    @BindView(R.id.btn1)
    Button btn1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a02);
        ButterKnife.bind(this);
        inject();
    }


    private void inject() {
        DaggerA02Component.builder()
                //添加appComponent注入器
                .appComponent(ComponentHolder.getAppComponent())
                .a02Module(new A02Module(this))
                .build()
                .inject(this);

        Log.d("LUO", "注入完毕，User = " + user.toString());
        Log.d("LUO", "注入完毕，sp = " + sp.toString());
    }

    @OnClick(R.id.btn1)
    public void onViewClicked() {
        Toast.makeText(this,user.toString(),Toast.LENGTH_LONG).show();
    }

    public static void launch(Context mContext) {
        Intent intent = new Intent(mContext,A02Activity.class);
        mContext.startActivity(intent);
    }
}
