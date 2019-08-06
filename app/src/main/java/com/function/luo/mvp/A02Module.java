package com.function.luo.mvp;

import com.function.luo.simple.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by luo on 2019/8/6.
 */

@Module
public class A02Module {
    private A02Activity activity;

    public A02Module(A02Activity activity) {
        this.activity = activity;
    }

    /**
     * 显然我们并不是很多地方都需要某对象，我们在需要用该对象的界面的Module中提供注入即可
     * @return
     */
    @Provides
    User provideUser() {
        return new User();
    }


}
