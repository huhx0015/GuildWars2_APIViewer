package com.huhx0015.gw2at.tests.viewmodels.activities;

import com.huhx0015.gw2at.viewmodels.activities.MainActivityViewModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by Michael Yoon Huh on 6/6/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class MainActivityViewModelTest {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // MOCK VARIABLES
    @Mock
    private MainActivityViewModel mViewModel;

    // TEST VARIABLES
    private static final String TEST_TOOLBAR_TEXT = "Test Toolbar Text";

    /** INIT METHODS ___________________________________________________________________________ **/

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mViewModel = new MainActivityViewModel();
    }

    /** TEST METHODS ___________________________________________________________________________ **/

    @Test
    public void testGetSubToolbarText() throws Exception {
        Assert.assertEquals(null, mViewModel.subToolbarText);
    }

    @Test
    public void testSetSubToolbarText() throws Exception {
        mViewModel.setSubToolbarText(TEST_TOOLBAR_TEXT);
        Assert.assertEquals(TEST_TOOLBAR_TEXT, mViewModel.subToolbarText);
    }
}