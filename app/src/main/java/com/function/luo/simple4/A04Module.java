package com.function.luo.simple4;

import com.function.luo.simple3.Student;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by luo on 2019/8/6.
 */
@Module
@ActivityScope
public class A04Module {

    private A04Activity activity;


    public A04Module(A04Activity activity) {

        this.activity = activity;
    }


    //下面为新增代码：
    @Provides
    @ActivityScope
    Student provideStudent(){
        return new Student();
    }
}

