package com.huhx0015.mgw2s.ui.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.huhx0015.mgw2s.R;
import com.huhx0015.mgw2s.databinding.ViewServerStatusBinding;
import com.huhx0015.mgw2s.utils.DrawableReferenceUtils;
import com.huhx0015.mgw2s.viewmodels.views.ServerStatusViewModel;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ServerStatusView extends RelativeLayout {

    private String mServerStatus;
    private String mWorldName;
    private ViewServerStatusBinding mBinding;

    public ServerStatusView(Context context) {
        super(context);
        initView(context);
    }

    public ServerStatusView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttributes(context, attrs);
        initView(context);
    }

    public ServerStatusView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAttributes(context, attrs);
        initView(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ServerStatusView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initAttributes(context, attrs);
        initView(context);
    }

    private void initView(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mBinding = ViewServerStatusBinding.inflate(inflater, this, true);
        ServerStatusViewModel viewModel = new ServerStatusViewModel(mWorldName, mServerStatus,
                DrawableReferenceUtils.getPopulationStatusDrawable(mServerStatus));
        mBinding.setViewModel(viewModel);
        initText();
    }

    private void initAttributes(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.ServerStatusView, 0, 0);
        try {
            mWorldName = typedArray.getString(R.styleable.ServerStatusView_worldNameText);
            mServerStatus = typedArray.getString(R.styleable.ServerStatusView_serverStatusText);
        } finally {
            typedArray.recycle();
        }
    }

    private void initText() {
        mBinding.worldText.setShadowLayer(4, 2, 2, Color.BLACK);
        mBinding.worldNameText.setShadowLayer(4, 2, 2, Color.BLACK);
    }
}
