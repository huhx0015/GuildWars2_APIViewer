package com.huhx0015.gw2at.data;

import com.huhx0015.gw2at.model.responses.QuaggansResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class MockResponseUtils {

    /** MOCK RESPONSE METHODS __________________________________________________________________ **/

    // QUAGGANS:
    public static List<QuaggansResponse> getMockQuaggansResponse() {
        List<QuaggansResponse> mockResponse = new ArrayList<>();
        mockResponse.add(new QuaggansResponse("box", "https://static.staticwars.com/quaggans/box.jpg"));
        return mockResponse;
    }
}
