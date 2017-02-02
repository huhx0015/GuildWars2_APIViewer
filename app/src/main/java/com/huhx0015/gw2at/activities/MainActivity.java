package com.huhx0015.gw2at.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import com.huhx0015.gw2at.R;
import com.huhx0015.gw2at.databinding.ActivityMainBinding;
import com.huhx0015.gw2at.fragments.QuaggansFragment;
import com.huhx0015.gw2at.fragments.ServerStatusFragment;
import com.huhx0015.gw2at.viewmodels.activities.MainActivityViewModel;

public class MainActivity extends AppCompatActivity implements MainActivityViewModel.MainActivityViewModelListener, NavigationView.OnNavigationItemSelectedListener{

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // DATABINDING VARIABLES
    private ActivityMainBinding mBinding;
    private MainActivityViewModel mViewModel;

    // LOGGING VARIABLES
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    /** ACTIVITY LIFECYCLE METHODS _____________________________________________________________ **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initBinding();
        initToolbar();
        initDrawer();

        //loadFragment(ServerStatusFragment.newInstance()); // TODO: Testing.
        loadFragment(QuaggansFragment.newInstance()); // TODO: Testing.
    }

    /** ACTIVITY EXTENSION METHODS _____________________________________________________________ **/

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
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
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
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

    /** LAYOUT METHODS _________________________________________________________________________ **/

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

    /** FRAGMENT METHODS _______________________________________________________________________ **/

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_main, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commitAllowingStateLoss();
    }
}
