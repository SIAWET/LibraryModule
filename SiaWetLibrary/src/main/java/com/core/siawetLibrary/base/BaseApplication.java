package com.core.siawetLibrary.base;

import androidx.multidex.MultiDexApplication;

public class BaseApplication extends MultiDexApplication {
    private static BaseApplication instance;

    public static BaseApplication get() {
        return instance;
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        instance = this;
        init();
    }

    //初始化
    private void init() {

    }

}
