package com.ly.common.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Author:Administrator
 * Time:2019/3/28 15:28
 * Describption:This is BaseActivity
 * Version: 1.0.0
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {

    @Inject
    protected T mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectComponent();

        //关联P层和View层
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //退出清理P层
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        mPresenter = null;
    }

    /**
     * 获取全局应用程序对象
     *
     * @return
     */
    public CoponentApplication getOwnApplication() {
        return (CoponentApplication) getApplication();
    }

    /**
     * 注入依赖组件方法
     */
    protected abstract void injectComponent();
}

 