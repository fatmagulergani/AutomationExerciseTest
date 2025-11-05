package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Add products to cart
5. Click 'Cart' button
6. Verify that cart page is displayed
7. Click Proceed To Checkout
8. Click 'Register / Login' button
9. Fill all details in Signup and create account
10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
11. Verify ' Logged in as username' at top
12.Click 'Cart' button
13. Click 'Proceed To Checkout' button
14. Verify Address Details and Review Your Order
15. Enter description in comment text area and click 'Place Order'
16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
17. Click 'Pay and Confirm Order' button
18. Verify success message 'Your order has been placed successfully!'
19. Click 'Delete Account' button
20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
*/

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseTest14 extends BaseTest {

    @Test
    public void test14(){

        actions.scrollByAmount(0,500).perform();
        mainPage.addToCart.get(0).click();
        mainPage.continueShoppingButton.click();
        mainPage.cart.click();

        Assert.assertTrue(cartPage.shoppingCartText.isDisplayed());
        cartPage.proceedToCheckoutButton.click();
        cartPage.login.click();

        signupPage.signupName.sendKeys(ConfigReader.getProperty("name") + Keys.ENTER + ConfigReader.getProperty("email") + Keys.ENTER);

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

        signupPage.continueButton.click();
        Assert.assertTrue(mainPage.loginUser.isDisplayed());
        mainPage.cart.click();
        cartPage.proceedToCheckoutButton.click();

        Assert.assertTrue(cartPage.orderPersonName.getText().contains("Fatoshi LastName"));
        String address = cartPage.orderAddress.get(0).getText() + cartPage.orderAddress.get(1).getText()
                + cartPage.orderAddress.get(3).getText();
        Assert.assertTrue(address.contains("Address"));
        Assert.assertTrue(cartPage.orderAddress2.getText().contains("Austin Texas 22222"));
        Assert.assertTrue(cartPage.orderAddress3.getText().contains("United State"));
        Assert.assertTrue(cartPage.orderAddressTel.getText().contains("1111111111"));

        actions.scrollByAmount(0,500).perform();
        Assert.assertTrue(cartPage.cartProduct.size() > 0);

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

        paymentPage.payButton.click();

        actualText = paymentPage.orderSuccessText.getText();
        expectedText = "Congratulations! Your order has been confirmed!";
        Assert.assertEquals(actualText, expectedText);

        mainPage.deleteAccount.click();
        deleteAccountPage.continueButton.click();

    }
}
