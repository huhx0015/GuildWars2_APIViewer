package com.huhx0015.mgw2s.viewmodels.adapters;

import android.databinding.BaseObservable;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ServerStatusAdapterViewModel extends BaseObservable {

    private String mServerStatusText;
    private String mWorldNameText;

    public ServerStatusAdapterViewModel(String worldName, String serverStatus) {
        this.mWorldNameText = worldName;
        this.mServerStatusText = serverStatus;
    }

    public String getServerStatusText() {
        return mServerStatusText;
    }

    public String getWorldNameText() {
        return mWorldNameText;
    }

    public void setServerStatusText(String serverStatus) {
        this.mServerStatusText = serverStatus;
    }

    public void setWorldNameText(String worldName) {
        this.mWorldNameText = worldName;
    }
}
