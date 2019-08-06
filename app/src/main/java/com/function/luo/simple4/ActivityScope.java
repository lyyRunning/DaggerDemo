package com.function.luo.simple4;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by luo on 2019/8/6.
 */
@Scope  //声明这是一个自定义@Scope注解
@Retention(RUNTIME)
public @interface ActivityScope {
}
