package com.core.siawetLibrary.base.mvp;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;

/**
 * Presenter base
 */

public class BasePresenter {

    private LifecycleProvider<ActivityEvent> provider;

    public BasePresenter() {
    }

    public BasePresenter(LifecycleProvider<ActivityEvent> provider) {
        this.provider = provider;
    }

    public LifecycleProvider<ActivityEvent> getProvider() {
        return provider;
    }


}
