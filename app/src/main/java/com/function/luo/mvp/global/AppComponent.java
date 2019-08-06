package com.function.luo.mvp.global;

import android.content.SharedPreferences;

import dagger.Component;

/**
 * Created by luo on 2019/8/6.
 */
@Component(modules = AppModule.class)
public interface AppComponent {

    SharedPreferences sharedPreferences();
    MyApplication myApplication();
}
