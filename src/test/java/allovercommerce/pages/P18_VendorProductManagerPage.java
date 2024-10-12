package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P18_VendorProductManagerPage {
    public P18_VendorProductManagerPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy (xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement products;

    @FindBy (xpath = "//span[text()='Add New']")
    public  WebElement addNewButton;

    @FindBy (id = "product_type")
    public WebElement simpleProduct;

    @FindBy (id = "pro_title")
    public WebElement productTitle;

    @FindBy (id = "is_virtual")
    public WebElement virtualCheckBox;

    @FindBy (id = "is_downloadable")
    public WebElement downloadableCheckBox;

    @FindBy (id = "pro_title")
    public WebElement price;

    @FindBy (id = "pro_title")
    public WebElement salePrice;

    @FindBy (id = "featured_img_display")
    public WebElement featuredImage;

    @FindBy (id = "__wp-uploader-id-10")
    public WebElement selectFiles;

    @FindBy (xpath = "//li[@aria-label='img01_Zakir']")
    public WebElement imageForFeatured;

    @FindBy (xpath = "//li[@aria-label='img02_Zakir']")
    public WebElement imageForGalery;



    @FindBy (id = "gallery_img_gimage_0_display")
    public WebElement galleryImage;

    @FindBy(xpath = "//input[@value='345']")
    public WebElement categoryFoodCheckbox;

    @FindBy (id = "wcfm_products_simple_submit_button")
    public WebElement submitButton;

    @FindBy (xpath = "//button[@type='button' and contains(@class, 'media-button-select')]")
    public  WebElement submitButtonForImage;
    //*[@class='button media-button button-primary button-large media-button-select']

    @FindBy (xpath = "//div[text()='Please insert Product Title before submit.']")
    public WebElement insertProductMessage;

    @FindBy (xpath = "//div[text()='Featured img: This field is required.']")
    public WebElement featuredImgRequiredMessage;

    @FindBy (xpath = "//div[text()='Gallery Images: This field is required.']")
    public WebElement galleryImgRequiredMessage;

    @FindBy (xpath = "//div[text()='Product cat: This field is required.']")
    public WebElement productCatMessage;



}
