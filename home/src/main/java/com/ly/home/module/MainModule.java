package com.ly.home.module;

import com.ly.common.scop.ActivityScoped;
import com.ly.home.presenter.MainPresenter;

import javax.inject.Inject;
import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Author:Administrator
 * Time:2019/3/28 15:40
 * Describption:This is MainModule
 * Version: 1.0.0
 */
@Module
public class MainModule {

    @Inject
    MainPresenter mainPresenter;

    @ActivityScoped
    @Provides
    public MainPresenter providesMainPresenter() {
        return mainPresenter;
    }


}

 