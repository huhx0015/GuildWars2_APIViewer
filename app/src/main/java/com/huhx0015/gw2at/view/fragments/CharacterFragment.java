package com.huhx0015.gw2at.view.fragments;

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
import com.huhx0015.gw2at.constants.GW2Constants;
import com.huhx0015.gw2at.model.objects.GW2Account;
import com.huhx0015.gw2at.databinding.FragmentCharacterBinding;
import com.huhx0015.gw2at.interfaces.RetrofitInterface;
import com.huhx0015.gw2at.model.responses.characters.CharacterOverviewResponse;
import com.huhx0015.gw2at.utils.DialogUtils;
import com.huhx0015.gw2at.utils.SnackbarUtils;
import com.huhx0015.gw2at.viewmodels.fragments.CharacterFragmentViewModel;
import java.util.ArrayList;
import java.util.List;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Michael Yoon Huh on 2/4/2017.
 */

public class CharacterFragment extends ApiFragment {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // DATABINDING VARIABLES
    private FragmentCharacterBinding mBinding;
    private CharacterFragmentViewModel mViewModel;

    // DATA VARIABLES
    private List<String> mCharacterList;
    private CharacterOverviewResponse mCharacterOverviewResponse;

    // LOGGING VARIABLES
    private static final String LOG_TAG = CharacterFragment.class.getSimpleName();

    // PARCELABLE VARIABLES
    private static final String CHARACTER_FRAGMENT_CHARACTER_LIST = LOG_TAG + "_CHARACTER_LIST";

    /** CONSTRUCTOR METHODS ____________________________________________________________________ **/

    public static CharacterFragment newInstance() {
        return new CharacterFragment();
    }

    /** FRAGMENT LIFECYCLE METHODS _____________________________________________________________ **/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(getActivity().getLayoutInflater(), R.layout.fragment_character, null, false);
        mViewModel = new CharacterFragmentViewModel();
        mBinding.setViewModel(mViewModel);

        if (savedInstanceState != null) {
            mCharacterList = savedInstanceState.getStringArrayList(CHARACTER_FRAGMENT_CHARACTER_LIST);

            if (mCharacterList != null && !mCharacterList.isEmpty()) {
                queryCharacterOverview(GW2Account.getInstance().getApiKey(), mCharacterList.get(0));
            } else {
                queryCharacterList(GW2Account.getInstance().getApiKey());
            }
        } else {
            queryCharacterList(GW2Account.getInstance().getApiKey());
        }

        return mBinding.getRoot();
    }

    /** FRAGMENT EXTENSION METHODS _____________________________________________________________ **/

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putStringArrayList(CHARACTER_FRAGMENT_CHARACTER_LIST, new ArrayList<>(mCharacterList));
    }

    /** NETWORK METHODS ________________________________________________________________________ **/

    private void queryCharacterList(final String key) {
        final ProgressDialog progressDialog = DialogUtils.createProgressDialog(mContext);

        RetrofitInterface charactersResponse = mNetworkAdapter.create(RetrofitInterface.class);
        Observable<List<String>> call = charactersResponse.getCharacters(GW2Constants.API_BEARER + key);
        call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<String>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onNext(List<String> value) {
                        mCharacterList = value;
                        GW2Account.getInstance().setCharacterList(value);

                        if (!value.isEmpty()) {
                            queryCharacterOverview(key, value.get(0));
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
                                        queryCharacterList(key);
                                    }
                                });
                        Log.e(LOG_TAG, "queryCharacters(): ERROR: " + t.getLocalizedMessage());
                    }

                    @Override
                    public void onComplete() {
                        progressDialog.dismiss();
                    }
                });
    }

    private void queryCharacterOverview(final String key, final String id) {
        final ProgressDialog progressDialog = DialogUtils.createProgressDialog(mContext);

        RetrofitInterface characterOverviewResponse = mNetworkAdapter.create(RetrofitInterface.class);
        Observable<CharacterOverviewResponse> call = characterOverviewResponse.getCharacter(GW2Constants.API_BEARER + key, id);
        call.subscribeOn(Schedulers.io());
        call.observeOn(AndroidSchedulers.mainThread());
        call.subscribe(new Observer<CharacterOverviewResponse>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(CharacterOverviewResponse value) {
                mCharacterOverviewResponse = value;
                mViewModel.setCharacterName(value.getName());
                mViewModel.setCharacterRace(value.getRace());
                mViewModel.setCharacterGender(value.getGender());
                mViewModel.setCharacterProfession(value.getProfession());
                mViewModel.setCharacterLevel(value.getLevel().toString());
                mViewModel.setCharacterGuild(value.getGuild());
                mViewModel.setCharacterAge(value.getAge().toString());
                mViewModel.setCharacterCreated(value.getCreated());
                mViewModel.setCharacterDeaths(value.getDeaths().toString());
                mViewModel.setCharacterVisibility(true);
            }

            @Override
            public void onError(Throwable t) {
                progressDialog.dismiss();
                SnackbarUtils.displaySnackbarWithAction(mBinding.getRoot(), t.getLocalizedMessage(),
                        Snackbar.LENGTH_INDEFINITE, Color.RED, getString(R.string.retry),
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                queryCharacterOverview(key, id);
                            }
                        });
                Log.e(LOG_TAG, "queryCharacterOverview(): ERROR: " + t.getLocalizedMessage());
            }

            @Override
            public void onComplete() {
                progressDialog.dismiss();
            }
        });
    }
}
