package com.ly.testcoponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        findViewById(R.id.txt_click_to_main).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ARouter.getInstance().build("/home/index").navigation();
        finish();
    }
}
