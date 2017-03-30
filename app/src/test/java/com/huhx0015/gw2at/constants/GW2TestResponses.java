package com.huhx0015.gw2at.constants;

/**
 * Created by Michael Yoon Huh on 3/30/2017.
 */

public class GW2TestResponses {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // TEST RESPONSE CONSTANTS:
    public static final String TEST_EXPECTED = "Expected ";
    public static final String TEST_FOUND = ", actual value was ";
    public static final String TEST_VARIABLE_NULL = "Variable was null.";

    /** TEST RESPONSE METHODS __________________________________________________________________ **/

    public static String getTestValueResponse(String expectedValue, String actualValue) {
        return TEST_EXPECTED + expectedValue + TEST_FOUND + actualValue + ".";
    }
}