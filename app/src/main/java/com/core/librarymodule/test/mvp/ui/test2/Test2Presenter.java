package com.core.librarymodule.test.mvp.ui.test2;

import com.core.librarymodule.test.mvp.ui.test.TestView;
import com.core.siawetLibrary.base.mvp.BasePresenter;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;

public class Test2Presenter extends BasePresenter {

    private final Test2View view;


    public Test2Presenter(Test2View view) {
        this.view = view;
    }

    public Test2Presenter(Test2View view, LifecycleProvider<ActivityEvent> provider) {
        super(provider);
        this.view = view;

    }


}
