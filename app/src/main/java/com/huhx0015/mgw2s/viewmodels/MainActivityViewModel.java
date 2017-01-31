package com.huhx0015.mgw2s.viewmodels;

import android.view.View;
import java.util.Observable;

/**
 * Created by Michael Yoon Huh on 1/31/2017.
 */

public class MainActivityViewModel extends Observable {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // LISTENER VARIABLES:
    private MainActivityViewModelListener mListener;

    /** VIEW MODEL METHODS _____________________________________________________________________ **/

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
