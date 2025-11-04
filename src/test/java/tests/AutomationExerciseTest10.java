package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Scroll down to footer
5. Verify text 'SUBSCRIPTION'
6. Enter email address in input and click arrow button
7. Verify success message 'You have been successfully subscribed!' is visible
*/

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;

public class AutomationExerciseTest10 extends BaseTest {

    @Test
    public void test10(){

        actions.sendKeys(Keys.END).perform();

        Assert.assertTrue(mainPage.subscription.isDisplayed());

        mainPage.subscriptionEmail.sendKeys(ConfigReader.getProperty("validEmail"));
        mainPage.arrowButton.click();
        //actions.sendKeys(Keys.ENTER).perform();

        Assert.assertTrue(mainPage.subscriptionText.isDisplayed());
        String actualText = mainPage.subscriptionText.getText();
        String expectedText = "You have been successfully subscribed!";
        Assert.assertEquals(actualText, expectedText);

    }

}
