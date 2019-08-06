package com.function.luo.mvp.global;

import android.app.Application;

import com.function.luo.mvp.*;
import com.function.luo.mvp.global.AppComponent;
import com.function.luo.mvp.global.AppModule;

/**
 * Created by luo on 2019/8/6.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        inject();
    }

    private void inject() {

        AppComponent appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        ComponentHolder.setAppComponent(appComponent);

    }
}
