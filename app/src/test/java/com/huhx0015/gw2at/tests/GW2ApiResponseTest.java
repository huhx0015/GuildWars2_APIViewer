package com.huhx0015.gw2at.tests;

import com.huhx0015.gw2at.view.activities.ApiActivity;
import com.huhx0015.gw2at.application.GW2TestApplication;
import com.huhx0015.gw2at.constants.GW2TestResponses;
import com.huhx0015.gw2at.interfaces.RetrofitInterface;
import com.huhx0015.gw2at.model.responses.QuaggansResponse;
import com.huhx0015.gw2at.runners.GW2RoboElectricRunner;
import com.huhx0015.gw2at.BuildConfig;
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
 * Created by Michael Yoon Huh on 3/30/2017.
 */

@RunWith(GW2RoboElectricRunner.class)
@Config(constants = BuildConfig.class,
        application = GW2TestApplication.class,
        sdk = 25)
public class GW2ApiResponseTest {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // ACTIVITY VARIABLES
    private ApiActivity mActivity;

    // NETWORK VARIABLES
    private Retrofit mNetworkAdapter;

    // TEST VARIABLES
    private static final String TEST_QUAGGANS_ID = "box";

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
        RESTMockServer.whenGET(pathContains("quaggans"))
                .thenReturnFile(200, "responses/quaggansMockData.json");

        RetrofitInterface quaggansRequest = mNetworkAdapter.create(RetrofitInterface.class);
        Observable<List<QuaggansResponse>> call = quaggansRequest.getQuaggans("all");
        call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<QuaggansResponse>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onNext(List<QuaggansResponse> response) {

                        // RESPONSE ASSERTIONS:
                        assertNotNull(GW2TestResponses.TEST_VARIABLE_NULL, response);
                        assertFalse(response.isEmpty());
                        assertNotNull(GW2TestResponses.TEST_VARIABLE_NULL, response.get(0));

                        // ID ASSERTION:
                        String id = response.get(0).getId();
                        assertNotNull(GW2TestResponses.TEST_VARIABLE_NULL, id);
                        assertEquals(TEST_QUAGGANS_ID, id);
                    }

                    @Override
                    public void onError(Throwable t) {}

                    @Override
                    public void onComplete() {}
                });
    }
}
