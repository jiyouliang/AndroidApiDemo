package com.android.androidapidemo.jetpack.viewmodel;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.android.androidapidemo.R;

public class ViewModelActivity extends AppCompatActivity {

    private MyViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);
        mViewModel = new ViewModelProvider(this).get(MyViewModel.class);
        mViewModel.observerServiceData(this, s -> {
            // 收到服务器返回的数据
        });
    }
}