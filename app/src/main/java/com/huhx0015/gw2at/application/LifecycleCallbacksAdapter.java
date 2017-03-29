package com.huhx0015.gw2at.application;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * Helper to avoid implementing all lifecycle callback methods.
 *
 * Source: https://gist.github.com/pyricau/4df64341cc978a7de414
 */

public class LifecycleCallbacksAdapter implements Application.ActivityLifecycleCallbacks {
    @Override public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

    }

    @Override public void onActivityStarted(Activity activity) {

    }

    @Override public void onActivityResumed(Activity activity) {

    }

    @Override public void onActivityPaused(Activity activity) {

    }

    @Override public void onActivityStopped(Activity activity) {

    }

    @Override public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override public void onActivityDestroyed(Activity activity) {

    }
}