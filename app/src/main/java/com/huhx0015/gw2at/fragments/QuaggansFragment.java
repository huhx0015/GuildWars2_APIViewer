package com.huhx0015.gw2at.fragments;

import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huhx0015.gw2at.R;
import com.huhx0015.gw2at.databinding.FragmentApiBinding;
import com.huhx0015.gw2at.interfaces.RetrofitInterface;
import com.huhx0015.gw2at.models.responses.QuaggansResponse;
import com.huhx0015.gw2at.ui.adapters.QuaggansAdapter;
import com.huhx0015.gw2at.utils.DialogUtils;
import com.huhx0015.gw2at.utils.SnackbarUtils;
import com.huhx0015.gw2at.viewmodels.fragments.ApiFragmentViewModel;
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

public class QuaggansFragment extends ApiFragment {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // DATABINDING VARIABLES
    private FragmentApiBinding mBinding;

    // DATA VARIABLES
    private List<QuaggansResponse> mQuaggansList;

    // LOGGING VARIABLES
    private static final String LOG_TAG = ServerStatusFragment.class.getSimpleName();

    // RECYCLERVIEW VARIABLES
    private static final int QUAGGANS_GRID_COLUMNS = 2;

    // PARCELABLE VARIABLES
    private static final String QUAGGANS_FRAGMENT_QUAGGANS_LIST = LOG_TAG + "_QUAGGANS_LIST";

    /** CONSTRUCTOR METHODS ____________________________________________________________________ **/

    public static QuaggansFragment newInstance() {
        return new QuaggansFragment();
    }

    /** FRAGMENT LIFECYCLE METHODS _____________________________________________________________ **/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(getActivity().getLayoutInflater(), R.layout.fragment_api, null, false);
        ApiFragmentViewModel viewModel = new ApiFragmentViewModel(getString(R.string.quaggans));
        mBinding.setViewModel(viewModel);
        initLayout();

        if (savedInstanceState != null) {
            mQuaggansList = savedInstanceState.getParcelableArrayList(QUAGGANS_FRAGMENT_QUAGGANS_LIST);
            setRecyclerView();
        } else {
            queryQuaggansList();
        }

        return mBinding.getRoot();
    }

    /** FRAGMENT EXTENSION METHODS _____________________________________________________________ **/

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList(QUAGGANS_FRAGMENT_QUAGGANS_LIST, new ArrayList<>(mQuaggansList));
    }

    /** LAYOUT METHODS _________________________________________________________________________ **/

    private void initLayout() {
        initRecyclerView();
        initText();
    }

    private void initRecyclerView() {
        GridLayoutManager layoutManager = new GridLayoutManager(mContext, QUAGGANS_GRID_COLUMNS);
        mBinding.apiRecyclerview.setLayoutManager(layoutManager);
    }

    private void initText() {
        mBinding.apiNameText.setShadowLayer(4, 2, 2, Color.BLACK);
    }

    private void setRecyclerView() {
        QuaggansAdapter adapter = new QuaggansAdapter(mQuaggansList, mContext);
        mBinding.apiRecyclerview.setAdapter(adapter);
    }

    /** NETWORK METHODS ________________________________________________________________________ **/

    private void queryQuaggansList() {
        final ProgressDialog progressDialog = DialogUtils.createProgressDialog(mContext);

        RetrofitInterface quaggansRequest = mNetworkAdapter.create(RetrofitInterface.class);
        Observable<List<QuaggansResponse>> call = quaggansRequest.getQuaggans("all");
        call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<QuaggansResponse>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onNext(List<QuaggansResponse> response) {
                        mQuaggansList = response;
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
                                        queryQuaggansList();
                                    }
                                });
                        Log.e(LOG_TAG, "queryQuaggansList(): ERROR: " + t.getLocalizedMessage());
                    }

                    @Override
                    public void onComplete() {
                        progressDialog.dismiss();
                    }
                });
    }
}