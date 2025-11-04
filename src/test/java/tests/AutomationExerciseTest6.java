package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Contact Us' button
5. Verify 'GET IN TOUCH' is visible
6. Enter name, email, subject and message
7. Upload file
8. Click 'Submit' button
9. Click OK button
10. Verify success message 'Success! Your details have been submitted successfully.' is visible
11. Click 'Home' button and verify that landed to home page successfully
*/

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseTest6 extends BaseTest{

    @Test
    public void test06(){

        mainPage.contactUs.click();

        Assert.assertTrue(contactUs.getInTouchText.isDisplayed());

        contactUs.name.sendKeys(ConfigReader.getProperty("ad") + Keys.TAB
        + ConfigReader.getProperty("validEmail") + Keys.TAB + "My Subject" + Keys.TAB
        + "My message is here." + Keys.TAB);
        contactUs.uploadFile.sendKeys(ConfigReader.getProperty("filePath"));

        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

        Assert.assertTrue(contactUs.uploadSuccess.isDisplayed());
        contactUs.home.click();

        String actualText = Driver.getDriver().getCurrentUrl();
        String expectedText = ConfigReader.getProperty("testLink");
        Assert.assertEquals(actualText, expectedText);

    }
}
