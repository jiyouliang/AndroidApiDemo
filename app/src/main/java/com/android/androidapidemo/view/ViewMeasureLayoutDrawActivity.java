package com.android.androidapidemo.view;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.androidapidemo.R;

public class ViewMeasureLayoutDrawActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView mTextView;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.textview);
        mRelativeLayout = findViewById(R.id.layout_relative);
        findViewById(R.id.btn).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn) {
            int color = getColor(android.R.color.holo_red_dark);
            // 如果颜色没有变化，不会触发invalidate，所以不会触发onDraw
            mTextView.setTextColor(color);

            // 主动调用invalidate，即使颜色没变，也会触发onDraw
//            mTextView.invalidate();
        } else if (v.getId() == R.id.btn2) {
            mRelativeLayout.invalidate();
        } else if (v.getId() == R.id.btn3) {
            mTextView.requestLayout();
        } else if (v.getId() == R.id.btn4) {
            mRelativeLayout.requestLayout();
        }
    }
}