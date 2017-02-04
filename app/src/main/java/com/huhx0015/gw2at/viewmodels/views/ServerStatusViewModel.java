package com.huhx0015.gw2at.viewmodels.views;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import com.huhx0015.gw2at.BR;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ServerStatusViewModel extends BaseObservable {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    @Bindable
    public Drawable serverStatusDrawable;
    @Bindable
    public String serverStatusText;
    @Bindable
    public String worldIdText;
    @Bindable
    public String worldNameText;

    /** SET METHODS ____________________________________________________________________________ **/

    public void setServerStatusDrawable(int drawable, Context context) {
        this.serverStatusDrawable = ContextCompat.getDrawable(context, drawable);
        notifyPropertyChanged(BR.serverStatusDrawable);
    }

    public void setServerStatusText(String serverStatus) {
        this.serverStatusText = serverStatus;
        notifyPropertyChanged(BR.serverStatusText);
    }

    public void setWorldIdText(String worldId) {
        this.worldIdText = worldId;
        notifyPropertyChanged(BR.worldIdText);
    }

    public void setWorldNameText(String worldName) {
        this.worldNameText = worldName;
        notifyPropertyChanged(BR.worldNameText);
    }
}
