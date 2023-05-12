package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='container']//a[text()='Get Support']")
    public WebElement getSupportNavBtn;
    @FindBy(xpath = "//div[@class='container']//a[text()='Job Career']")
    public WebElement jobCareerNavBtn;
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
    public List<WebElement> clientsBtns = new ArrayList<>();
    @FindBy(xpath = "//a[text()='Join Us']")
    public List<WebElement> joinUsBtns = new ArrayList<>();
    @FindBy(xpath = "//a[text()='Contact Us']")
    public List<WebElement> contactUsBtns = new ArrayList<>();
    @FindBy(xpath = "//div[@class='inner']//a[@href='index.html']")
    public WebElement footerHomeLink;
    @FindBy(xpath = "//div[@class='inner']//a[@href='about.html']")
    public WebElement footerAboutUsLink;
    @FindBy(xpath = "//div[@class='inner']//a[@href='services.html']")
    public WebElement footerServicesLink;
    @FindBy(xpath = "//div[@class='inner']//a[@href='clients.html']")
    public WebElement footerClientsLink;
    @FindBy(xpath = "//div[@class='inner']//a[@href='contact.html']")
    public WebElement footerContactUsLink;
    @FindBy(xpath = "//div[@class='col-md-6 col-sm-12']//a[@href='joinUs.html']")
    public WebElement footerJoinUsLink;
    @FindBy(xpath = "//section[@class='page-title']")
    public WebElement sectionPage;

    @FindBy(xpath = "//span[@class='icon fa fa-arrow-up']")
    public WebElement scrollToTop;
    @FindBy(xpath = "//a[text()='Apply now']")
    public WebElement applyNowBtn;

    @FindBy(className = "info-box-one")
    public WebElement adressInfo;

    @FindBy(xpath = "(//div[@class='info-box-one'])[2]")
    public WebElement quickContact;

    @FindBy(xpath = "//i[@class='fa fa-facebook-square']")
    public WebElement facebookBtn;
    @FindBy(xpath = "//a[contains(@href,'facebook')]")
    public List<WebElement> facebookBtns = new ArrayList<>();

    @FindBy(xpath = "//i[@class='fa fa-twitter-square']")
    public WebElement twitterBtn;
    @FindBy(xpath = "//a[contains(@href,'twitter')]")
    public List<WebElement> twitterBtns = new ArrayList<>();

    @FindBy(xpath = " //i[@class='fa fa-instagram']")
    public WebElement instagramBtn;
    @FindBy(xpath = "//a[contains(@href,'instagram')]")
    public List<WebElement> instagramBtns = new ArrayList<>();

    @FindBy(xpath = "//i[@class='fa fa-linkedin-square']")
    public WebElement linkedlnBtn;
    @FindBy(xpath = "//a[contains(@href,'linkedin')]")
    public List<WebElement> linkedinBtns = new ArrayList<>();

    @FindBy(xpath = "(//ul[@class='list-info'])[1]")
    public WebElement footerInfo;
    @FindBy(xpath = "//li[@class='current']")
    public WebElement currentPage;

    @FindBy(xpath = "//h3[normalize-space()='Leadership Development']")
    public WebElement leadershipDev;
    @FindBy(xpath = "//h3[normalize-space()='Capability Building']")
    public WebElement capabilityBuilding;
    @FindBy(xpath = "//h3[normalize-space()='Rewards & Benefits']")
    public WebElement rewardsBenefits;
    @FindBy(xpath = "//h3[normalize-space()='Employee & EmployerRelations']")
    public WebElement employeeEmployer;
    @FindBy(xpath = "//h3[normalize-space()='Excellent Customer Service']")
    public WebElement customerService;

    @FindBy(xpath = "//div[@class='owl-stage']/div[@class='owl-item active' or @class='owl-item cloned active']/div[@class='item']/img")
    public List<WebElement> companyNamesInLine;

    @FindBy(xpath = "//input[@placeholder='Email Address...']")
    public WebElement emailInputField;

    @FindBy(xpath = "(//a[@href='index.html'])[1]")
    public WebElement homeBtn;

    @FindBy(xpath = "(//h2[@class='white-heading'])[1]")
    public WebElement parallaxText;
    @FindBy(xpath = "(//h2[@class='white-heading'])[2]")
    public WebElement parallaxText2;

    @FindBy(xpath = "(//a[@href='services.html'])[4]")
    public WebElement readMoreBtn4;

    @FindBy(xpath = "(//a[@href='joinUs.html'])[2]")
    public WebElement mainHeaderJoinUsBtn;

    @FindBy(xpath = "//div[@class='owl-item active']/descendant::h3")
    public WebElement clientsName;
    @FindBy(xpath = "(//div[@class='owl-item active'])[1]")
    public WebElement clientsMsg;
    @FindBy(xpath = "//div[@class='owl-item active']/descendant::div[@class='designation']")
    public WebElement clientsState;
    @FindBy(xpath = "//h2[@class='white-heading']")
    public WebElement homeFirstHeader;
    @FindBy(xpath = "//h1[text()='About Us']")
    public WebElement aboutUsHeader;
    @FindBy(xpath = "//h1[text()='Our Divisions']")
    public WebElement servicesHeader;
    @FindBy(xpath = "//h1[text()='Our Clients']")
    public WebElement clientHeader;
    @FindBy(xpath = "//h1[text()='Join Us']")
    public WebElement joinUsHeader;
    @FindBy(xpath = "//h1[text()='Contact Us']")
    public WebElement contactUsHeader;

}

  



