package com.ly.home;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ly.common.base.BaseActivity;
import com.ly.home.component.DaggerMainActivityComponent;
import com.ly.home.contract.MainContract;
import com.ly.home.presenter.MainPresenter;


@Route(path = "/home/index")
public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Toast.makeText(getApplicationContext(), " presneter=" + mPresenter, Toast.LENGTH_LONG).show();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ARouter.getInstance().build("/zhibo/index").navigation();
                mPresenter.getMainData();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onGetMainDataSuccess(String name) {
        Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPageStatusError(int code, String message, int sceneCode) {
      switch (sceneCode){

      }
    }

    @Override
    protected void injectComponent() {
        DaggerMainActivityComponent.builder().retrofitComponent(getOwnApplication().getRetrofitComponent()).
                build().inject(this);
    }
}

