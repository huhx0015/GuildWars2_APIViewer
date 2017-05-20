package com.huhx0015.gw2at.view.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.huhx0015.gw2at.application.GW2Application;
import javax.inject.Inject;
import retrofit2.Retrofit;

/**
 * Created by Michael Yoon Huh on 3/30/2017.
 */

public class ApiActivity extends AppCompatActivity {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // DEPENDENCY INJECTION VARIABLES
    @Inject Retrofit mNetworkAdapter;

    /** FRAGMENT LIFECYCLE METHODS _____________________________________________________________ **/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((GW2Application) getApplication()).getNetworkComponent().inject(this);
    }

    /** GET METHODS ____________________________________________________________________________ **/

    public Retrofit getNetworkAdapter() {
        return mNetworkAdapter;
    }
}
