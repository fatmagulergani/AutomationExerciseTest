package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click 'Products' button
5. Hover over first product and click 'Add to cart'
6. Click 'Continue Shopping' button
7. Hover over second product and click 'Add to cart'
8. Click 'View Cart' button
9. Verify both products are added to Cart
10. Verify their prices, quantity and total price
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTest12 extends BaseTest {

    @Test
    public void test12() {

        mainPage.product.click();
        actions.scrollByAmount(0,500).perform();

        String expectedText1 = productsPage.productPrice.get(0).getText();
        productsPage.addToCart.get(0).click();

        productsPage.continueShoppingButton.click();

        String expectedText2 = productsPage.productPrice.get(1).getText();
        productsPage.addToCart.get(2).click();
        productsPage.viewCartLink.click();

        int actualRowCount = cartPage.cartProduct.size();
        Assert.assertTrue(actualRowCount > 0, "Tabloda hiç satır yok!");
        Assert.assertTrue(actualRowCount == 2);

        String actualText1 = cartPage.cartProductPrice.get(0).getText();
        String actualText2 = cartPage.cartProductPrice.get(1).getText();
        Assert.assertEquals(actualText1, expectedText1);
        Assert.assertEquals(actualText2, expectedText2);

        Assert.assertTrue(cartPage.cartProductQuantity.get(0).getText().equals("1"));
        Assert.assertTrue(cartPage.cartProductQuantity.get(1).getText().equals("1"));

        String actualText3 = cartPage.cartProductTotal.get(0).getText();
        String actualText4 = cartPage.cartProductTotal.get(1).getText();

        Assert.assertEquals(actualText3, expectedText1);
        Assert.assertEquals(actualText4, expectedText2);


    }
}
