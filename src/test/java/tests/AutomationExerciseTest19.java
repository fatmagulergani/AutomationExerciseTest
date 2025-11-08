package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify that Brands are visible on left side bar
5. Click on any brand name
6. Verify that user is navigated to brand page and brand products are displayed
7. On left side bar, click on any other brand link
8. Verify that user is navigated to that brand page and can see products
*/

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class AutomationExerciseTest19 extends BaseTest {

    @Test
    public void test19(){
        mainPage.product.click();
        actions.scrollByAmount(0,1000).perform();
        Assert.assertTrue(productsPage.brandsTitle.isDisplayed());

        productsPage.brandProductsHM.click();
        Assert.assertTrue(productsPage.subBrandProductsTitle.isDisplayed());
        Assert.assertTrue(productsPage.subBrandProductsTitle.getText().contains("H&M"));

        actions.scrollByAmount(0,1000).perform();
        productsPage.brandProductsBiba.click();
        Assert.assertTrue(productsPage.subBrandProductsTitle.getText().contains("BIBA"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("brand_products"));

    }
}
