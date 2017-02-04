package com.huhx0015.gw2at.application;

import android.app.Application;
import android.content.Context;
import com.huhx0015.gw2at.constants.GW2Constants;
import com.huhx0015.gw2at.interfaces.AccountComponent;
import com.huhx0015.gw2at.interfaces.DaggerAccountComponent;
import com.huhx0015.gw2at.interfaces.DaggerNetworkComponent;
import com.huhx0015.gw2at.interfaces.NetworkComponent;
import com.huhx0015.gw2at.modules.ApplicationModule;
import com.huhx0015.gw2at.modules.NetworkModule;
import com.huhx0015.gw2at.modules.UserModule;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by Michael Yoon Huh on 1/31/2017.
 */

public class GW2Application extends Application {

    private NetworkComponent mNetworkComponent;
    private RefWatcher mRefWatcher;
    private AccountComponent mAccountComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // LEAK CANARY:
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);

        // DAGGER USER COMPONENT:
        mAccountComponent = DaggerAccountComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .userModule(new UserModule())
                .build();

        // DAGGER NETWORK COMPONENT:
        mNetworkComponent = DaggerNetworkComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .networkModule(new NetworkModule(GW2Constants.API_URL))
                .build();
    }

    public AccountComponent getUserComponent() {
        return mAccountComponent;
    }

    public NetworkComponent getNetworkComponent() {
        return mNetworkComponent;
    }

    public static RefWatcher getRefWatcher(Context context) {
        GW2Application application = (GW2Application) context.getApplicationContext();
        return application.mRefWatcher;
    }
}