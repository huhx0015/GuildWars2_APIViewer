package com.huhx0015.mgw2s.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import com.huhx0015.mgw2s.R;
import com.huhx0015.mgw2s.databinding.ActivityMainBinding;
import com.huhx0015.mgw2s.viewmodels.activities.MainActivityViewModel;

public class MainActivity extends AppCompatActivity implements MainActivityViewModel.MainActivityViewModelListener {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // BINDING / VIEWMODEL VARIABLES
    private ActivityMainBinding mainActivityBinding;
    private MainActivityViewModel mainActivityViewModel;

    // LOGGING VARIABLES
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    /** ACTIVITY LIFECYCLE METHODS _____________________________________________________________ **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initBinding();
        initToolbar();
    }

    /** ACTIVITY EXTENSION METHODS _____________________________________________________________ **/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onFabButtonClicked() {

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
        mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainActivityViewModel = new MainActivityViewModel();
        mainActivityViewModel.setViewModelListener(this);
        mainActivityBinding.setViewModel(mainActivityViewModel);
    }

    private void initToolbar() {
        setSupportActionBar(mainActivityBinding.mainToolbar);
    }
}
