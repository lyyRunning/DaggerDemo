package com.function.luo.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.function.luo.mvp.A02Activity;
import com.function.luo.simple.A01SimpleActivity;
import com.function.luo.simple3.A03Activity;
import com.function.luo.simple4.A04Activity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.btn3)
    Button btn3;
    @BindView(R.id.btn4)
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /**
     * 点击事件
     * @param view
     */
    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                A01SimpleActivity.launch(MainActivity.this);
                break;
            case R.id.btn2:
                A02Activity.launch(MainActivity.this);
                break;
            case R.id.btn3:
                A03Activity.launch(MainActivity.this);
                break;
            case R.id.btn4:
                A04Activity.launch(MainActivity.this);
                break;
            default:
                break;
        }
    }
}
