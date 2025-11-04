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
9. Click 'Delete Account' button
10. Verify that 'ACCOUNT DELETED!' is visible
*/

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;


public class AutomationExerciseTest2 extends BaseTest{

    @Test
    public void test02(){

        mainPage.loginLink.click();

        Assert.assertTrue(signupPage.loginTitle.isDisplayed());

        signupPage.loginEmail.sendKeys(ConfigReader.getProperty("email") + Keys.TAB + ConfigReader.getProperty("password") + Keys.ENTER);
        Assert.assertTrue(mainPage.loginUser.isDisplayed());

        mainPage.deleteAccount.click();

        Assert.assertTrue(deleteAccountPage.deleteAccountWarning.isDisplayed());

    }
}
