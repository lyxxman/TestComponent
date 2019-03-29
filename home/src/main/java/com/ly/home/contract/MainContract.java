package com.ly.home.contract;

import com.ly.common.base.BasePresenter;
import com.ly.common.base.BaseView;

/**
 * Author:Administrator
 * Time:2019/3/28 15:04
 * Describption:This is MainContract
 * Version: 1.0.0
 */
public interface MainContract {

    interface MainView extends BaseView {
        void onGetMainDataSuccess(String name);
    }

    interface presenter  {
        void getMainData();
    }

}

 