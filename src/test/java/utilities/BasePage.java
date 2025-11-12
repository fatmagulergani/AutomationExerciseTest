package utilities;


import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BasePage {

    // Sayfayı verilen URL ile açar
    public void openPage(String url) {
        Driver.getDriver().get(url);
    }

    // Sayfanın yüklendiğini kontrol eder (örneğin logo görünüyorsa)
    public void verifyPageLoaded(WebElement element) {
        Assert.assertTrue(element.isDisplayed(), "Page did not load properly!");
    }
}
