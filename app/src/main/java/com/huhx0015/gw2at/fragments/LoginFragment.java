package com.huhx0015.gw2at.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huhx0015.gw2at.R;
import com.huhx0015.gw2at.databinding.FragmentLoginBinding;

/**
 * Created by Michael Yoon Huh on 2/2/2017.
 */

public class LoginFragment extends ApiFragment {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // DATABINDING VARIABLES
    private FragmentLoginBinding mBinding;

    // DATA VARIABLES

    // LOGGING VARIABLES
    private static final String LOG_TAG = LoginFragment.class.getSimpleName();

    /** CONSTRUCTOR METHODS ____________________________________________________________________ **/

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    /** FRAGMENT LIFECYCLE METHODS _____________________________________________________________ **/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(getActivity().getLayoutInflater(), R.layout.fragment_login, null, false);
        initLayout();
        return mBinding.getRoot();
    }

    /** LAYOUT METHODS _________________________________________________________________________ **/

    private void initLayout() {

    }
}
