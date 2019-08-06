package com.function.luo.simple;

import dagger.Module;
import dagger.Provides;

/**
 * Created by luo on 2019/8/6.
 * 类似快递员的箱子
 */
@Module
public class A01SimpleModule {

    private A01SimpleActivity activity;


    public A01SimpleModule(A01SimpleActivity activity) {
        this.activity = activity;
    }


    //下面为新增代码：
    @Provides
    User provideUser(){
        return new User();
    }
}
