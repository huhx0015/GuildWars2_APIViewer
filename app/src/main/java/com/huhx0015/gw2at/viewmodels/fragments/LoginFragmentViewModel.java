package com.huhx0015.gw2at.viewmodels.fragments;

import android.databinding.BaseObservable;
import android.view.View;

/**
 * Created by Michael Yoon Huh on 2/2/2017.
 */

public class LoginFragmentViewModel extends BaseObservable {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    private boolean mLoginContainerVisiblility = true;

    // LISTENER VARIABLES:
    private LoginFragmentViewModelListener mListener;

    /** CONSTRUCTOR METHODS ____________________________________________________________________ **/

    public LoginFragmentViewModel(boolean isLoginVisible) {
        this.mLoginContainerVisiblility = isLoginVisible;
    }

    /** GET METHODS ____________________________________________________________________________ **/

    public boolean getLoginContainerVisible() {
        return mLoginContainerVisiblility;
    }

    /** SET METHODS ____________________________________________________________________________ **/

    public void setLoginContainerVisible(boolean visible) {
        this.mLoginContainerVisiblility = visible;
        notifyChange();
    }

    /** LISTENER METHODS _______________________________________________________________________ **/

    public void setListener(LoginFragmentViewModelListener listener) {
        this.mListener = listener;
    }

    /** CLICK METHODS __________________________________________________________________________ **/

    public void onClickLoginButton(View view) {
        if (mListener != null) {
            mListener.onLoginButtonClicked();
        }
    }

    /** INTERFACE ______________________________________________________________________________ **/

    public interface LoginFragmentViewModelListener {
        void onLoginButtonClicked();
    }
}
