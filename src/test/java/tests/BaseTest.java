package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

public class BaseTest {

    AutomationExerciseMainPage mainPage = new AutomationExerciseMainPage();
    AutomationExerciseSignupPage signupPage = new AutomationExerciseSignupPage();
    AutomationExerciseDeleteAccountPage deleteAccountPage = new AutomationExerciseDeleteAccountPage();
    AutomationExerciseContactUsPage contactUs = new AutomationExerciseContactUsPage();
    AutomationExerciseProductsPage productsPage = new AutomationExerciseProductsPage();
    AutomationExerciseViewCartPage cartPage = new AutomationExerciseViewCartPage();
    Actions actions = new Actions(Driver.getDriver());

    @BeforeMethod
    public void setUp() {
        mainPage.openPage(ConfigReader.getProperty("testLink"));
        mainPage.verifyMainPageIsOpen();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
