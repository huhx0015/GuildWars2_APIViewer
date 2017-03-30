package com.huhx0015.gw2at.activities;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import com.huhx0015.gw2at.R;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.junit.Assert.assertEquals;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestMainActivity {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    /** TEST METHODS ___________________________________________________________________________ **/

    @Test
    public void useAppContext() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("com.huhx0015.gw2at", appContext.getPackageName());
    }

    @Test
    public void loginFragmentTest() {
        openNavigationDrawer();
        selectLoginNavigationDrawer();
        typeApiKeyInput();
        pressLoginButton();
    }

    @Test
    public void serverStatusFragmentTest() {
        openNavigationDrawer();
        selectServerStatusNavigationDrawer();
    }

    @Test
    public void quaggansFragmentTest() {
        openNavigationDrawer();
        selectQuaggansNavigationDrawer();
    }

    @Test
    public void mainActivityTest() {
        loginFragmentTest(); // LoginFragment test.
        serverStatusFragmentTest(); // ServerStatusFragment test.
        quaggansFragmentTest(); // QuaggansFragment test.
        openNavigationDrawer();
        selectQuitNavigationDrawer();
    }

    /** TEST HELPER METHODS ____________________________________________________________________ **/

    private void openNavigationDrawer() {
        ViewInteraction appCompatImageButton = onView(
                allOf(withContentDescription("Open navigation drawer"),
                        withParent(withId(R.id.main_toolbar)),
                        isDisplayed()));
        appCompatImageButton.perform(click());
    }

    private void pressLoginButton() {
        ViewInteraction appCompatButton = onView(allOf(withId(R.id.login_button), isDisplayed()));
        appCompatButton.perform(scrollTo(), click());
    }

    private void pressSnackbarRetryButton() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.snackbar_action), withText("Retry"), isDisplayed()));
        appCompatButton.perform(click());
    }

    private void typeApiKeyInput() {
        ViewInteraction textInputEditText = onView(allOf(withId(R.id.login_api_key_field), isDisplayed()));
        textInputEditText.perform(replaceText("ABCDEFGH-AAAA-1234-BBBB-1234567890123456-CCCC-DDDD-EEEE-123456789012"), closeSoftKeyboard());
    }

    private void selectLoginNavigationDrawer() {
        ViewInteraction appCompatCheckedTextView = onView(
                allOf(withId(R.id.design_menu_item_text), withText("Login"), isDisplayed()));
        appCompatCheckedTextView.perform(click());
    }

    private void selectServerStatusNavigationDrawer() {
        ViewInteraction appCompatCheckedTextView = onView(
                allOf(withId(R.id.design_menu_item_text), withText("Server Status"), isDisplayed()));
        appCompatCheckedTextView.perform(click());
    }

    private void selectQuaggansNavigationDrawer() {
        ViewInteraction appCompatCheckedTextView = onView(
                allOf(withId(R.id.design_menu_item_text), withText("Quaggans"), isDisplayed()));
        appCompatCheckedTextView.perform(click());
    }

    private void selectQuitNavigationDrawer() {
        ViewInteraction appCompatCheckedTextView = onView(
                allOf(withId(R.id.design_menu_item_text), withText("Quit"), isDisplayed()));
        appCompatCheckedTextView.perform(click());
    }
}
