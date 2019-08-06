package com.function.luo.simple3;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by luo on 2019/8/6.
 */


@Component(modules = A03Module.class)
public interface A03Component {

    void inject(A03Activity activity);
}
