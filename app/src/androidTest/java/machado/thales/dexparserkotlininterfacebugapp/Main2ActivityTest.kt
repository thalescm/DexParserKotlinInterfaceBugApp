package machado.thales.dexparserkotlininterfacebugapp

import android.support.test.espresso.Espresso
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class Main2ActivityTest : SurpriseButtonTest {

    @get:Rule
    val activityRule = ActivityTestRule(Main2Activity::class.java)

    @Test
    fun testHelloWorldTextIsPresent() {
        Espresso.onView(ViewMatchers.withText("Hello World!   2")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}
