package com.function.luo.mvp;

import com.function.luo.mvp.global.AppComponent;

/**
 * Created by luo on 2019/8/6.
 */

public class ComponentHolder {

    private static AppComponent myAppComponent;

    public static void setAppComponent(AppComponent component) {
        myAppComponent = component;
    }

    public static AppComponent getAppComponent() {
        return myAppComponent;
    }

}
