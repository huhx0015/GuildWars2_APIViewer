package com.huhx0015.gw2at.viewmodels.fragments;

import android.databinding.BaseObservable;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ApiFragmentViewModel extends BaseObservable {

    private String mApiNameText;

    public ApiFragmentViewModel(String apiName) {
        this.mApiNameText = apiName;
    }

    public String getApiNameText() {
        return mApiNameText;
    }
}
