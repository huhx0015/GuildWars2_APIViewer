package com.huhx0015.gw2at.viewmodels.activities;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.huhx0015.gw2at.BR;

/**
 * Created by Michael Yoon Huh on 1/31/2017.
 */

public class MainActivityViewModel extends BaseObservable {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    @Bindable
    public String subToolbarText;

    /** SET METHODS ____________________________________________________________________________ **/

    public void setSubToolbarText(String text) {
        this.subToolbarText = text;
        notifyPropertyChanged(BR.subToolbarText);
    }
}
