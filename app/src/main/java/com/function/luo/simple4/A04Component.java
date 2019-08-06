package com.function.luo.simple4;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by luo on 2019/8/6.
 */

@Component(modules = A04Module.class)
@ActivityScope
public interface A04Component {

    void inject(A04Activity activity);
}
