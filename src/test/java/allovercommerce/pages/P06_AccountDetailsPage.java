package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P06_AccountDetailsPage {
    public P06_AccountDetailsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Account details")//
    public WebElement accountDetails;

    @FindBy(id = "account_first_name")
    public WebElement firstNameField;

    @FindBy(id = "account_last_name")
    public WebElement lastNameField;

    @FindBy(id = "account_display_name")
    public WebElement displayNameField;

    @FindBy(id = "account_email")
    public WebElement emailField;

    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement biographyField;

    @FindBy(xpath = "//p//button[@name='save_account_details']")
    public WebElement saveChangesButton;

    @FindBy(partialLinkText = "Addresses")
    public WebElement addressesButton;

    @FindBy(id = "password_current")
    public WebElement currentPasswordField;

    @FindBy(id = "password_1")
    public WebElement newPasswordField1;

    @FindBy(id = "password_2")
    public WebElement newPasswordField2;

    @FindBy(xpath = "//div[@data-id='e9b716e']")
    public WebElement signOutButton;

    @FindBy(partialLinkText = "Log out")
    public  WebElement logOutSureButton;

    @FindBy(xpath = "//button[@value='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement myAccountTitle;








}
