package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Add products to cart
5. Click 'Cart' button
6. Verify that cart page is displayed
7. Click 'X' button corresponding to particular product
8. Verify that product is removed from the cart
*/

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.Duration;

public class AutomationExerciseTest17 extends BaseTest {

    @Test
    public void test17(){

        setAddProduct(0);
        mainPage.continueShoppingButton.click();
        mainPage.cart.click();
        Assert.assertTrue(cartPage.shoppingCartText.isDisplayed());

        cartPage.removeProduct.get(0).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));

        // Element görünür olana kadar bekle
        wait.until(ExpectedConditions.visibilityOf(cartPage.cartEmptyText));

        //System.out.println(cartPage.cartEmptyText.getText());
        Assert.assertEquals(cartPage.cartEmptyText.getText(), "Cart is empty!");


    }
}
