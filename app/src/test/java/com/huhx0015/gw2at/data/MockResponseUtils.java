package com.huhx0015.gw2at.data;

import com.huhx0015.gw2at.model.responses.QuaggansResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class MockResponseUtils {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // TEST VARIABLES
    private static final String TEST_ID = "box";
    private static final String TEST_URL = "https://static.staticwars.com/quaggans/box.jpg";

    /** MOCK RESPONSE METHODS __________________________________________________________________ **/

    // QUAGGANS:
    public static List<QuaggansResponse> getMockQuaggansResponse() {
        List<QuaggansResponse> mockResponse = new ArrayList<>();
        mockResponse.add(new QuaggansResponse(TEST_ID, TEST_URL));
        return mockResponse;
    }
}
