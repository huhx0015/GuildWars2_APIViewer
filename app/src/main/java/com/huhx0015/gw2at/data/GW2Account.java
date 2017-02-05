package com.huhx0015.gw2at.data;

import com.huhx0015.gw2at.models.responses.account.AccountResponse;

import java.util.List;

/**
 * Created by Michael Yoon Huh on 2/2/2017.
 */

public class GW2Account {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // ACCOUNT VARIABLES
    private AccountResponse mAccount;

    // CHARACTER VARIABLES
    private List<String> mCharacterList;

    // CREDENTIAL VARIABLES
    private String mApiKey;

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

    public List<String> getCharacterList() {
        return mCharacterList;
    }

    /** SET METHODS ____________________________________________________________________________ **/

    public void setAccount(AccountResponse mAccount) {
        this.mAccount = mAccount;
    }

    public void setApiKey(String mApiKey) {
        this.mApiKey = mApiKey;
    }

    public void setCharacterList(List<String> characterList) {
        this.mCharacterList = characterList;
    }
}
