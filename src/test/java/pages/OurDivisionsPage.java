package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import step_definitions.UI.OurDivisionsSteps;
import utils.BrowserUtils;

public class OurDivisionsPage
{
    public OurDivisionsPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

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
