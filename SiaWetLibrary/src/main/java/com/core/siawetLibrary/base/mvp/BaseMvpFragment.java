package com.core.siawetLibrary.base.mvp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;


/**
 * Fragment
 */
public abstract class BaseMvpFragment<P extends BasePresenter> extends Fragment {
    protected P mvpPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mvpPresenter = createPresenter();

    }

    protected abstract P createPresenter();

    public abstract BaseMvpFragment<P> getFragmentObject();

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}


