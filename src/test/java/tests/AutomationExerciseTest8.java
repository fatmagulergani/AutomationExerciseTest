package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Products' button
5. Verify user is navigated to ALL PRODUCTS page successfully
6. The products list is visible
7. Click on 'View Product' of first product
8. User is landed to product detail page
9. Verify that detail is visible: product name, category, price, availability, condition, brand
*/

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class AutomationExerciseTest8 extends BaseTest{

    @Test
    public void test08(){

        mainPage.product.click();


        Assert.assertTrue(productsPage.allProductsTitle.isDisplayed());
        Assert.assertTrue(productsPage.productsList.size()>0);

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0,500).perform();
        //automationExerciseProductsPage.product.sendKeys(Keys.PAGE_DOWN);
        productsPage.productsList.get(0).click();
        Assert.assertTrue(productsPage.productDetails.isDisplayed());

        Assert.assertTrue(productsPage.productName.isDisplayed());
        Assert.assertTrue(productsPage.productCategory.isDisplayed());
        Assert.assertTrue(productsPage.price.isDisplayed());
        Assert.assertTrue(productsPage.availability.isDisplayed());
        Assert.assertTrue(productsPage.condition.isDisplayed());
        Assert.assertTrue(productsPage.brand.isDisplayed());

        System.out.println(productsPage.productName.getText());
        System.out.println(productsPage.productCategory.getText());
        System.out.println(productsPage.price.getText());
        System.out.println(productsPage.availability.getText());
        System.out.println(productsPage.condition.getText());
        System.out.println(productsPage.brand.getText());

    }
}
