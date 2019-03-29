package com.ly.home.presenter;

import com.ly.common.base.BasePresenter;
import com.ly.common.bean.User;
import com.ly.home.contract.MainContract;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainPresenter extends BasePresenter<MainContract.MainView> implements MainContract.presenter {

    @Inject
    User user;
    @Inject
    Retrofit retrofit;
    @Inject
    public MainPresenter() {

    }

    @Override
    public void getMainData() {
            if (isViewAttached()){
                user.setName("罗老师"+retrofit);
                getView().onGetMainDataSuccess(user.getName());
            }
    }
}
