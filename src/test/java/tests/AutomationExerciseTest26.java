package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Scroll down page to bottom
5. Verify 'SUBSCRIPTION' is visible
6. Scroll up page to top
7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
*/

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTest26 extends BaseTest{

    @Test
    public void test26(){
        actions.sendKeys(Keys.DOWN).perform();
        Assert.assertTrue(mainPage.subscription.isDisplayed());
        actions.sendKeys(Keys.UP).perform();
        Assert.assertTrue(mainPage.mainPageText.isDisplayed());
    }
}
