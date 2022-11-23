package com.livbay.profileEspresso;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.livbay.R;
import com.livbay.customerapp.ui.dashboard.DashboardActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class UpdateProfileEspresso {

    @Rule
    public ActivityScenarioRule<DashboardActivity> dashboardActivityActivityScenarioRule = new ActivityScenarioRule<DashboardActivity>(DashboardActivity.class);




    @Test
    public void updateProfileScript(){
        sleepDelay(5000);
        onView(ViewMatchers.withId(R.id.ic_menu_black)).check(matches(isDisplayed())).perform(click());
        sleepDelay(3000);
        onView(withId(R.id.side_myprofile)).check(matches(isDisplayed())).perform(click());
        sleepDelay(3000);
        onView(withId(R.id.edtUsername)).check(matches(isDisplayed())).perform(clearText(),typeText("EspressoUnitTestCase"+System.currentTimeMillis()),closeSoftKeyboard());
        sleepDelay(3000);
        onView(withId(R.id.edtFirstName)).check(matches(isDisplayed())).perform(clearText(),typeText("Espresso Name"),closeSoftKeyboard());
        sleepDelay(3000);
        onView(withId(R.id.edtProfileLastName)).check(matches(isDisplayed())).perform(clearText(),typeText("EsPresso LAst Name"),closeSoftKeyboard());
        sleepDelay(3000);
        onView(withId(R.id.edtAddress)).check(matches(isDisplayed())).perform(clearText(),typeText("Espress00 Address is Entered Here."),closeSoftKeyboard());
        sleepDelay(3000);
        onView(withId(R.id.edtZipcode)).check(matches(isDisplayed())).perform(clearText(),typeText("90001"),closeSoftKeyboard());
        sleepDelay(3000);
        onView(withId(R.id.edtUserBio)).check(matches(isDisplayed())).perform(clearText(),typeText("RedEyesNCode Espresso00 User Bio."),closeSoftKeyboard());
        sleepDelay(3000);
//        onView(withId(R.id.edtFirstName)).check(matches(isDisplayed())).perform(clearText());
        onView(withId(R.id.btn_EditProfileupdateProfile)).check(matches(isDisplayed())).perform(click());
        sleepDelay(3500);





    }

    public void sleepDelay(int delay){
        try {
            Thread.sleep(delay);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
