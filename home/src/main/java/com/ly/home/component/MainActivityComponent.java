package com.ly.home.component;

import com.ly.common.component.RetrofitComponent;
import com.ly.common.net.NetRetrofit;
import com.ly.common.scop.ActivityScoped;
import com.ly.home.MainActivity;
import com.ly.home.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;

@ActivityScoped
@Component(dependencies = RetrofitComponent.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
