package com.huhx0015.gw2at.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.huhx0015.gw2at.application.GW2Application;
import javax.inject.Inject;
import retrofit2.Retrofit;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ApiFragment extends Fragment {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // FRAGMENT VARIABLES
    protected Context mContext;

    // DEPENDENCY INJECTION VARIABLES
    @Inject Retrofit mNetworkAdapter;

    /** FRAGMENT LIFECYCLE METHODS _____________________________________________________________ **/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getContext();
        ((GW2Application) getActivity().getApplication()).getNetworkComponent().inject(this);
    }
}