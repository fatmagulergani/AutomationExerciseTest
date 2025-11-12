package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    @FindBy (xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingCartText;

    @FindBy (xpath = "//a[@class='btn btn-default check_out']")
    public WebElement proceedToCheckoutButton;

    @FindBy (xpath = "//u[text()='Register / Login']")
    public WebElement login;

    @FindBy (xpath = "//li[@class='address_firstname address_lastname'][1]")
    public WebElement orderPersonName;

    @FindBy (xpath = "//li[@class='address_address1 address_address2']")
    public List<WebElement> orderAddress;

    @FindBy (xpath = "//li[@class='address_city address_state_name address_postcode'][1]")
    public WebElement orderAddress2;

    @FindBy (xpath = "//li[@class='address_country_name']")
    public WebElement orderAddress3;

    @FindBy (xpath = "//li[@class='address_phone']")
    public WebElement orderAddressTel;

    @FindBy (xpath = "//textarea[@class='form-control']")
    public WebElement form;

    @FindBy (xpath = "//a[@class='btn btn-default check_out']")
    public WebElement placeOrder;

    @FindBy (xpath = "//a[@class='cart_quantity_delete']")
    public List<WebElement> removeProduct;

    @FindBy (xpath = "//p/b[text()='Cart is empty!']")
    public WebElement cartEmptyText;

    @FindBy (xpath = "//a[@href='/login']//u[text()='Register / Login']")
    public WebElement loginLink;

    @FindBy (xpath = "//a[@class='btn btn-default check_out']")
    public WebElement downloadInvoiceButton;


}
