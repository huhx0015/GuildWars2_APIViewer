package com.huhx0015.gw2at.injections.components;

import com.huhx0015.gw2at.view.activities.MainActivity;
import com.huhx0015.gw2at.injections.modules.ApplicationModule;
import com.huhx0015.gw2at.injections.modules.UserModule;
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