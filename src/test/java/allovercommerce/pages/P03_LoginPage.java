package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_LoginPage {
    public P03_LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "username")
    public WebElement username;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (name = "login")
    public WebElement login;

    @FindBy(id = "rememberme")
    public WebElement remembermeCheckBox;

    @FindBy(partialLinkText = "Lost your password?")
    public WebElement lostYourPasswordLink;

    @FindBy(name = "login")
    public WebElement signInButton;

}
