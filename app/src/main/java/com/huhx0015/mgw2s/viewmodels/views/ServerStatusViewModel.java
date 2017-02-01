package com.huhx0015.mgw2s.viewmodels.views;

import android.databinding.BaseObservable;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ServerStatusViewModel extends BaseObservable {

    private int mServerStatusDrawable;

    private String mServerStatusText;
    private String mWorldNameText;

    public ServerStatusViewModel(String worldName, String serverStatus, int drawable) {
        this.mWorldNameText = worldName;
        this.mServerStatusText = serverStatus;
        this.mServerStatusDrawable = drawable;
    }

    public int getServerStatusDrawable() {
        return mServerStatusDrawable;
    }

    public String getServerStatusText() {
        return mServerStatusText;
    }

    public String getWorldNameText() {
        return mWorldNameText;
    }
}
