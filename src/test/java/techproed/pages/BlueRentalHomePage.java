package techproed.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
public class BlueRentalHomePage {
    public BlueRentalHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(partialLinkText = "Login")
    public WebElement loginLink;
    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;
    @FindBy(linkText = "Logout")
    public WebElement logOutLink;
    @FindBy(xpath = "//button[.='OK']")
    public WebElement OK;
    @FindBy(xpath = "//*[@name='car']")
    public WebElement Select_a_car_dropdown;
    @FindBy(xpath = "//*[@name='pickUpLocation']")
    public WebElement pickup;
    @FindBy(xpath="//*[@name='dropOfLocation']")
    public WebElement dropOff;
    @FindBy(xpath="//*[@name='pickUpDate']")
    public WebElement pickupDate;
    @FindBy(xpath="//*[@name='pickUpTime']")
    public WebElement pickupTime;
    @FindBy(xpath="//*[@name='dropOffDate']")
    public WebElement dropOffDate;
    @FindBy(xpath="//*[@name='dropOffTime']")
    public WebElement dropOffTime;
    @FindBy(xpath = "//*[.=' CONTINUE RESERVATION']")
    public WebElement continueReservation;



}