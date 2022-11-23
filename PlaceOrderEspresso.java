package com.livbay.cartEspresso;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.swipeDown;
import static androidx.test.espresso.action.ViewActions.swipeUp;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.livbay.R;
import com.livbay.customerapp.ui.dashboard.DashboardActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest
public class PlaceOrderEspresso {


    @Rule
    public ActivityScenarioRule<DashboardActivity> dashboardActivityActivityScenarioRule = new ActivityScenarioRule<DashboardActivity>(DashboardActivity.class);


    // For performing action on the recycler view with espresso you need the following dependency in the your gradle script
//    androidTestImplementation 'com.android.support.test.espresso:espresso-contrib:3.0.2'
    @Test
    public void checkPlaceOrderFlow(){
        // Waiting for the api response.
        sleepDelay(5000);
        // clicking on the recycler view item.
        onView(ViewMatchers.withId(R.id.rv_popular_products)).check(matches(isDisplayed())).perform(RecyclerViewActions.actionOnItemAtPosition(0,click()));
        sleepDelay(3000);
        onView(withId(R.id.btn_addtoCart)).check(matches(isDisplayed())).perform(click());
        sleepDelay(3000);
        onView(withId(R.id.btnCartAllProductContinueCheckout)).check(matches(isDisplayed())).perform(click());
        sleepDelay(3000);
        // For Clicking on particular view element inside the recycler view list element.
        onView(withId(R.id.recvCartSelectAddress)).check(matches(isDisplayed())).perform(RecyclerViewActions.actionOnItemAtPosition(0,click()));
        sleepDelay(3000);
        onView(withId(R.id.btn_CartSelectAddandContinuePayment)).check(matches(isDisplayed())).perform(click());
        sleepDelay(3000);
        onView(withId(R.id.layoutBtnCheckout)).check(matches(isDisplayed())).perform(click());
        sleepDelay(3000);
        onView(withId(R.id.recvShoppingDetailsCard)).check(matches(isDisplayed())).perform(RecyclerViewActions.actionOnItemAtPosition(0,click()));
        sleepDelay(2000);

        // For swipe up to the bottom of the screen.
        onView(withId(R.id.shoppingDetailsScrollView)).perform(swipeUp());
        sleepDelay(3000);
        onView(withId(R.id.btn_tv_pay_now_shopping_details)).check(matches(isDisplayed())).perform(click());
        sleepDelay(5000);
    }
    public void sleepDelay(int delay){
        try {
            Thread.sleep(delay);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }








}
