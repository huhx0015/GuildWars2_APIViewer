package com.huhx0015.mgw2s.interfaces;

import com.huhx0015.mgw2s.activities.MainActivity;
import com.huhx0015.mgw2s.modules.ApplicationModule;
import com.huhx0015.mgw2s.modules.NetworkModule;
import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by Michael Yoon Huh on 1/31/2017.
 */

@Singleton
@Component(modules={ApplicationModule.class, NetworkModule.class})
public interface NetworkComponent {
    void inject(MainActivity activity);
}