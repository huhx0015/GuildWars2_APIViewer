package com.huhx0015.gw2at.viewmodels.activities;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import com.huhx0015.gw2at.BR;

/**
 * Created by Michael Yoon Huh on 1/31/2017.
 */

public class MainActivityViewModel extends BaseObservable {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    @Bindable
    public String subToolbarText;

    // LISTENER VARIABLES:
    private MainActivityViewModelListener mListener;

    /** SET METHODS ____________________________________________________________________________ **/

    public void setSubToolbarText(String text) {
        this.subToolbarText = text;
        notifyPropertyChanged(BR.subToolbarText);
    }

    /** LISTENER METHODS _______________________________________________________________________ **/

    public void setViewModelListener(MainActivityViewModelListener listener) {
        this.mListener = listener;
    }

    /** CLICK METHODS __________________________________________________________________________ **/

    public void onClickFabButton(View view) {
        if (mListener != null) {
            mListener.onFabButtonClicked();
        }
    }

    /** INTERFACE ______________________________________________________________________________ **/

    public interface MainActivityViewModelListener {
        void onFabButtonClicked();
    }
}
