package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that categories are visible on left side bar
4. Click on 'Women' category
5. Click on any category link under 'Women' category, for example: Dress
6. Verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'
7. On left side bar, click on any sub-category link of 'Men' category
8. Verify that user is navigated to that category page
*/

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class AutomationExerciseTest18 extends BaseTest{

    @Test
    public void test18(){
        actions.scrollByAmount(0,500).perform();
        Assert.assertTrue(mainPage.categoryTitle.isDisplayed());
        Assert.assertTrue(mainPage.categoryWomen.isDisplayed());
        Assert.assertTrue(mainPage.categoryMen.isDisplayed());
        Assert.assertTrue(mainPage.categoryKids.isDisplayed());

        mainPage.categoryWomen.click();
        mainPage.subCategoryWomen.click();

        Assert.assertEquals(mainPage.subCategoryWomenTitle.getText(), "WOMEN - DRESS PRODUCTS");

        mainPage.categoryMen.click();
        mainPage.subCategoryMen.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("category_products"));
    }

}
