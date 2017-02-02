package com.huhx0015.gw2at.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 *
 * Source: http://stackoverflow.com/questions/4605527/converting-pixels-to-dp
 */

public class DisplayUtils {

    /**
     * convertDpToPixel(): This method converts dp unit to equivalent pixels, depending on device density.
     *
     * @param dp A value in dp (density independent pixels) unit. Which we need to convert into pixels
     * @param context Context to get resources and device specific display metrics
     * @return A float value to represent px equivalent to dp depending on device density
     */
    public static float convertDpToPixel(float dp, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return dp * ((float)metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    /**
     * convertPixelsToDp(): This method converts device specific pixels to density independent pixels.
     *
     * @param px A value in px (pixels) unit. Which we need to convert into db
     * @param context Context to get resources and device specific display metrics
     * @return A float value to represent dp equivalent to px value
     */
    public static float convertPixelsToDp(float px, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return px / ((float)metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    /**
     * getOrientation(): Retrieves the device's current orientation.
     *
     * Configuration.ORIENTATION_PORTRAIT
     * Configuration.ORIENTATION_LANDSCAPE
     * @param context
     * @return
     */
    public static int getOrientation(Context context) {
        return context.getResources().getConfiguration().orientation;
    }
}
