package com.huhx0015.gw2at.fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huhx0015.gw2at.R;
import com.huhx0015.gw2at.application.GW2Application;
import com.huhx0015.gw2at.databinding.FragmentServerStatusBinding;
import com.huhx0015.gw2at.interfaces.RetrofitInterface;
import com.huhx0015.gw2at.models.responses.WorldsResponse;
import com.huhx0015.gw2at.ui.adapters.ServerStatusAdapter;
import com.huhx0015.gw2at.utils.DialogUtils;
import com.huhx0015.gw2at.utils.SnackbarUtils;
import com.huhx0015.gw2at.viewmodels.fragments.ServerStatusFragmentViewModel;
import java.util.List;
import javax.inject.Inject;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class ServerStatusFragment extends Fragment {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // BINDING VARIABLES
    private FragmentServerStatusBinding mBinding;

    // CONTEXT VARIABLES
    private Context mContext;

    // LOGGING VARIABLES
    private static final String LOG_TAG = ServerStatusFragment.class.getSimpleName();

    // DEPENDENCY INJECTION VARIABLES
    @Inject Retrofit mNetworkAdapter;

    /** CONSTRUCTOR METHODS ____________________________________________________________________ **/

    public static ServerStatusFragment newInstance() {
        return new ServerStatusFragment();
    }

    /** FRAGMENT LIFECYCLE METHODS _____________________________________________________________ **/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getContext();
        ((GW2Application) getActivity().getApplication()).getNetworkComponent().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(getActivity().getLayoutInflater(), R.layout.fragment_server_status, null, false);
        ServerStatusFragmentViewModel viewModel = new ServerStatusFragmentViewModel();
        mBinding.setViewModel(viewModel);
        initLayout();
        queryWorldStatus();
        return mBinding.getRoot();
    }

    /** LAYOUT METHODS _________________________________________________________________________ **/

    private void initLayout() {
        initRecyclerView();
        initText();
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        mBinding.serverStatusRecyclerview.setLayoutManager(layoutManager);
    }

    private void initText() {
        mBinding.serverStatusText.setShadowLayer(4, 2, 2, Color.BLACK);
    }

    private void setRecyclerView(List<WorldsResponse> worldList) {
        ServerStatusAdapter adapter = new ServerStatusAdapter(worldList, mContext);
        mBinding.serverStatusRecyclerview.setAdapter(adapter);
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
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<WorldsResponse> worldsResponses) {
                        if (worldsResponses != null) {
                            setRecyclerView(worldsResponses);
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        progressDialog.dismiss();
                        SnackbarUtils.displaySnackbarWithAction(mBinding.getRoot(), t.getLocalizedMessage(),
                                Snackbar.LENGTH_INDEFINITE, getString(R.string.retry), new View.OnClickListener() {
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
