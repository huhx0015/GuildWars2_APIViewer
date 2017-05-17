package com.huhx0015.gw2at.view.fragments;

import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huhx0015.gw2at.R;
import com.huhx0015.gw2at.databinding.FragmentApiRecyclerviewBinding;
import com.huhx0015.gw2at.interfaces.RetrofitInterface;
import com.huhx0015.gw2at.models.responses.WorldsResponse;
import com.huhx0015.gw2at.view.adapters.ServerStatusAdapter;
import com.huhx0015.gw2at.utils.DialogUtils;
import com.huhx0015.gw2at.utils.SnackbarUtils;
import java.util.ArrayList;
import java.util.List;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ServerStatusFragment extends ApiFragment {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // DATABINDING VARIABLES
    private FragmentApiRecyclerviewBinding mBinding;

    // DATA VARIABLES
    private List<WorldsResponse> mWorldList;

    // LOGGING VARIABLES
    private static final String LOG_TAG = ServerStatusFragment.class.getSimpleName();

    // PARCELABLE VARIABLES
    private static final String SERVER_STATUS_FRAGMENT_WORLD_LIST = LOG_TAG + "_WORLD_LIST";

    // RECYCLERVIEW VARIABLES
    private static final int SERVER_STATUS_PREFETCH_VALUE = 6;

    /** CONSTRUCTOR METHODS ____________________________________________________________________ **/

    public static ServerStatusFragment newInstance() {
        return new ServerStatusFragment();
    }

    /** FRAGMENT LIFECYCLE METHODS _____________________________________________________________ **/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(getActivity().getLayoutInflater(), R.layout.fragment_api_recyclerview, null, false);
        initLayout();

        if (savedInstanceState != null) {
            mWorldList = savedInstanceState.getParcelableArrayList(SERVER_STATUS_FRAGMENT_WORLD_LIST);

            if (mWorldList != null) {
                setRecyclerView();
            } else {
                queryWorldStatus();
            }
        } else {
            queryWorldStatus();
        }

        return mBinding.getRoot();
    }

    /** FRAGMENT EXTENSION METHODS _____________________________________________________________ **/

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mWorldList != null) {
            outState.putParcelableArrayList(SERVER_STATUS_FRAGMENT_WORLD_LIST, new ArrayList<>(mWorldList));
        }
    }

    /** LAYOUT METHODS _________________________________________________________________________ **/

    private void initLayout() {
        initRecyclerView();
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        layoutManager.setItemPrefetchEnabled(true);
        layoutManager.setInitialPrefetchItemCount(SERVER_STATUS_PREFETCH_VALUE);
        mBinding.apiRecyclerview.setLayoutManager(layoutManager);
        mBinding.apiRecyclerview.setHasFixedSize(true);
        mBinding.apiRecyclerview.setDrawingCacheEnabled(true);
        mBinding.apiRecyclerview.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
    }

    private void setRecyclerView() {
        ServerStatusAdapter adapter = new ServerStatusAdapter(mWorldList, mContext);
        adapter.setHasStableIds(true);
        mBinding.apiRecyclerview.setAdapter(adapter);
    }

    /** NETWORK METHODS ________________________________________________________________________ **/

    private void queryWorldStatus() {
        final ProgressDialog progressDialog = DialogUtils.createProgressDialog(mContext);

        RetrofitInterface worldRequest = mNetworkAdapter.create(RetrofitInterface.class);
        Observable<List<WorldsResponse>> call = worldRequest.getWorlds("all");
        call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<WorldsResponse>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onNext(List<WorldsResponse> response) {
                        mWorldList = response;
                        if (response != null) {
                            setRecyclerView();
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        progressDialog.dismiss();
                        SnackbarUtils.displaySnackbarWithAction(mBinding.getRoot(), t.getLocalizedMessage(),
                                Snackbar.LENGTH_INDEFINITE, Color.RED, getString(R.string.retry),
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        queryWorldStatus();
                                    }
                                });
                        Log.e(LOG_TAG, "queryWorldStatus(): ERROR: " + t.getLocalizedMessage());
                    }

                    @Override
                    public void onComplete() {
                        progressDialog.dismiss();
                    }
                });
    }
}