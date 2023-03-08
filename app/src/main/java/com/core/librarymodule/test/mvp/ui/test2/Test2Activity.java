package com.core.librarymodule.test.mvp.ui.test2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.core.librarymodule.R;
import com.core.siawetLibrary.base.mvp.BaseMvpActivity;

public class Test2Activity extends BaseMvpActivity<Test2Presenter> implements Test2View {
    @Override
    protected Test2Presenter createPresenter() {
        return new Test2Presenter(this, this);
    }

    @Override
    protected void initView() {
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("data_return", "the data of returning to FirstActivity");
                intent.putExtra("dataInt_return",1024);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
        initData();
        initView();
    }
}
