package tests;

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify user is navigated to ALL PRODUCTS page successfully
5. Click on 'View Product' button
6. Verify 'Write Your Review' is visible
7. Enter name, email and review
8. Click 'Submit' button
9. Verify success message 'Thank you for your review.'
*/

import com.github.dockerjava.api.model.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class AutomationExerciseTest21 extends BaseTest {

    @Test
    public void test21() {
        mainPage.product.click();
        Assert.assertTrue(productsPage.allProductsTitle.isDisplayed());
        actions.scrollByAmount(0, 500).perform();
        productsPage.productsList.get(0).click();

        actions.scrollByAmount(0, 600).perform();
        Assert.assertTrue(productsPage.reviewFormTitle.isDisplayed());
        productsPage.reviewFormName.sendKeys(ConfigReader.getProperty("name"));
        productsPage.reviewFormEmail.sendKeys(ConfigReader.getProperty("validEmail"));
        productsPage.reviewForm.sendKeys("review123");
        productsPage.submitButton.click();


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.not(
                ExpectedConditions.attributeContains(productsPage.successReview, "class", "hide")
        ));

        wait.until(ExpectedConditions.visibilityOf(productsPage.successReview));

        Assert.assertTrue(productsPage.successReview.isDisplayed());
        Assert.assertEquals(productsPage.successReview.getText().trim(), "Thank you for your review.");

    }
}
