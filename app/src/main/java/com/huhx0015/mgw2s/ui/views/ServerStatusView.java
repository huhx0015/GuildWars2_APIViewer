package com.huhx0015.mgw2s.ui.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ServerStatusView extends RelativeLayout {

    public ServerStatusView(Context context) {
        super(context);
    }

    public ServerStatusView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ServerStatusView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ServerStatusView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
