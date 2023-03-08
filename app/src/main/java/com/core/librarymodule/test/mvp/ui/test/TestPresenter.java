package com.core.librarymodule.test.mvp.ui.test;

import com.core.siawetLibrary.base.mvp.BasePresenter;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;

public class TestPresenter extends BasePresenter {

    private final TestView view;


    public TestPresenter(TestView view) {
        this.view = view;
    }

    public TestPresenter(TestView view, LifecycleProvider<ActivityEvent> provider) {
        super(provider);
        this.view = view;

    }


}
