package com.huhx0015.gw2at.fragments;

import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huhx0015.gw2at.R;
import com.huhx0015.gw2at.activities.MainActivity;
import com.huhx0015.gw2at.constants.GW2Constants;
import com.huhx0015.gw2at.data.GW2Account;
import com.huhx0015.gw2at.databinding.FragmentLoginBinding;
import com.huhx0015.gw2at.interfaces.RetrofitInterface;
import com.huhx0015.gw2at.models.responses.account.AccountResponse;
import com.huhx0015.gw2at.utils.DialogUtils;
import com.huhx0015.gw2at.utils.SnackbarUtils;
import com.huhx0015.gw2at.viewmodels.fragments.LoginFragmentViewModel;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Michael Yoon Huh on 2/2/2017.
 */

public class LoginFragment extends ApiFragment implements LoginFragmentViewModel.LoginFragmentViewModelListener {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // DATABINDING VARIABLES
    private FragmentLoginBinding mBinding;
    private LoginFragmentViewModel mViewModel;

    // LOGGING VARIABLES
    private static final String LOG_TAG = LoginFragment.class.getSimpleName();

    /** CONSTRUCTOR METHODS ____________________________________________________________________ **/

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    /** FRAGMENT LIFECYCLE METHODS _____________________________________________________________ **/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(getActivity().getLayoutInflater(), R.layout.fragment_login, null, false);
        mViewModel = new LoginFragmentViewModel(true);
        mViewModel.setListener(this);
        mBinding.setViewModel(mViewModel);
        return mBinding.getRoot();
    }

    /** FRAGMENT EXTENSION METHODS _____________________________________________________________ **/

    @Override
    public void onLoginButtonClicked() {
        queryAccount(mBinding.loginApiKeyField.toString());
    }

    /** NETWORK METHODS ________________________________________________________________________ **/

    private void queryAccount(final String key) {
        final ProgressDialog progressDialog = DialogUtils.createProgressDialog(mContext);

        RetrofitInterface accountResponse = mNetworkAdapter.create(RetrofitInterface.class);
        Observable<AccountResponse> call = accountResponse.getAccount(GW2Constants.API_BEARER + key);
        call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<AccountResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onNext(AccountResponse value) {
                        GW2Account.getInstance().setAccount(value);
                        mViewModel.setLoginContainerVisible(false);
                        ((MainActivity) getContext()).loadFragment(CharacterFragment.newInstance(),
                                CharacterFragment.class.getSimpleName());
                        ((MainActivity) getContext()).updateNavigationMenu();
                    }

                    @Override
                    public void onError(Throwable t) {
                        progressDialog.dismiss();
                        SnackbarUtils.displaySnackbarWithAction(mBinding.getRoot(), t.getLocalizedMessage(),
                                Snackbar.LENGTH_INDEFINITE, Color.RED, getString(R.string.retry),
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        queryAccount(key);
                                    }
                                });
                        Log.e(LOG_TAG, "queryAccount(): ERROR: " + t.getLocalizedMessage());
                    }

                    @Override
                    public void onComplete() {
                        progressDialog.dismiss();
                    }
                });
    }
}