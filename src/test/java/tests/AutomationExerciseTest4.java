package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Logout' button
10. Verify that user is navigated to login page
*/

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;


public class AutomationExerciseTest4 extends BaseTest{

    @Test
    public void test04(){

        mainPage.loginLink.click();
        Assert.assertTrue(signupPage.loginTitle.isDisplayed());

        signupPage.loginEmail.sendKeys(ConfigReader.getProperty("validEmail")+ Keys.TAB + ConfigReader.getProperty("password") + Keys.ENTER);
        Assert.assertTrue(mainPage.loginUser.isDisplayed());

        mainPage.logout.click();
        String actualText = Driver.getDriver().getCurrentUrl();
        String expectedText = ConfigReader.getProperty("loginLink");
        Assert.assertEquals(actualText, expectedText);

    }
}
