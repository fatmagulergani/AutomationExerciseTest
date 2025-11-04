package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExerciseContactUsPage {
    public AutomationExerciseContactUsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[text()='Get In Touch']")
    public WebElement getInTouchText;

    @FindBy (xpath = "//input[@data-qa='name']")
    public WebElement name;

    @FindBy (xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;

    @FindBy (xpath = "//div[@class='status alert alert-success']")
    public WebElement uploadSuccess;

    @FindBy (xpath = "//i[@class='fa fa-angle-double-left']")
    public WebElement home;

}
