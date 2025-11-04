package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter incorrect email address and password
7. Click 'login' button
8. Verify error 'Your email or password is incorrect!' is visible
*/

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;


public class AutomationExerciseTest3 extends BaseTest{

    @Test
    public void test03(){

        mainPage.loginLink.click();
        Assert.assertTrue(signupPage.loginTitle.isDisplayed());

        signupPage.loginEmail.sendKeys(ConfigReader.getProperty("hataliMail") + Keys.TAB + ConfigReader.getProperty("hataliPassword") + Keys.ENTER);
        Assert.assertTrue(signupPage.incorrectUserWarning.isDisplayed());

    }
}
