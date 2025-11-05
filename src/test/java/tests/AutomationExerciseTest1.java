package tests;

/*
Test Case 1: Register User
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
*/

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;


public class AutomationExerciseTest1 extends BaseTest{
    @Test
    public void test01() {
        /*Driver.getDriver().get(ConfigReader.getProperty("testLink"));
        AutomationExerciseMainPage automationExerciseMainPage = new AutomationExerciseMainPage();
        Assert.assertTrue(automationExerciseMainPage.logo.isDisplayed());*/

        mainPage.loginLink.click();

        Assert.assertTrue(signupPage.newUserTitle.isDisplayed());

        signupPage.signupName.sendKeys(ConfigReader.getProperty("name") + Keys.ENTER + ConfigReader.getProperty("email") + Keys.ENTER);
        Assert.assertTrue(signupPage.signupTitle.isDisplayed());

        actions.click(signupPage.gender)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("1111")
                .sendKeys(Keys.TAB)
                .sendKeys("3")
                .sendKeys(Keys.TAB)
                .sendKeys("March")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys("Fatoshi")
                .sendKeys(Keys.TAB)
                .sendKeys("LastName")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Address")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United State")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Austin")
                .sendKeys(Keys.TAB)
                .sendKeys("22222")
                .sendKeys(Keys.TAB)
                .sendKeys("1111111111")
                .sendKeys(Keys.ENTER)
                .perform();

        String expectedText = "ACCOUNT CREATED!";
        String actualText = signupPage.accountCreated.getText();
        Assert.assertEquals(expectedText, actualText);

    }
}
