package com.huhx0015.gw2at.application;

import com.huhx0015.gw2at.interfaces.DaggerNetworkComponent;
import com.huhx0015.gw2at.modules.ApplicationModule;
import com.huhx0015.gw2at.modules.NetworkModule;
import io.appflate.restmock.RESTMockServer;

/**
 * Created by Michael Yoon Huh on 3/30/2017.
 */

public class GW2TestApplication extends GW2Application {

    /** APPLICATION LIFECYCLE METHODS __________________________________________________________ **/

    @Override
    public void onCreate() {
        super.onCreate();

        // DAGGER NETWORK COMPONENT:
        setmNetworkComponent(DaggerNetworkComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .networkModule(new NetworkModule(RESTMockServer.getUrl()))
                .build());
    }
}
