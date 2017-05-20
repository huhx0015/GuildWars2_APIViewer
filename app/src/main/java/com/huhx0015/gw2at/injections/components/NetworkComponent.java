package com.huhx0015.gw2at.injections.components;

import com.huhx0015.gw2at.view.activities.ApiActivity;
import com.huhx0015.gw2at.view.fragments.ApiFragment;
import com.huhx0015.gw2at.injections.modules.ApplicationModule;
import com.huhx0015.gw2at.injections.modules.NetworkModule;
import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by Michael Yoon Huh on 1/31/2017.
 */

@Singleton
@Component(modules={ApplicationModule.class, NetworkModule.class})
public interface NetworkComponent {
    void inject(ApiActivity activity);
    void inject(ApiFragment fragment);
}