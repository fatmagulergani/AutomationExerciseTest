package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExerciseSignupPage {
    public AutomationExerciseSignupPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//*[text()='Enter Account Information']")
    public WebElement signupTitle;

    @FindBy (xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserTitle;

    @FindBy (xpath = "//input[@data-qa='signup-name']")
    public WebElement signupName;

    @FindBy (xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;

    @FindBy (xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement incorrectUserWarning;

    @FindBy (xpath = "//*[text()='Email Address already exist!']")
    public WebElement existUserWarning;

    @FindBy (xpath = "//*[text()='Login to your account']")
    public WebElement loginTitle;

    @FindBy (xpath = "//div[@id='uniform-id_gender2']")
    public WebElement gender;

    @FindBy (xpath = "//h2[@data-qa='account-created']")
    public WebElement accountCreated;

    @FindBy (xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

}
