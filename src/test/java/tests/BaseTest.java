package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;

public class BaseTest {

    AutomationExerciseMainPage mainPage = new AutomationExerciseMainPage();
    AutomationExerciseSignupPage signupPage = new AutomationExerciseSignupPage();
    AutomationExerciseDeleteAccountPage deleteAccountPage = new AutomationExerciseDeleteAccountPage();
    AutomationExerciseContactUsPage contactUs = new AutomationExerciseContactUsPage();
    AutomationExerciseProductsPage productsPage = new AutomationExerciseProductsPage();
    AutomationExerciseViewCartPage cartPage = new AutomationExerciseViewCartPage();
    AutomationExercisePaymentPage paymentPage = new AutomationExercisePaymentPage();
    Actions actions = new Actions(Driver.getDriver());
    String downloadPath = System.getProperty("user.dir") + "/downloads";

    @BeforeMethod
    public void setUp() {
        mainPage.openPage(ConfigReader.getProperty("testLink"));
        mainPage.verifyMainPageIsOpen();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    public void setSignupPage(){

        signupPage.signupName.sendKeys(ConfigReader.getProperty("name") + Keys.ENTER + ConfigReader.getProperty("newEmail") + Keys.ENTER);

        actions.click(signupPage.gender)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("1111")
                .sendKeys(Keys.TAB)
                .sendKeys("3")
                .sendKeys(Keys.TAB)
                .sendKeys("March")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys("Fatoshi")
                .sendKeys(Keys.TAB)
                .sendKeys("LastName")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Address")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United State")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Austin")
                .sendKeys(Keys.TAB)
                .sendKeys("22222")
                .sendKeys(Keys.TAB)
                .sendKeys("1111111111")
                .sendKeys(Keys.ENTER)
                .perform();

        String expectedText = "ACCOUNT CREATED!";
        String actualText = signupPage.accountCreated.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void setAddressControl(){
        Assert.assertTrue(cartPage.orderPersonName.getText().contains("Fatoshi LastName"));
        String address = cartPage.orderAddress.get(0).getText() + cartPage.orderAddress.get(1).getText()
                + cartPage.orderAddress.get(3).getText();
        Assert.assertTrue(address.contains("Address"));
        Assert.assertTrue(cartPage.orderAddress2.getText().contains("Austin Texas 22222"));
        Assert.assertTrue(cartPage.orderAddress3.getText().contains("United State"));
        Assert.assertTrue(cartPage.orderAddressTel.getText().contains("1111111111"));
    }

    public void setPayment(){
        actions.scrollByAmount(0,500).perform();
        cartPage.form.click();
        cartPage.form.sendKeys("comment");
        actions.scrollByAmount(0,500).perform();
        cartPage.placeOrder.click();

        paymentPage.nameOnCard.sendKeys("Fatoshi LastName");
        actions.sendKeys(Keys.TAB)
                .sendKeys("1234 5678 9123 4567")
                .sendKeys(Keys.TAB)
                .sendKeys("111")
                .sendKeys(Keys.TAB)
                .sendKeys("11")
                .sendKeys(Keys.TAB)
                .sendKeys("2029")
                .sendKeys(Keys.TAB)
                .perform();

        actions.scrollByAmount(0,500).perform();
        paymentPage.payButton.click();

        String actualText = paymentPage.orderSuccessText.getText();
        String expectedText = "Congratulations! Your order has been confirmed!";
        Assert.assertEquals(actualText, expectedText);
    }

    public void setDeleteAccount(){
        mainPage.deleteAccount.click();
        deleteAccountPage.continueButton.click();
    }

    public void setLogin(){
        mainPage.loginLink.click();
        Assert.assertTrue(signupPage.loginTitle.isDisplayed());

        signupPage.loginEmail.sendKeys(ConfigReader.getProperty("validEmail")+ Keys.TAB + ConfigReader.getProperty("newPassword") + Keys.ENTER);
        Assert.assertTrue(mainPage.loginUser.isDisplayed());
    }

    public void setAddProduct(int index){
        actions.scrollByAmount(0,500).perform();
        mainPage.addToCart.get(index).click();
    }

    public void setSearchProduct(String searchText){
        productsPage.productSearchBox.sendKeys(searchText);
        productsPage.productSearchButton.click();
        Assert.assertTrue(productsPage.searcedProductsText.isDisplayed());
        Assert.assertTrue(productsPage.productsList.size()>0);
    }
}
