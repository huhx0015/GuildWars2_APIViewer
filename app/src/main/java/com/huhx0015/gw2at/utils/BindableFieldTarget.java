package com.huhx0015.gw2at.utils;

import android.content.res.Resources;
import android.databinding.ObservableField;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 *
 * Source: https://android.jlelse.eu/loading-images-with-data-binding-and-picasso-555dad683fdc#.wqu65ag8e
 */

public class BindableFieldTarget implements Target {

    private BindableFieldTargetListener mListener;
    private ObservableField<Drawable> mObservableField;
    private Resources mResources;

    public BindableFieldTarget(ObservableField<Drawable> observableField, Resources resources) {
        this.mObservableField = observableField;
        this.mResources = resources;
    }

    @Override
    public void onPrepareLoad(Drawable placeHolderDrawable) {
        mObservableField.set(placeHolderDrawable);
        if (mListener != null) {
            mListener.onPrepareLoaded();
        }
    }

    @Override
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
        mObservableField.set(new BitmapDrawable(mResources, bitmap));
        if (mListener != null) {
            mListener.onBitmapLoaded();
        }
    }

    @Override
    public void onBitmapFailed(Drawable errorDrawable) {
        mObservableField.set(errorDrawable);
        if (mListener != null) {
            mListener.onBitmapFailed();
        }
    }

    public void setListener(BindableFieldTargetListener listener) {
        this.mListener = listener;
    }

    /** INTERFACE ______________________________________________________________________________ **/

    public interface BindableFieldTargetListener {
        void onBitmapLoaded();
        void onBitmapFailed();
        void onPrepareLoaded();
    }
}
