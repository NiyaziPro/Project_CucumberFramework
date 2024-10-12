package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_HomePage {
    public P01_HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(partialLinkText = "Sign In")
    public WebElement signIn;

    @FindBy(partialLinkText = "Register")
    public WebElement register;

    @FindBy(className = "w-icon-heart")
    public WebElement wishlist;

    @FindBy(className = "cart-label")
    public  WebElement cart;

    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement searchbox;


    @FindBy(xpath = "//button[@aria-label='Search Button']")
    public WebElement searchboxButton;

    @FindBy(partialLinkText = "Sign Out")
    public WebElement signOutButton;

   // @FindBy(xpath = "(//footer//a)[9]")
    //@FindBy(xpath = "//footer//a[text()='My Account']")
    @FindBy(id = "menu-item-1079")
    public  WebElement myAccount;

    @FindBy (xpath = "//*[@class='button wc-forward']")
    public WebElement viewCart;

    @FindBy (partialLinkText = "Smoked Sausage")
    public WebElement productTitleInCart;

    @FindBy (xpath = "(//tr)[2]//img")
    public WebElement productImgInCart;

    @FindBy (xpath = "//td[@class='product-price']")
    public WebElement productPriceInCart;
}
