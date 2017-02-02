package com.huhx0015.gw2at.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import com.huhx0015.gw2at.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class BindingUtils {

    @BindingAdapter({"app:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.with(view.getContext())
                .load(imageUrl)
                .error(R.drawable.icon_unavailable)
                .into(view);
    }
}
