package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    @FindBy (xpath = "//a[@class='btn btn-default add-to-cart']")
    public List<WebElement> addToCart;

    @FindBy (xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShoppingButton;

    @FindBy (xpath = "//*[text()='Category']")
    public WebElement categoryTitle;

    @FindBy (xpath = "//a[@href='#Women']")
    public WebElement categoryWomen;

    @FindBy (xpath = "//a[@href='#Men']")
    public WebElement categoryMen;

    @FindBy (xpath = "//a[@href='#Kids']")
    public WebElement categoryKids;

    @FindBy (xpath = "//div[@id='Women']//a[text()='Dress ']")
    public WebElement subCategoryWomen;

    @FindBy (xpath = "//*[text()='Women - Dress Products']")
    public WebElement subCategoryWomenTitle;

    @FindBy (xpath = "//div[@id='Men']//a[text()='Jeans ']")
    public WebElement subCategoryMen;

    @FindBy (xpath = "//*[text()='recommended items']")
    public WebElement recommendedItemsTitle;

    @FindBy (xpath = "//div[@class='recommended_items']//a[@class='btn btn-default add-to-cart']")
    public List<WebElement> recommendedProductsList;



    public void verifyMainPageIsOpen() {
        verifyPageLoaded(logo);
    }
}


