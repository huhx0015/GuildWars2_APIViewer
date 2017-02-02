package com.huhx0015.gw2at.viewmodels.views;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.graphics.drawable.Drawable;
import com.huhx0015.gw2at.BR;
import com.huhx0015.gw2at.R;
import com.huhx0015.gw2at.utils.BindableFieldTarget;
import com.squareup.picasso.Picasso;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class QuaggansViewModel extends BaseObservable implements BindableFieldTarget.BindableFieldTargetListener {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // LOGGING VARIABLES
    private static final String LOG_TAG = QuaggansViewModel.class.getSimpleName();

    // TARGET VARIABLES
    private BindableFieldTarget mTarget;

    // VIEWMODEL VARIABLES
    @Bindable
    public boolean quaggansProgressBarVisiblility;
    @Bindable
    public String quaggansNameText;
    public ObservableField<Drawable> quaggansImage;

    /** SET METHODS ____________________________________________________________________________ **/

    public void setQuaggansProgressBarVisible(boolean isVisible) {
        this.quaggansProgressBarVisiblility = isVisible;
        notifyPropertyChanged(BR.quaggansProgressBarVisiblility);
    }

    public void setQuaggansImage(String imageUrl, Context context) {
        quaggansImage = new ObservableField<>();
        mTarget = new BindableFieldTarget(quaggansImage, context.getResources());
        mTarget.setListener(this);
        Picasso.with(context)
                .load(imageUrl)
                .error(R.drawable.icon_unavailable)
                .into(mTarget);
    }

    public void setQuaggansNameText(String name) {
        this.quaggansNameText = name;
        notifyPropertyChanged(BR.quaggansNameText);
    }

    /** INTERFACE METHODS ______________________________________________________________________ **/

    @Override
    public void onBitmapLoaded() {
        setQuaggansProgressBarVisible(false);
        //notifyChange(); // TODO: Images load, but causes massive performance issue.
    }

    @Override
    public void onBitmapFailed() {
        setQuaggansProgressBarVisible(false);
    }

    @Override
    public void onPrepareLoaded() {
        setQuaggansProgressBarVisible(true);
    }
}