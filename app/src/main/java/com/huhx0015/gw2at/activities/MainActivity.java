package com.huhx0015.gw2at.activities;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import com.huhx0015.gw2at.R;
import com.huhx0015.gw2at.data.GW2Account;
import com.huhx0015.gw2at.databinding.ActivityMainBinding;
import com.huhx0015.gw2at.fragments.CharacterFragment;
import com.huhx0015.gw2at.fragments.LoginFragment;
import com.huhx0015.gw2at.fragments.QuaggansFragment;
import com.huhx0015.gw2at.fragments.ServerStatusFragment;
import com.huhx0015.gw2at.viewmodels.activities.MainActivityViewModel;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // DATABINDING VARIABLES
    private ActivityMainBinding mBinding;
    private MainActivityViewModel mViewModel;

    // FRAGMENT VARIABLES
    private String mFragmentTag;

    // LOGGING VARIABLES
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    // PARCELABLE VARIABLES
    private static final String MAIN_ACTIVITY_FRAGMENT_TAG = LOG_TAG + "_FRAGMENT_TAG";
    private static final String MAIN_ACTIVITY_TOOLBAR_TITLE = LOG_TAG + "_TOOLBAR_TITLE";

    // TOOLBAR VARIABLES
    private String mToolbarTitle;

    // DEPENDENCY INJECTION VARIABLES
    @Inject GW2Account mAccount;

    /** ACTIVITY LIFECYCLE METHODS _____________________________________________________________ **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();

        if (savedInstanceState == null) {

            // Checks to see if a Guild Wars 2 API key has been set in strings.xml.
            if (!getString(R.string.app_api_key).isEmpty()) {
                GW2Account.getInstance().setApiKey(getString(R.string.app_api_key));
            }
            boolean isApiKeyAvailable = GW2Account.getInstance().getApiKey() != null;
            if (isApiKeyAvailable) {
                loadFragment(CharacterFragment.newInstance(), CharacterFragment.class.getSimpleName());
                updateNavigationMenu();
            } else {
                loadFragment(LoginFragment.newInstance(), LoginFragment.class.getSimpleName());
                setToolbarText(getString(R.string.login));
            }
        } else {
            this.mFragmentTag = savedInstanceState.getString(MAIN_ACTIVITY_FRAGMENT_TAG);
            this.mToolbarTitle = savedInstanceState.getString(MAIN_ACTIVITY_TOOLBAR_TITLE);
            setToolbarText(mToolbarTitle);
        }
    }

    /** ACTIVITY EXTENSION METHODS _____________________________________________________________ **/

    @Override
    public void onBackPressed() {
        if (mBinding.mainDrawer.isDrawerOpen(GravityCompat.START)) {
            mBinding.mainDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            // LOGIN:
            case R.id.nav_login:
                loadFragment(LoginFragment.newInstance(), LoginFragment.class.getSimpleName());
                setToolbarText(getString(R.string.login));
                break;

            // CHARACTER:
            case R.id.nav_character:
                loadFragment(CharacterFragment.newInstance(), CharacterFragment.class.getSimpleName());
                setToolbarText(getString(R.string.character));
                break;

            // SERVER STATUS:
            case R.id.nav_server_status:
                loadFragment(ServerStatusFragment.newInstance(), ServerStatusFragment.class.getSimpleName());
                setToolbarText(getString(R.string.server_status));
                break;

            // QUAGGANS:
            case R.id.nav_quaggans:
                loadFragment(QuaggansFragment.newInstance(), QuaggansFragment.class.getSimpleName());
                setToolbarText(getString(R.string.quaggans));
                break;

            // QUIT:
            case R.id.nav_quit:
                finish();
                break;
        }

        mBinding.mainDrawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(MAIN_ACTIVITY_FRAGMENT_TAG, mFragmentTag);
        outState.putString(MAIN_ACTIVITY_TOOLBAR_TITLE, mToolbarTitle);
    }

    /** LAYOUT METHODS _________________________________________________________________________ **/

    private void initView() {
        initBinding();
        initToolbar();
        initDrawer();
        initText();
    }

    private void initBinding() {
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mViewModel = new MainActivityViewModel();
        mBinding.setViewModel(mViewModel);
    }

    private void initDrawer() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mBinding.mainDrawer,
                mBinding.mainToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mBinding.mainDrawer.addDrawerListener(toggle);
        toggle.syncState();

        mBinding.mainNavView.setNavigationItemSelectedListener(this);
    }

    private void initText() {
        mBinding.mainSubToolbarText.setShadowLayer(2, 2, 2, Color.BLACK);
    }

    private void initToolbar() {
        setSupportActionBar(mBinding.mainToolbar);
    }

    private void setToolbarText(String text) {
        this.mToolbarTitle = text;
        mViewModel.setSubToolbarText(text);
    }

    public void updateNavigationMenu() {
        Menu navMenu = mBinding.mainNavView.getMenu();
        navMenu.findItem(R.id.nav_login).setVisible(false);
        navMenu.findItem(R.id.nav_character).setVisible(true);
        setToolbarText(getString(R.string.character));
    }

    /** FRAGMENT METHODS _______________________________________________________________________ **/

    public void loadFragment(Fragment fragment, String tag) {
        this.mFragmentTag = tag;

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(mBinding.mainFragmentContainer.getId(), fragment);
        fragmentTransaction.commitAllowingStateLoss();
    }
}
