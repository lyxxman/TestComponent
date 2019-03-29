package com.ly.common.component;

import android.app.Application;

import com.ly.common.base.CoponentApplication;
import com.ly.common.net.NetRetrofit;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Singleton
@Component(modules = NetRetrofit.class)
public interface RetrofitComponent {
     void inject(CoponentApplication coponentApplication);
     Retrofit provideRestAdapter();
     OkHttpClient provideOkHttpClient();
}
