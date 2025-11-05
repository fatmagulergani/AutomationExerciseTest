package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and already registered email address
7. Click 'Signup' button
8. Verify error 'Email Address already exist!' is visible
*/

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;


public class AutomationExerciseTest5 extends BaseTest{

    @Test
    public void test05(){

        mainPage.loginLink.click();

        Assert.assertTrue(signupPage.newUserTitle.isDisplayed());

        signupPage.signupName.sendKeys(ConfigReader.getProperty("name") + Keys.TAB + ConfigReader.getProperty("validEmail") + Keys.ENTER);
        Assert.assertTrue(signupPage.existUserWarning.isDisplayed());

    }
}
