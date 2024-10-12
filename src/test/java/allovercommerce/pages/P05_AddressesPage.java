package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class P05_AddressesPage {
    public P05_AddressesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//address/table[@class='address-table']/tbody/tr/td")
    public WebElement billingAddressNameSurname;

    @FindBy(id = "shipping_first_name")
    public WebElement shippingFirstName;

    @FindBy (id = "shipping_last_name")
    public WebElement shippingLastName;

    @FindBy (xpath = "//*[@class='select2-results']")
    public WebElement shippingCountry;

    @FindBy (id = "shipping_address_1")
    public WebElement shippingAddress;

    @FindBy (id = "shipping_postcode")
    public WebElement shippinPostcodee;

    @FindBy (id = "shipping_city")
    public WebElement shippingCity;

    @FindBy (xpath = "//button[@name='save_address']")
    public WebElement saveAddressButton;

    @FindBy (xpath = "//*[@role='alert']")
    public WebElement editaddressSuccessMessage;








    @FindBy (xpath = "//ul//li[@data-id='shipping_first_name']")
    public WebElement firstNameRequiredMessage;

    @FindBy (xpath = "//ul//li[@data-id='shipping_last_name']")
    public WebElement lastNameRequiredMessage;

    @FindBy (xpath = "//ul//li[@data-id='shipping_address_1']")
    public WebElement addressRequiredMessage;

    @FindBy (xpath = "//ul//li[@data-id='shipping_postcode']")
    public WebElement postcodeRequiredMessage;

    @FindBy (xpath = "//ul//li[@data-id='shipping_city']")
    public WebElement cityRequiredMessage;

    @FindBy (xpath = "//ul[@class='woocommerce-error']//li")
    public WebElement postcodeNotValiddMessage;

    @FindBy (xpath = "(//ul[@class='woocommerce-error']//li)[2]")
    public WebElement cityNameNotValiddMessage;

    @FindBy (xpath = "//div[contains(@class, 'woocommerce-message') and contains(@class, 'alert-success')]")
    public WebElement successAddressMessage;










    //Billing Address
    //Locator for navigating to Addresses page
    @FindBy (xpath = "//a[contains(text(), 'Addresses')]")
    public WebElement addresses;

    //locators for navigating to MyAccount
    @FindBy(xpath = "//span[contains(text(), 'Sign Out')]")
    public WebElement signOutButton;
    @FindBy (xpath = "//h2[contains(text(), 'My Account')]")
    public WebElement myAccountPage;

    //locators for making sure my account page is uptoDate
    @FindBy(xpath = "//a[contains(text(), 'Account details')]")
    public WebElement accountDetailsForAutoFill;

    @FindBy(id = "account_first_name")
    public WebElement accountDetailsFirstname;

    @FindBy(id = "account_last_name")
    public WebElement accountDetailsLastname;

    @FindBy(id = "account_email")
    public WebElement accountDetailsEmail;

    @FindBy(id="account_display_name")
    public WebElement accountDetailsDisplayName;

    @FindBy(name = "save_account_details")
    public WebElement accountDetailsSaveChanges;

    //Add button locator --> Navigating add billing adddress page
    @FindBy (xpath = "//a[@class='edit btn btn-link btn-primary btn-underline mb-4'][1]")
    public WebElement billingAdd;

    //Edit your Billing address button
    @FindBy (xpath = "//a[@class='edit btn btn-link btn-primary btn-underline mb-4'][1]")
    public WebElement billingEdit;

    @FindBy (xpath = "//input[@id='billing_first_name']")
    public WebElement billingFirstName;

    @FindBy (xpath = "//input[@id='billing_last_name']")
    public WebElement billingLastName;

    @FindBy(id = "billing_company")
    public WebElement billingCompanyName;

    @FindBy (xpath = "//input[@id='billing_email']")
    public WebElement billingEmail;

    @FindBy (id = "select2-billing_country-container")
    public WebElement billingCountry;

    @FindBy (id = "billing_address_1")
    public WebElement billingStreet;

    @FindBy (id = "billing_postcode")
    public WebElement billingPostcode;

    @FindBy (id = "billing_city")
    public WebElement billingCity;

    //@FindBy (id = "select2-billing_state-container")
    @FindBy(className = "select2-selection__placeholder")
    public WebElement billingState;


    @FindBy (id = "billing_phone")
    public WebElement billingPhone;

    @FindBy (xpath = "//button[@value='Save address']")
    public  WebElement saveBillingAddress;

    //Validation Text Alert locators
    @FindBy (xpath = "//ul[@role='alert']")
    public WebElement alertPopUps;

    @FindBy (xpath = "//ul//li[@data-id='billing_first_name']")
    public WebElement alertBillingFirstNameRequired;

    @FindBy (xpath = "//ul//li[@data-id='billing_last_name']")
    public WebElement alertBillingLastNameRequired;

    @FindBy (xpath = "//ul//li[@data-id='billing_address_1']")
    public WebElement alertBillingStreetRequired;

    @FindBy (xpath = "//ul//li[@data-id='billing_postcode']")
    public WebElement alertBillingPostcodeRequired;

    @FindBy (xpath = "//ul//li[@data-id='billing_city']")
    public WebElement alertBillingCityRequired;

    @FindBy (xpath = "//ul//li[@data-id='billing_phone']")
    public WebElement alertBillingPhoneRequired;

    @FindBy (xpath = "//ul//li[@data-id='billing_email']")
    public WebElement alertBillingEmailRequired;

    @FindBy (xpath = "//div[@role='alert']")
    public WebElement alertBillingAddressSuccess;


}
