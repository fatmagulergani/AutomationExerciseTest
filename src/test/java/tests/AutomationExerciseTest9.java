package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Products' button
5. Verify user is navigated to ALL PRODUCTS page successfully
6. Enter product name in search input and click search button
7. Verify 'SEARCHED PRODUCTS' is visible
8. Verify all the products related to search are visible
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTest9 extends BaseTest{

    @Test
    public void test09(){

        mainPage.product.click();

        Assert.assertTrue(productsPage.productsList.size()>0);

        productsPage.productSearchBox.sendKeys("dress");
        productsPage.productSearchButton.click();

        Assert.assertTrue(productsPage.searcedProductsText.isDisplayed());
        Assert.assertTrue(productsPage.productsList.size()>0);

    }
}
