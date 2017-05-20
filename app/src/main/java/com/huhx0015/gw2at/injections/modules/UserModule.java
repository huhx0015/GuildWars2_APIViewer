package com.huhx0015.gw2at.injections.modules;

import com.huhx0015.gw2at.model.objects.GW2Account;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Michael Yoon Huh on 2/4/2017.
 */

@Module
public class UserModule {

    @Provides
    @Singleton
    GW2Account provideGW2Account() {
        return GW2Account.getInstance();
    }
}
