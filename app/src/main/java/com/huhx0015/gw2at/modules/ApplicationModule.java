package com.huhx0015.gw2at.modules;

import android.app.Application;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Michael Yoon Huh on 1/31/2017.
 *
 * Source: https://github.com/codepath/android_guides/wiki/Dependency-Injection-with-Dagger-2
 */

@Module
public class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }
}
