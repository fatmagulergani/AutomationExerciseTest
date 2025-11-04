package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click 'Cart' button
5. Scroll down to footer
6. Verify text 'SUBSCRIPTION'
7. Enter email address in input and click arrow button
8. Verify success message 'You have been successfully subscribed!' is visible
*/

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;

public class AutomationExerciseTest11 extends BaseTest {

    @Test
    public void test11(){
        mainPage.cart.click();
        actions.sendKeys(Keys.DOWN).perform();

        Assert.assertTrue(mainPage.subscription.isDisplayed());
        String actualText = mainPage.subscription.getText();
        String expectedText = "SUBSCRIPTION";
        Assert.assertEquals(actualText, expectedText);

        mainPage.subscriptionEmail.sendKeys(ConfigReader.getProperty("validEmail"));
        //actions.sendKeys(Keys.ENTER).perform();
        mainPage.arrowButton.click();

        Assert.assertTrue(mainPage.subscriptionText.isDisplayed());
        actualText = mainPage.subscriptionText.getText();
        expectedText = "You have been successfully subscribed!";
        Assert.assertEquals(actualText, expectedText);

    }
}
