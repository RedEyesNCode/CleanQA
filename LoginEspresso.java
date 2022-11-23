package com.livbay.authEspresso;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.livbay.R;
import com.livbay.customerapp.auth.view.LoginActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


// Create A JAVA Class with RunWithAnnotationUsed(AndroidJUnit4ClassRunner.class)
// Run with Large Test.
@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest
public class LoginEspresso {

    // Tells Espresso for which activity are we residing in.
    @Rule
    public ActivityScenarioRule<LoginActivity> loginActivityActivityScenario = new ActivityScenarioRule<LoginActivity>(LoginActivity.class);

    // Sleep Thread for pausing the UI until the api is called.
    public void sleepThread(int delay){
        try {
            Thread.sleep(delay);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    // Simple Validation test case.
    @Test
    public void testLoginFieldValidation(){


        onView(ViewMatchers.withId(R.id.edtNumber)).perform(clearText(),typeText("8765432134"),closeSoftKeyboard());

        onView(withId(R.id.btn_login)).perform(click());
        Espresso.pressBack();
        onView(withId(R.id.edtNumber)).perform(clearText());
//        onView(withId(R.id.edtLoginPassword)).perform(clearText(),typeText("12345"),closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

        Espresso.pressBack();
    }


}
