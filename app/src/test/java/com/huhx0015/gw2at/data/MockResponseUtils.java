package com.huhx0015.gw2at.data;

import com.huhx0015.gw2at.models.responses.QuaggansResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class MockResponseUtils {

    // QUAGGANS:
    public static List<QuaggansResponse> getMockQuaggansResponse() {
        List<QuaggansResponse> mockResponse = new ArrayList<>();
        mockResponse.add(new QuaggansResponse("seahawks", "https://static.staticwars.com/quaggans/seahawks.jpg"));
        mockResponse.add(new QuaggansResponse("aloha", "https://static.staticwars.com/quaggans/aloha.jpg"));
        return mockResponse;
    }
}
