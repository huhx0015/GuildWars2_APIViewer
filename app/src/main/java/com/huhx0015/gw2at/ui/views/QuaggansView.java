package com.huhx0015.gw2at.ui.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.huhx0015.gw2at.databinding.ViewQuaggansBinding;
import com.huhx0015.gw2at.viewmodels.views.QuaggansViewModel;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

@BindingMethods({
        @BindingMethod(type = QuaggansView.class, attribute = "app:quaggansNameText", method = "setQuaggansName"),
        @BindingMethod(type = QuaggansView.class, attribute = "app:quaggansImageUrl", method = "setQuaggansImage")
})
public class QuaggansView extends RelativeLayout {

    private Context mContext;
    private QuaggansViewModel mViewModel;
    private ViewQuaggansBinding mBinding;

    public QuaggansView(Context context) {
        super(context);
        mContext = context;
        initView();
    }

    public QuaggansView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initView();
    }

    public QuaggansView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initView();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public QuaggansView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mContext = context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mBinding = ViewQuaggansBinding.inflate(inflater, this, true);
        mViewModel = new QuaggansViewModel();
        mBinding.setViewModel(mViewModel);
        initText();
    }

    private void initText() {
        mBinding.quaggansNameText.setShadowLayer(4, 2, 2, Color.BLACK);
    }

    public void setQuaggansName(String name) {
        mViewModel.setQuaggansNameText(name);
    }

    public void setQuaggansImage(String imageUrl) {
        mViewModel.setQuaggansImage(imageUrl, mContext);
    }
}
