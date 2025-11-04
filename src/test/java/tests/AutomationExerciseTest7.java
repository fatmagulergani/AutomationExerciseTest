package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Test Cases' button
5. Verify user is navigated to test cases page successfully
*/

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;


public class AutomationExerciseTest7 extends BaseTest{

    @Test
    public void test07(){

        mainPage.testCases.click();

        String actualText = Driver.getDriver().getCurrentUrl();
        String expectedText = ConfigReader.getProperty("textCaseLink");
        Assert.assertEquals(actualText, expectedText);
    }
}


