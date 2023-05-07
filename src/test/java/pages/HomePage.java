package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='container']//a[text()='Get Support']")
    public WebElement getSupportNavBtn;
    @FindBy(xpath = "//div[@class='container']//a[text()='Job Career']")
    public  WebElement jobCareerNavBtn;
    @FindBy(xpath = "//div[@class='container']//a[text()='Feedback']")
    public WebElement feedBackNavBtn;
    @FindBy(xpath = "//div[@class='container']//a[@id='dropdownMenu1']")
    public WebElement languageBtn;
    @FindBy(xpath = "//a[text()='English']")
    public WebElement englishBtn;
    @FindBy(xpath = "//a[text()='Spanish']")
    public WebElement spanishBtn;
    @FindBy(xpath = "//a[text()='French']")
    public WebElement frenchBtn;
    @FindBy(xpath = "//head//title")
    public WebElement homePageTitle;
    @FindBy(xpath = "//div[@class='sec-title centered']")
    public WebElement welcomeHeader;
    @FindBy(xpath = "//li[@class='current']/a[text()='Home']")
    public List<WebElement> homeBtns = new ArrayList<>();
    @FindBy(xpath = "//a[text()='About Us']")
    public List<WebElement> aboutUsBtns = new ArrayList<>();
    @FindBy(xpath = "//a[text()='Services']")
    public List<WebElement> servicesBtns = new ArrayList<>();
    @FindBy(xpath = "//a[text()='Clients']")
    public WebElement clientsBtn;
    @FindBy(xpath = "//a[text()='Join Us']")
    public List<WebElement> joinUsBtns = new ArrayList<>();
    @FindBy(xpath = "//a[text()='Contact Us']")
    public List<WebElement> contactUsBtns = new ArrayList<>();
    @FindBy(xpath = "//span[@class='icon fa fa-arrow-up']")
    public WebElement scrollToTop;
    @FindBy(xpath = "//a[text()='Apply now']")
    public WebElement applyNowBtn;



}
