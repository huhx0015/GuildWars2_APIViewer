package com.huhx0015.gw2at.interfaces;

import com.huhx0015.gw2at.activities.MainActivity;
import com.huhx0015.gw2at.fragments.ServerStatusFragment;
import com.huhx0015.gw2at.modules.ApplicationModule;
import com.huhx0015.gw2at.modules.NetworkModule;
import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by Michael Yoon Huh on 1/31/2017.
 */

@Singleton
@Component(modules={ApplicationModule.class, NetworkModule.class})
public interface NetworkComponent {
    void inject(MainActivity activity);
    void inject(ServerStatusFragment fragment);
}