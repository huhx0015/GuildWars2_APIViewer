package com.huhx0015.gw2at.utils;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class SnackbarUtils {

    public static void displaySnackbar(View view, String message, int length) {
        Snackbar.make(view, message, length).show();
    }

    public static void displaySnackbarWithAction(View view, String message, int length,
                                                 String action, View.OnClickListener listener) {
        Snackbar.make(view, message, length)
                .setAction(action, listener)
                .show();
    }
}
