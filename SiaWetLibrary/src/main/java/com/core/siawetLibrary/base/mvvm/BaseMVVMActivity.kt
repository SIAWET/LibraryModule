package com.core.siawetLibrary.base.mvvm

import android.Manifest
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions
import androidx.activity.result.contract.ActivityResultContracts.RequestPermission
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.core.siawetLibrary.util.toast.ToastView
import java.util.*

abstract class BaseMVVMActivity<T : ViewModel> : AppCompatActivity() {
    val viewModel by lazy {
        ViewModelProvider(this)[getViewModel()]
    }

    abstract fun getViewModel(): Class<T>
    protected abstract fun initView()

    protected abstract fun initData()

    fun toastShow(resId: Int) {
        ToastView.getToastView().toastShow(this, null, resId)
    }

    fun toastShow(resId: String?) {
        ToastView.getToastView().toastShow(this, null, resId)
    }

    //权限获取结果
    fun getRequestPermissionResultLauncher(): ActivityResultLauncher<String?>? {
        return registerForActivityResult(
            RequestPermission()
        ) { result ->
            if (result) {

            } else {

            }
        }
    }

    fun getRequestPermissionsResultLauncher(): ActivityResultLauncher<Array<String?>?>? {
        return registerForActivityResult(RequestMultiplePermissions(),
            ActivityResultCallback<Map<String?, Boolean?>> { result ->
                if (result[Manifest.permission.CAMERA] != null && result[Manifest.permission.READ_EXTERNAL_STORAGE] != null) {
                    if (Objects.requireNonNull(result[Manifest.permission.CAMERA]) == true &&
                        Objects.requireNonNull(result[Manifest.permission.READ_EXTERNAL_STORAGE]) == true){
                        //权限全部获取到之后的动作

                    } else {
                        //有权限没有获取到的动作

                    }
                }
            })
    }
}