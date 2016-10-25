package com.leo.test2library.activity;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Leo on 2016/10/25.
 */

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getLayoutId() != null) setContentView(getLayoutId());

        initView();

        initData();

    }

    protected Integer getLayoutId(){
        return null;
    }

    protected void initView(){}

    protected void initData(){}

}
