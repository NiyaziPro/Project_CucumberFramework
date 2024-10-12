package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_MyAccountPage {
    public P04_MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//ul)[4]//li[4]")
    public WebElement addresses;

    @FindBy(xpath = "//a[contains(text(), 'Edit Your Shipping Address')]")
    public WebElement editShippingAddress;

    @FindBy(partialLinkText = "Addresses")
    public WebElement adressesLink;

    @FindBy(linkText = "Store Manager")
    public WebElement storeManagerLink;

    @FindBy(linkText = "Orders")
    public WebElement ordersLink;

    @FindBy(partialLinkText = "Dashboard")
    public WebElement dashboardLink;

    @FindBy(partialLinkText = "Downloads")
    public WebElement downloadsLink;

    @FindBy(partialLinkText = "Account details")
    public WebElement accountDetailsLink;

    @FindBy(partialLinkText = "Wishlist")
    public WebElement wishlistLink;

    @FindBy(partialLinkText = "Support Tickets")
    public WebElement supportTicketsLink;

    @FindBy(partialLinkText = "Followings")
    public WebElement FollowingsLink;

    @FindBy(partialLinkText = "Logout")
    public WebElement LogoutLink;









}
