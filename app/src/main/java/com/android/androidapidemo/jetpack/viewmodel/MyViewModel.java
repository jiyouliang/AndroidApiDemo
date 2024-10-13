package com.android.androidapidemo.jetpack.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<String> mLiveData = new MutableLiveData<>();

    public void observerServiceData(@NonNull LifecycleOwner owner, @NonNull Observer<String> observer) {
        mLiveData.observe(owner, observer);
    }


    private void onSuccessCallback() {
        mLiveData.setValue("服务器返回数据");
    }

}