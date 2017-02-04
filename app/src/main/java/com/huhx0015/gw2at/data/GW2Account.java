package com.huhx0015.gw2at.data;

import com.huhx0015.gw2at.models.responses.account.AccountResponse;

/**
 * Created by Michael Yoon Huh on 2/2/2017.
 */

public class GW2Account {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // ACCOUNT VARIABLES
    private AccountResponse mAccount;

    // CREDENTIAL VARIABLES
    private String mApiKey;
    private String mAuthToken;

    /** INSTANCE VARIABLE ______________________________________________________________________ **/

    private static GW2Account mGW2Account;

    /** INSTANCE METHODS _______________________________________________________________________ **/

    public static GW2Account getInstance() {
        if (mGW2Account == null) {
            mGW2Account = new GW2Account();
        }
        return mGW2Account;
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
