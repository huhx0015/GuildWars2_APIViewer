package com.huhx0015.gw2at.viewmodels.adapters;

import android.databinding.BaseObservable;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ServerStatusAdapterViewModel extends BaseObservable {

    private String mWorldIdText;
    private String mServerStatusText;
    private String mWorldNameText;

    public ServerStatusAdapterViewModel(String worldName, String id, String serverStatus) {
        this.mWorldNameText = worldName;
        this.mWorldIdText = id;
        this.mServerStatusText = serverStatus;
    }

    public String getServerStatusText() {
        return mServerStatusText;
    }

    public String getWorldIdText() {
        return mWorldIdText;
    }

    public String getWorldNameText() {
        return mWorldNameText;
    }

    public void setServerStatusText(String serverStatus) {
        this.mServerStatusText = serverStatus;
    }

    public void setWorldIdText(String mWorldIdText) {
        this.mWorldIdText = mWorldIdText;
    }

    public void setWorldNameText(String worldName) {
        this.mWorldNameText = worldName;
    }
}
