package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BasePage;
import utilities.Driver;

import java.util.List;

public class AutomationExerciseViewCartPage extends BasePage {
    public AutomationExerciseViewCartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//table/tbody/tr")
    public List<WebElement> cartProduct;

    @FindBy (xpath = "//table/tbody/tr/td[@class='cart_price']")
    public List<WebElement> cartProductPrice;

    @FindBy (xpath = "//table/tbody/tr/td[@class='cart_quantity']")
    public List<WebElement> cartProductQuantity;

    @FindBy (xpath = "//table/tbody/tr/td[@class='cart_total']")
    public List<WebElement> cartProductTotal;
}
