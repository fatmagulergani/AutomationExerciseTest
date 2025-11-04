package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BasePage;
import utilities.Driver;

import java.util.List;

public class AutomationExerciseMainPage extends BasePage {
    public AutomationExerciseMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//img[@src='/static/images/home/logo.png']")
    public WebElement logo;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginLink;

    @FindBy (xpath = "//*[text()=' Logged in as ']")
    public WebElement loginUser;

    @FindBy (xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccount;

    @FindBy (xpath = "//*[text()=' Logout']")
    public WebElement logout;

    @FindBy (xpath = "//*[text()=' Contact us']")
    public WebElement contactUs;

    @FindBy (xpath = "//*[text()=' Test Cases']")
    public WebElement testCases;

    @FindBy (xpath = "//*[text()=' Products']")
    public WebElement product;

    @FindBy (xpath = "//h2[text()='Subscription']")
    public WebElement subscription;

    @FindBy (xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionEmail;

    @FindBy (xpath = "//div[@class='alert-success alert']")
    public WebElement subscriptionText;

    @FindBy (xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement arrowButton;

    @FindBy (xpath = "//a[text()=' Cart']")
    public WebElement cart;

    @FindBy (xpath = "//*[text()='View Product']")
    public List<WebElement> productsList;

    public void verifyMainPageIsOpen() {
        verifyPageLoaded(logo);
    }
}


