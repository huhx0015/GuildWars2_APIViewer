package com.huhx0015.gw2at.viewmodels.adapters;

import android.databinding.BaseObservable;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class QuaggansAdapterViewModel extends BaseObservable {

    private String mQuaggansImageUrl;
    private String mQuaggansNameText;

    public QuaggansAdapterViewModel(String name, String url) {
        this.mQuaggansNameText = name;
        this.mQuaggansImageUrl = url;
    }

    public String getQuaggansImageUrl() {
        return mQuaggansImageUrl;
    }

    public String getQuaggansNameText() {
        return mQuaggansNameText;
    }
}