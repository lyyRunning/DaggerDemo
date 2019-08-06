package com.function.luo.mvp.global;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

/**
 * Created by luo on 2019/8/6.
 */
@Module
public class AppModule {

    private MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }

    /**
     * 提供全局的sp对象
     * @return
     */
    @Provides
    SharedPreferences provideSharedPreferences(){
        //return application.getSharedPreferences("spfile", Context.MODE_PRIVATE);
        return application.getSharedPreferences("spfile", Context.MODE_PRIVATE);

    }

    /**
     * 提供全局的Application对象
     * @return
     */
    @Provides
    MyApplication provideApplication(){
        return application;
    }

    //你还可以提供更多.......

}
