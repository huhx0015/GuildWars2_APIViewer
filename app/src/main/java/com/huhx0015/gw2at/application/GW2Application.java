package com.huhx0015.gw2at.application;

import android.app.Application;
import com.huhx0015.gw2at.constants.GW2Constants;
import com.huhx0015.gw2at.interfaces.DaggerNetworkComponent;
import com.huhx0015.gw2at.interfaces.NetworkComponent;
import com.huhx0015.gw2at.modules.ApplicationModule;
import com.huhx0015.gw2at.modules.NetworkModule;

/**
 * Created by Michael Yoon Huh on 1/31/2017.
 */

public class GW2Application extends Application {

    private NetworkComponent mNetworkComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // Creates the Dagger singleton component.
        mNetworkComponent = DaggerNetworkComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .networkModule(new NetworkModule(GW2Constants.API_URL))
                .build();
    }

    public NetworkComponent getNetworkComponent() {
        return mNetworkComponent;
    }
}