package com.huhx0015.gw2at.runners;

/*
 *	Copyright (C) 2016 Scott Johnson, jaywir3@gmail.com
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 */

import android.app.Application;
import com.huhx0015.gw2at.application.GW2TestApplication;
import com.huhx0015.gw2at.interfaces.NetworkComponent;
import org.robolectric.DefaultTestLifecycle;
import org.robolectric.annotation.Config;
import org.robolectric.manifest.AndroidManifest;
import java.lang.reflect.Method;
import io.appflate.restmock.RESTMockServer;
import io.appflate.restmock.RESTMockServerStarter;
import io.appflate.restmock.android.AndroidLocalFileParser;
import io.appflate.restmock.android.AndroidLogger;
import com.huhx0015.gw2at.interfaces.DaggerNetworkComponent;
import com.huhx0015.gw2at.modules.ApplicationModule;
import com.huhx0015.gw2at.modules.NetworkModule;

/**
 * A {@link org.robolectric.TestLifecycle} implementation that sets up the dagger modules necessary
 * to use RESTMock.
 *
 * Source: https://github.com/andrzejchm/RESTMock/blob/develop/androidsample/src/test/java/io/appflate/restmock/androidsample/robolectric/AndroidSampleTestLifecycle.java
 */

public class GW2TestLifecycle extends DefaultTestLifecycle {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    private NetworkComponent mNetworkComponent;

    /** TEST LIFECYCLE METHODS _________________________________________________________________ **/

    @Override
    public Application createApplication(Method method, AndroidManifest appManifest, Config config) {
        GW2TestApplication application = (GW2TestApplication) super.createApplication(method, appManifest, config);

        RESTMockServerStarter.startSync(new AndroidLocalFileParser(application), new AndroidLogger());

        mNetworkComponent = DaggerNetworkComponent.builder()
                .applicationModule(new ApplicationModule(application))
                .networkModule(new NetworkModule(RESTMockServer.getUrl()))
                .build();

        return application;
    }
}