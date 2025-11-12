package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Scroll down page to bottom
5. Verify 'SUBSCRIPTION' is visible
6. Click on arrow at bottom right side to move upward
7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
*/

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTest25 extends BaseTest {

    @Test
    public void test25(){
        actions.sendKeys(Keys.END).perform();
        Assert.assertTrue(mainPage.subscription.isDisplayed());

        mainPage.scrollUpButton.click();
        Assert.assertTrue(mainPage.mainPageText.isDisplayed());

    }
}
