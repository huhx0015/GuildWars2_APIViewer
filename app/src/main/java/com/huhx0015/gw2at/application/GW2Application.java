package com.huhx0015.gw2at.application;

import android.app.Application;
import android.content.Context;
import com.huhx0015.gw2at.constants.GW2Constants;
import com.huhx0015.gw2at.injections.components.AccountComponent;
import com.huhx0015.gw2at.injections.components.DaggerAccountComponent;
import com.huhx0015.gw2at.injections.components.DaggerNetworkComponent;
import com.huhx0015.gw2at.injections.components.NetworkComponent;
import com.huhx0015.gw2at.injections.modules.ApplicationModule;
import com.huhx0015.gw2at.injections.modules.NetworkModule;
import com.huhx0015.gw2at.injections.modules.UserModule;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by Michael Yoon Huh on 1/31/2017.
 */

public class GW2Application extends Application {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    private AccountComponent mAccountComponent;
    private NetworkComponent mNetworkComponent;
    private RefWatcher mRefWatcher;

    /** APPLICATION LIFECYCLE METHODS __________________________________________________________ **/

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

    /** GET METHODS ____________________________________________________________________________ **/

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

    /** SET METHODS ____________________________________________________________________________ **/

    public void setmNetworkComponent(NetworkComponent mNetworkComponent) {
        this.mNetworkComponent = mNetworkComponent;
    }
}