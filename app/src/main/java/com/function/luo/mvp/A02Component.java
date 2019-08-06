package com.function.luo.mvp;

import com.function.luo.mvp.global.AppComponent;

import dagger.Component;

/**
 * Created by luo on 2019/8/6.
 */
@Component(modules = A02Module.class, dependencies = AppComponent.class)
public interface A02Component {

    void inject(A02Activity activity);
}
