package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click 'Signup / Login' button
5. Fill all details in Signup and create account
6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
7. Verify ' Logged in as username' at top
8. Add products to cart
9. Click 'Cart' button
10. Verify that cart page is displayed
11. Click Proceed To Checkout
12. Verify that the delivery address is same address filled at the time registration of account
13. Verify that the billing address is same address filled at the time registration of account
14. Click 'Delete Account' button
15. Verify 'ACCOUNT DELETED!' and click 'Continue' button
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTest23 extends BaseTest{

    @Test
    public void test23(){
        mainPage.loginLink.click();
        setSignupPage();
        signupPage.continueButton.click();
        Assert.assertTrue(mainPage.loginUser.isDisplayed());
        setAddProduct(0);
        productsPage.viewCartLink.click();
        int actualRowCount = cartPage.cartProduct.size();
        Assert.assertTrue(actualRowCount > 0, "Tabloda hiç satır yok!");
        Assert.assertTrue(actualRowCount == 1);
        cartPage.proceedToCheckoutButton.click();
        setAddressControl();
        setDeleteAccount();

    }
}
