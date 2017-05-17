package com.huhx0015.gw2at.view.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.huhx0015.gw2at.databinding.ViewServerStatusBinding;
import com.huhx0015.gw2at.utils.DrawableReferenceUtils;
import com.huhx0015.gw2at.viewmodels.views.ServerStatusViewModel;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

@BindingMethods({
        @BindingMethod(type = ServerStatusView.class, attribute = "app:serverStatusText", method = "setServerStatus"),
        @BindingMethod(type = ServerStatusView.class, attribute = "app:worldIdText", method = "setWorldId"),
        @BindingMethod(type = ServerStatusView.class, attribute = "app:worldNameText", method = "setWorldName")
})
public class ServerStatusView extends RelativeLayout {

    private Context mContext;
    private ServerStatusViewModel mViewModel;
    private ViewServerStatusBinding mBinding;

    public ServerStatusView(Context context) {
        super(context);
        mContext = context;
        initView();
    }

    public ServerStatusView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initView();
    }

    public ServerStatusView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initView();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ServerStatusView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mContext = context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mBinding = ViewServerStatusBinding.inflate(inflater, this, true);
        mViewModel = new ServerStatusViewModel();
        mBinding.setViewModel(mViewModel);
        initText();
    }

    private void initText() {
        mBinding.worldText.setShadowLayer(4, 2, 2, Color.BLACK);
        mBinding.worldIdText.setShadowLayer(4, 2, 2, Color.BLACK);
        mBinding.worldNameText.setShadowLayer(4, 2, 2, Color.BLACK);
        mBinding.serverStatusText.setShadowLayer(2, 2, 2, Color.BLACK);
    }

    public void setWorldName(String worldName) {
        mViewModel.setWorldNameText(worldName);
    }

    public void setWorldId(String worldId) {
        mViewModel.setWorldIdText(worldId);
    }

    public void setServerStatus(String serverStatus) {
        mViewModel.setServerStatusText(serverStatus);
        mViewModel.setServerStatusDrawable(DrawableReferenceUtils.getPopulationStatusDrawable(serverStatus), mContext);
    }
}
