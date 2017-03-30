package com.huhx0015.gw2at.runners;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.TestLifecycle;

/**
 * Source: https://github.com/andrzejchm/RESTMock/blob/develop/androidsample/src/test/java/io/appflate/restmock/androidsample/robolectric/AndroidSampleRobolectricRunner.java
 */

public class GW2RoboElectricRunner extends RobolectricTestRunner {

    /**
     * Creates a runner to run {@code testClass}. Looks in your working directory for your
     * AndroidManifest.xml file and res directory by default.
     *
     * @param testClass the test class to be run
     * @throws InitializationError if junit says so
     */
    public GW2RoboElectricRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    public Class<? extends TestLifecycle> getTestLifecycleClass() {
        return GW2TestLifecycle.class;
    }
}
