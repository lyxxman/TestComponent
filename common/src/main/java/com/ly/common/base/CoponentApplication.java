package com.ly.common.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.ly.common.component.DaggerRetrofitComponent;
import com.ly.common.component.RetrofitComponent;

public class CoponentApplication extends Application {
    RetrofitComponent retrofitComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
        if (AppConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        retrofitComponent= DaggerRetrofitComponent.create();
    }

    public RetrofitComponent getRetrofitComponent() {
        return retrofitComponent;
    }
    //    @Override
//    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
//        return null;
//    }
}
