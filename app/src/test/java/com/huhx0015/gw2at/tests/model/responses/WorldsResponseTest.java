package com.huhx0015.gw2at.tests.model.responses;

import com.huhx0015.gw2at.BuildConfig;
import com.huhx0015.gw2at.application.GW2TestApplication;
import com.huhx0015.gw2at.constants.GW2TestConstants;
import com.huhx0015.gw2at.constants.GW2TestResponses;
import com.huhx0015.gw2at.interfaces.RetrofitInterface;
import com.huhx0015.gw2at.model.responses.WorldsResponse;
import com.huhx0015.gw2at.runners.GW2RoboElectricRunner;
import com.huhx0015.gw2at.view.activities.ApiActivity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import java.util.List;
import io.appflate.restmock.RESTMockServer;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import static io.appflate.restmock.utils.RequestMatchers.pathContains;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Michael Yoon Huh on 6/6/2017.
 *
 * NOTE: Configure your working directory to the project's default module path if
 * AndroidManifest.xml file cannot be found.
 */

@RunWith(GW2RoboElectricRunner.class)
@Config(constants = BuildConfig.class,
        application = GW2TestApplication.class,
        sdk = 25)
public class WorldsResponseTest {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // ACTIVITY VARIABLES
    private ApiActivity mActivity;

    // CONSTANT VARIABLES
    private static final String TEST_JSON_DATA_PATH = GW2TestConstants.TEST_RESPONSES_PATH + "worldsMockData.json";
    private static final String TEST_GET_PATH = "worlds";

    // NETWORK VARIABLES
    private Retrofit mNetworkAdapter;

    // TEST VARIABLES
    private static final int TEST_WORLD_SIZE = 3;
    private static final int TEST_ID = 1001;
    private static final String TEST_WORLD_NAME = "Borlis Pass";
    private static final String TEST_POPULATION = "VeryHigh";

    /** INITIALIZATION METHODS _________________________________________________________________ **/

    @Before
    public void setup() {
        mActivity = Robolectric.setupActivity(ApiActivity.class);
        mNetworkAdapter = mActivity.getNetworkAdapter();
        RESTMockServer.reset();
    }

    /** TEST METHODS ___________________________________________________________________________ **/

    @Test
    public void testValidQuaggansResponse() {
        RESTMockServer.whenGET(pathContains(TEST_GET_PATH)).thenReturnFile(GW2TestConstants.TEST_HTTP_OK, TEST_JSON_DATA_PATH);

        RetrofitInterface worldsRequest = mNetworkAdapter.create(RetrofitInterface.class);
        Observable<List<WorldsResponse>> call = worldsRequest.getWorlds(GW2TestConstants.TEST_QUERY_ALL);
        call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<WorldsResponse>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onNext(List<WorldsResponse> response) {

                        // RESPONSE ASSERTIONS:
                        assertNotNull(GW2TestResponses.TEST_VARIABLE_NULL, response);
                        assertFalse(response.isEmpty());
                        assertNotNull(GW2TestResponses.TEST_VARIABLE_NULL, response.get(0));

                        // LIST ASSERTIONS:
                        assertEquals(TEST_WORLD_SIZE, response.size());

                        // WORLD ID ASSERTION:
                        int id = response.get(0).getId();
                        assertEquals(TEST_ID, id);

                        // WORLD NAME ASSERTION:
                        String name = response.get(1).getName();
                        assertNotNull(GW2TestResponses.TEST_VARIABLE_NULL, name);
                        assertEquals(TEST_WORLD_NAME, name);

                        // POPULATION ASSERTION:
                        String population = response.get(2).getPopulation();
                        assertNotNull(GW2TestResponses.TEST_VARIABLE_NULL, population);
                        assertEquals(TEST_POPULATION, population);
                    }

                    @Override
                    public void onError(Throwable t) {}

                    @Override
                    public void onComplete() {}
                });
    }
}
