package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePaymentPage {
    public AutomationExercisePaymentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@data-qa='name-on-card']")
    public WebElement nameOnCard;

    @FindBy (xpath = "//button[@data-qa='pay-button']")
    public WebElement payButton;

    @FindBy (xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement orderSuccessText;

}
