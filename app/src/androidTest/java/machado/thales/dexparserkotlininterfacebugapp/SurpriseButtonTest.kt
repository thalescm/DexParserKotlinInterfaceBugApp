package machado.thales.dexparserkotlininterfacebugapp

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.CoreMatchers.not
import org.junit.Test

interface SurpriseButtonTest {

    @Test
    fun testClickWillShowSurprise() {
        onView(withText("SURPRISE")).check(matches(not(isDisplayed())))

        onView(withText("Click me!")).perform(click())
        onView(withText("SURPRISE")).check(matches(isDisplayed()))
    }
}
