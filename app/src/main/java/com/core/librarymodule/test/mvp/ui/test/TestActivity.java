package com.core.librarymodule.test.mvp.ui.test;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;

import com.core.librarymodule.databinding.ActivityMainBinding;
import com.core.librarymodule.test.mvp.ui.test2.Test2Activity;
import com.core.siawetLibrary.base.mvp.BaseMvpActivity;
import com.google.android.material.snackbar.Snackbar;

import java.util.Map;
import java.util.Objects;

public class TestActivity extends BaseMvpActivity<TestPresenter> implements TestView {
    private ActivityMainBinding viewBinding;
    private TestPresenter presenter;

    //view
    private Button button1;

    //data
    private int dataInt;

    @Override
    protected TestPresenter createPresenter() {
        return new TestPresenter(this, this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(viewBinding.getRoot());
        presenter = createPresenter();
        initData();
        initView();

    }

    private void testData() {
        toastShow("${dataInt}" + dataInt);
    }

    private void testData2() {
        Snackbar.make(this, viewBinding.getRoot(), "snack bar" + dataInt, Snackbar.LENGTH_SHORT).show();
    }


    @Override
    protected void initView() {
        button1 = viewBinding.button1;
        //java写法 ,不能放在监听器里
        ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == Activity.RESULT_OK && result.getData() != null) {
                    dataInt = result.getData().getIntExtra("dataInt_return", 0);
                }

            }
        });
        ActivityResultLauncher<String> launcher1 = getRequestPermissionResultLauncher();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                launcher.launch(new Intent(TestActivity.this, Test2Activity.class));

                launcher1.launch(Manifest.permission.READ_EXTERNAL_STORAGE);
            }
        });
        ActivityResultLauncher<String[]> launcher3 = getRequestPermissionsResultLauncher();
        Button button3 = viewBinding.button3;
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                testData2();
                launcher3.launch(new String[]{Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE});
            }
        });


    }


    //权限获取结果
    private ActivityResultLauncher<String> getRequestPermissionResultLauncher() {
        return registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback<Boolean>() {
            @Override
            public void onActivityResult(Boolean result) {
                if (result) {

                } else {

                }
            }
        });
    }

    private ActivityResultLauncher<String[]> getRequestPermissionsResultLauncher() {
        return registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback<Map<String, Boolean>>() {
            @Override
            public void onActivityResult(Map<String, Boolean> result) {
                if (result.get(Manifest.permission.CAMERA) != null
                        && result.get(Manifest.permission.READ_EXTERNAL_STORAGE) != null) {
                    if (Objects.requireNonNull(result.get(Manifest.permission.CAMERA)).equals(true)
                            && Objects.requireNonNull(result.get(Manifest.permission.READ_EXTERNAL_STORAGE)).equals(true)) {
                        //权限全部获取到之后的动作
                    } else {
                        //有权限没有获取到的动作
                    }
                }

            }
        });
    }

}