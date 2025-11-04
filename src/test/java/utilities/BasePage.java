package utilities;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AutomationExerciseMainPage;

public class BasePage {

    public static AutomationExerciseMainPage automationExerciseMainPage;

    // Sayfayı verilen URL ile açar
    public void openPage(String url) {
        Driver.getDriver().get(url);
    }

    // Sayfanın yüklendiğini kontrol eder (örneğin logo görünüyorsa)
    public void verifyPageLoaded(WebElement element) {
        Assert.assertTrue(element.isDisplayed(), "Page did not load properly!");
    }
}
