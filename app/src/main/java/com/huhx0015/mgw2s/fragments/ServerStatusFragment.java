package com.huhx0015.mgw2s.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import javax.inject.Inject;
import retrofit2.Retrofit;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ServerStatusFragment extends Fragment {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // LOGGING VARIABLES
    private static final String LOG_TAG = ServerStatusFragment.class.getSimpleName();

    // DEPENDENCY INJECTION VARIABLES
    @Inject Retrofit mNetworkAdapter;

    /** CONSTRUCTOR METHODS ____________________________________________________________________ **/

    public static ServerStatusFragment newInstance() {
        return new ServerStatusFragment();
    }

    /** FRAGMENT LIFECYCLE METHODS _____________________________________________________________ **/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /** **/
}
