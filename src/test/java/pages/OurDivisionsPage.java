package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import step_definitions.UI.OurDivisionsSteps;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class OurDivisionsPage {
    public OurDivisionsPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }



    @FindBy(xpath = "(//div[contains(@class,'project-bottom-text')])[1]")
    public WebElement financeBtn;

    @FindBy(xpath = "//h4[normalize-space()='Information Technology']")
    public WebElement iTbtn;

    @FindBy(xpath = "//h4[normalize-space()='Healthcare']")
    public WebElement healthCareBtn;

    @FindBy(xpath = "//h4[normalize-space()='Government Projects']")
    public WebElement govProjectsBtn;

    @FindBy(xpath = "//h4[normalize-space()='Others']")
    public WebElement othersBtn;


    @FindBy(xpath = "//div[@class='contact-info-four']//div[1]//ul[1]//li[1]")
    public WebElement financeAddress;
    @FindBy(xpath = "//p[normalize-space()='Finance']")
    public WebElement financeDivision;

    @FindBy(xpath = "//div[@class='contact-info-four']//div[1]//ul[1]//li[1]")
    public WebElement itAddress;

    @FindBy(xpath = "//div[@class='contact-info-four']//div[1]//ul[1]//li[1]")
    public WebElement healthCareAddress;

    @FindBy(xpath = "//div[@class='contact-info-four']//div[1]//ul[1]//li[1]")
    public WebElement govProjectsAddress;

    @FindBy(xpath = "//div[@class='contact-info-four']//div[1]//ul[1]//li[1]")
    public WebElement othersAddress;

    @FindBy(xpath = "(//div[@class='info-box-three'])[2]")
    public WebElement financePhoneNmbr;

    @FindBy(xpath = "(//div[@class='contact-info-four'])[1]")
    public WebElement contactOurTeam;

    @FindBy(xpath = "//div[@class='container']/h1[text()='Our Divisions']")
    public WebElement ourDivisionsHeader;
    @FindBy(xpath = "//div[@class='container']/h1[text()='Finance Division']")
    public WebElement financeDivisionHeader;
    @FindBy(xpath = "//div[@class='container']/h1[text()='Information Technology Division']")
    public WebElement iTHeader;
    @FindBy(xpath = "//div[@class='container']/h1[text()='Healthcare Division']")
    public WebElement healthecareHeader;
    @FindBy(xpath = "//div[@class='container']/h1[text()='Government Projects']")
    public WebElement governmentHeader;
    @FindBy(xpath = "//div[@class='container']/h1[text()='Others']")
    public WebElement othersHeader;

    @FindBy(xpath = "//div[@class='project-bottom-text']//h4[text()='Finance']")
    public WebElement financeLinkBtn;
    @FindBy(xpath = "//div[@class='project-bottom-text']//h4[text()='Information Technology']")
    public WebElement infoTechLinkBtn;
    @FindBy(xpath = "//div[@class='project-bottom-text']//h4[text()='Healthcare']")
    public WebElement healthcareLinkBtn;
    @FindBy(xpath = "//div[@class='project-bottom-text']//h4[text()='Government Projects']")
    public WebElement govProjLinkBtn;
    @FindBy(xpath = "//div[@class='project-bottom-text']//h4[text()='Others']")
    public WebElement othersLinkBtn;

    @FindBy(xpath = "//a[contains(@href, 'finance')]")
    public WebElement financeQuickLinkBtn;
    @FindBy(xpath = "//a[contains(@href, 'division-it')]")
    public WebElement iTQuickLinkBtn;
    @FindBy(xpath = "//a[contains(@href, 'healthcare')]")
    public WebElement healthcareQuickLinkBtn;
    @FindBy(xpath = "//a[contains(@href, 'government')]")
    public WebElement governmentQuickLinkBtn;
    @FindBy(xpath = "//a[contains(@href, 'others')]")
    public WebElement othersQuickLinkBtn;


}
