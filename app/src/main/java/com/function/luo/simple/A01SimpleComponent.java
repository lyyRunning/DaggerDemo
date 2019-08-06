package com.function.luo.simple;

import dagger.Component;

/**
 * Created by luo on 2019/8/6.
 * 注射器，类似快递员
 */
@Component(modules = A01SimpleModule.class)
public interface A01SimpleComponent {

    void inject(A01SimpleActivity activity);
}
