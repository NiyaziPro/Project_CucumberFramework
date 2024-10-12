package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P13_WishlistPage {
    public P13_WishlistPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


@FindBy(xpath = "//a[contains(@class, 'wishlist') and contains(@class, 'block-type')]")
    public WebElement WishListButton;

    @FindBy(className = "page-title")
    public WebElement Wishlisttitle;

    @FindBy(xpath = "//td[@class='product-name']")
    public WebElement ProductnameOyuncak;

}
