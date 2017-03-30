package com.huhx0015.gw2at.tests;

import android.os.Build;
import android.widget.TextView;
import com.huhx0015.gw2at.BuildConfig;
import com.huhx0015.gw2at.R;
import com.huhx0015.gw2at.activities.MainActivity;
import com.huhx0015.gw2at.constants.GW2TestResponses;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Michael Yoon Huh on 3/29/2017.
 *
 * Reference: http://guides.codepath.com/android/Unit-Testing-with-Robolectric
 */

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // ACTIVITY VARIABLES
    private MainActivity mActivity;

    // TEST VARIABLES
    private static final String TEST_SUBTOOLBAR_TEXT = "Login";

    /** INITIALIZATION METHODS _________________________________________________________________ **/

    @Before
    public void setup() {
        mActivity = Robolectric.setupActivity(MainActivity.class);
    }

    /** TEST METHODS ___________________________________________________________________________ **/

    @Test
    public void validateSubToolbarTextView() {
        TextView subToolbarTextView = (TextView) mActivity.findViewById(R.id.main_sub_toolbar_text);

        assertNotNull(GW2TestResponses.TEST_VARIABLE_NULL, subToolbarTextView);
        String subToolbarText = subToolbarTextView.getText().toString();
        assertTrue(GW2TestResponses.getTestValueResponse(TEST_SUBTOOLBAR_TEXT, subToolbarText),
                TEST_SUBTOOLBAR_TEXT.equals(subToolbarText));
    }
}
