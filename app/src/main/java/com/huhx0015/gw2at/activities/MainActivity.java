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
import com.huhx0015.gw2at.databinding.ActivityMainBinding;
import com.huhx0015.gw2at.fragments.QuaggansFragment;
import com.huhx0015.gw2at.fragments.ServerStatusFragment;
import com.huhx0015.gw2at.viewmodels.activities.MainActivityViewModel;

public class MainActivity extends AppCompatActivity implements MainActivityViewModel.MainActivityViewModelListener,
        NavigationView.OnNavigationItemSelectedListener {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // DATABINDING VARIABLES
    private ActivityMainBinding mBinding;
    private MainActivityViewModel mViewModel;

    // FRAGMENT VARIABLES
    private String mFragmentTag;

    // LOGGING VARIABLES
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    /** ACTIVITY LIFECYCLE METHODS _____________________________________________________________ **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onFabButtonClicked() {

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            // SERVER STATUS:
            case R.id.nav_server_status:
                loadFragment(ServerStatusFragment.newInstance());
                mViewModel.setSubToolbarText(getString(R.string.server_status));
                break;

            // QUAGGANS:
            case R.id.nav_quaggans:
                loadFragment(QuaggansFragment.newInstance());
                mViewModel.setSubToolbarText(getString(R.string.quaggans));
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
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
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
        mViewModel.setViewModelListener(this);
        mBinding.setViewModel(mViewModel);
    }

    private void initToolbar() {
        setSupportActionBar(mBinding.mainToolbar);
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

    /** FRAGMENT METHODS _______________________________________________________________________ **/

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(mBinding.mainFragmentContainer.getId(), fragment);
        //fragmentTransaction.addToBackStack(fragment.getClass().getSimpleName());
        fragmentTransaction.commitAllowingStateLoss();
    }
}
