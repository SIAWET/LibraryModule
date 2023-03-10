package com.core.siawetLibrary.base.mvp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;

import com.core.siawetLibrary.util.toast.ToastView;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

public abstract class BaseMvpActivity<P extends BasePresenter> extends RxAppCompatActivity  {

    public Activity mActivity;

    protected abstract P createPresenter();

    protected abstract void initView();

    protected abstract void initData();

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        //StatusBarUtil.StatusBarLightMode(BaseMvpActivity.this, true);
        mActivity = this;
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        mActivity = this;
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        mActivity = this;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void toastShow(int resId) {

        ToastView.getToastView().toastShow(this, null, resId);
    }

    public void toastShow(String resId) {
        ToastView.getToastView().toastShow(this, null, resId);
    }

    private final int mRequestCode = 1024;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        boolean hasAllGranted = true;
        StringBuilder permissionName = new StringBuilder();
        for (String s : permissions) {
            permissionName = permissionName.append(s + "\r\n");
        }
        switch (requestCode) {
            case mRequestCode: {
                for (int i = 0; i < grantResults.length; ++i) {
                    if (grantResults[i] == PackageManager.PERMISSION_DENIED) {
                        hasAllGranted = false;
                        //????????????????????????????????????????????????shouldShowRequestPermissionRationale??????false???
                        // ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
                        if (!ActivityCompat.shouldShowRequestPermissionRationale(this, permissions[i])) {
                            new AlertDialog.Builder(this)
                                    .setTitle("PermissionTest")//?????????????????????
                                    .setMessage("???????????????????????????????????????????????????????????????????????????MIUI??????" +
                                            "?????????????????????????????????????????????,?????????????????????????????????????????????" +
                                            "????????????????????????:" + permissionName +
                                            "???????????????????????????????????????????????????????????????????????????")//?????????????????????
                                    .setPositiveButton("?????????", new DialogInterface.OnClickListener() {//??????????????????
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {//???????????????????????????
                                            Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                                            Uri uri = Uri.fromParts("package", getApplicationContext().getPackageName(), null);
                                            intent.setData(uri);
                                            startActivity(intent);
                                            dialog.dismiss();
                                        }
                                    }).setNegativeButton("??????", new DialogInterface.OnClickListener() {//??????????????????
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {//????????????
                                            dialog.dismiss();
                                        }
                                    }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                                        @Override
                                        public void onCancel(DialogInterface dialog) {
                                        }
                                    }).show();//??????????????????????????????????????????
                        } else {
                            //???????????????????????????????????????????????????????????????
                        }
                        break;
                    }
                }
                if (hasAllGranted) {

                }
            }
        }

    }
}
