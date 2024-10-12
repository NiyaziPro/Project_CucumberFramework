package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P14_VendorRegisterPage {
    public P14_VendorRegisterPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "user_email")
    public WebElement vendorEmail;

    @FindBy(id = "passoword")
    public WebElement vendorpassword;

    @FindBy (xpath = "//div[contains(text(),'Too short')]")
    public WebElement tooShortPassMessage;
    @FindBy (xpath = "//div[contains(text(),'Weak')]")
    public WebElement weakPassMessage;

    @FindBy (xpath = "//div[contains(text(),'Good')]")
    public WebElement goodPassMessage;

    @FindBy (xpath = "//div[contains(text(),'Strong')]")
    public WebElement strongPassMessage;

    @FindBy (xpath = "//div[@id and @name and @class]")
    public WebElement passLevelMessage;









    //trying with new computer
}
