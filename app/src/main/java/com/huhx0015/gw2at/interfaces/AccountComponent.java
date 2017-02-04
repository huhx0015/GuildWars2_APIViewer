package com.huhx0015.gw2at.interfaces;

import com.huhx0015.gw2at.activities.MainActivity;
import com.huhx0015.gw2at.modules.ApplicationModule;
import com.huhx0015.gw2at.modules.UserModule;
import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by Michael Yoon Huh on 2/4/2017.
 */

@Singleton
@Component(modules={ApplicationModule.class, UserModule.class})
public interface AccountComponent {
    void inject(MainActivity activity);
}