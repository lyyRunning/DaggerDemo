package com.function.luo.simple3;

import com.function.luo.mvp.A02Activity;
import com.function.luo.simple.A01SimpleActivity;
import com.function.luo.simple.User;
import com.function.luo.simple4.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by luo on 2019/8/6.
 */
@Module
public class A03Module {

    private A03Activity activity;


    public A03Module(A03Activity activity) {

        this.activity = activity;
    }


    //下面为新增代码：
    @Provides
    Student provideStudent(){
        return new Student();
    }
}

