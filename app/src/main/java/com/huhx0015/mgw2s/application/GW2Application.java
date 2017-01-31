package com.huhx0015.mgw2s.application;

import android.app.Application;
import com.huhx0015.mgw2s.constants.GW2Constants;
import com.huhx0015.mgw2s.interfaces.DaggerNetworkComponent;
import com.huhx0015.mgw2s.interfaces.NetworkComponent;
import com.huhx0015.mgw2s.modules.ApplicationModule;
import com.huhx0015.mgw2s.modules.NetworkModule;

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