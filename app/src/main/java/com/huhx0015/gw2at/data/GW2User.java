package com.huhx0015.gw2at.data;

import com.huhx0015.gw2at.models.responses.account.AccountResponse;
import javax.inject.Singleton;

/**
 * Created by Michael Yoon Huh on 2/2/2017.
 */

@Singleton
public class GW2User {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // ACCOUNT VARIABLES
    private AccountResponse mAccount;

    // CREDENTIAL VARIABLES
    private String mApiKey;
    private String mAuthToken;

    /** INSTANCE VARIABLE ______________________________________________________________________ **/

    private static GW2User mGW2User;

    /** INSTANCE METHODS _______________________________________________________________________ **/

    public static GW2User getInstance() {
        if (mGW2User == null) {
            mGW2User = new GW2User();
        }
        return mGW2User;
    }

    /** GET METHODS ____________________________________________________________________________ **/

    public AccountResponse getAccount() {
        return mAccount;
    }

    public String getApiKey() {
        return mApiKey;
    }

    public String getAuthToken() {
        return mAuthToken;
    }

    /** SET METHODS ____________________________________________________________________________ **/

    public void setAccount(AccountResponse mAccount) {
        this.mAccount = mAccount;
    }

    public void setApiKey(String mApiKey) {
        this.mApiKey = mApiKey;
    }

    public void setAuthToken(String mAuthToken) {
        this.mAuthToken = mAuthToken;
    }
}
