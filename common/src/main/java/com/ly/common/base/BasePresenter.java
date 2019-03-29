package com.ly.common.base;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

import rx.subscriptions.CompositeSubscription;

/**
 * Author: Ly
 * Time:2019/3/28 14:59
 * Describption:This is BasePresenter
 * Version: 1.0.0
 */
public class BasePresenter<T> {
    //view接口类型的弱引用
    protected Reference<T> mViewRef;
    //用于统一取消未完成的订阅
    protected CompositeSubscription mCompositeSubscription;

    public void attachView(T view) {
        mCompositeSubscription = new CompositeSubscription();
        mViewRef = new WeakReference<T>(view);//建立关联
    }

    protected T getView() {
        if (isViewAttached()) {
            return mViewRef.get();
        } else {
            return null;
        }
    }

    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public void detachView() {

        //取消还存在的订阅
        if (mCompositeSubscription != null && mCompositeSubscription.isUnsubscribed()) {
            mCompositeSubscription.unsubscribe();
            mCompositeSubscription = null;
        }
        //及时销毁P层
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
 