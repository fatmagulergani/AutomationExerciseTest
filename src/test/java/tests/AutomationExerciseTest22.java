package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Scroll to bottom of page
4. Verify 'RECOMMENDED ITEMS' are visible
5. Click on 'Add To Cart' on Recommended product
6. Click on 'View Cart' button
7. Verify that product is displayed in cart page
*/

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTest22 extends BaseTest {

    @Test
    public void test22(){
        actions.sendKeys(Keys.END)
                .sendKeys(Keys.PAGE_UP)
                .perform();

        Assert.assertTrue(mainPage.recommendedItemsTitle.isDisplayed());
        mainPage.recommendedProductsList.get(0).click();
        productsPage.viewCartLink.click();
        int actualRowCount = cartPage.cartProduct.size();
        Assert.assertTrue(actualRowCount > 0, "Tabloda hiç satır yok!");
        Assert.assertTrue(actualRowCount == 1);
    }
}
