package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationExerciseProductsPage {
    public AutomationExerciseProductsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[text()='View Product']")
    public List<WebElement> productsList;

    @FindBy (xpath = "//input[@id='search_product']")
    public WebElement productSearchBox;

    @FindBy (xpath = "//button[@id='submit_search']")
    public WebElement productSearchButton;

    @FindBy (xpath = "//*[text()='Searched Products']")
    public WebElement searcedProductsText;

    @FindBy (xpath = "//*[text()='All Products']")
    public WebElement allProductsTitle;

    @FindBy (xpath = "//div[@class='product-information']")
    public WebElement productDetails;

    @FindBy (xpath = "//div[@class='product-information']//h2")
    public WebElement productName;

    @FindBy (xpath = "//div[@class='product-information']//p[1]")
    public WebElement productCategory;

    @FindBy (xpath = "//div[@class='product-information']//span//span")
    public WebElement price;

    @FindBy (xpath = "//div[@class='product-information']//p[2]")
    public WebElement availability;

    @FindBy (xpath = "//div[@class='product-information']//p[3]")
    public WebElement condition;

    @FindBy (xpath = "//div[@class='product-information']//p[4]")
    public WebElement brand;

    @FindBy (xpath = "//a[@class='btn btn-default add-to-cart']")
    public List<WebElement> addToCart;

    @FindBy (xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShoppingButton;

    @FindBy (xpath = "//*[text()='View Cart']")
    public WebElement viewCartLink;

    @FindBy (xpath = "//div[@class='productinfo text-center']/h2")
    public List<WebElement> productPrice;

    @FindBy (xpath = "//input[@id='quantity']")
    public WebElement quantity;

    @FindBy (xpath = "//button[@class='btn btn-default cart']")
    public WebElement addToCartButton;

    @FindBy (xpath = "//*[text()='Brands']")
    public WebElement brandsTitle;

    @FindBy (xpath = "//a[@href='/brand_products/H&M']")
    public WebElement brandProductsHM;

    @FindBy (xpath = "//a[@href='/brand_products/Biba']")
    public WebElement brandProductsBiba;

    @FindBy(xpath = "//h2[contains(text(),'Brand -') and contains(text(),'Products')]")
    public WebElement subBrandProductsTitle;

    @FindBy (xpath = "//*[text()='Write Your Review']")
    public WebElement reviewFormTitle;

    @FindBy (xpath = "//input[@id='name']")
    public WebElement reviewFormName;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement reviewFormEmail;

    @FindBy (xpath = "//textarea[@id='review']")
    public WebElement reviewForm;

    @FindBy (xpath = "//button[@id='button-review']")
    public WebElement submitButton;

    @FindBy (xpath = "//div[@class='alert-success alert']/span")
    public WebElement successReview;

}
