package tests;

/*1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click 'View Product' for any product on home page
5. Verify product detail is opened
6. Increase quantity to 4
7. Click 'Add to cart' button
8. Click 'View Cart' button
9. Verify that product is displayed in cart page with exact quantity
*/

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTest13 extends BaseTest {

    @Test
    public void test13(){

        actions.scrollByAmount(0,500).perform();
        mainPage.productsList.get(0).click();
        Assert.assertTrue(productsPage.productDetails.isDisplayed());
        productsPage.quantity.sendKeys(Keys.DELETE);
        productsPage.quantity.sendKeys("4");
        productsPage.addToCartButton.click();
        productsPage.viewCartLink.click();
        Assert.assertTrue(cartPage.cartProductQuantity.get(0).getText().equals("4"));

    }
}
