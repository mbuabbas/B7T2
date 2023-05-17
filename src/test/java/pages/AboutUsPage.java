package pages;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AboutUsPage {
    public AboutUsPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath = "(//h2[text()='Why Choose Us'])[1]")
    public WebElement whyChooseUsHeader1;

    @FindBy(xpath = "(//h3)[1]")
    public WebElement onTimeServicesHeader;

    @FindBy(xpath = "(//h3)[2]")
    public WebElement experiencedTeamHeader;

    @FindBy(xpath = "(//h3)[3]")
    public WebElement goodTrackRecordsHeader;

    @FindBy(xpath = "//div[@class='sec-title']/h2")
    public WebElement meetOurExpertHeader;

    @FindBy(xpath = "//img[contains(@src, 'team-1')]")
    public WebElement team1Photo;
    @FindBy(xpath = "//img[contains(@src, 'team-2')]")
    public WebElement team2Photo;
    @FindBy(xpath = "//img[contains(@src, 'team-3')]")
    public WebElement team3Photo;
    @FindBy(xpath = "//img[contains(@src, 'team-4')]")
    public WebElement team4Photo;

    @FindBy(xpath = "//div[text()='Founder']")
    public WebElement founderTitle;
    @FindBy(xpath = "//div[text()='President']")
    public WebElement presientTitle;
    @FindBy(xpath = "//div[text()='HR Manager']")
    public WebElement hRManagerTitle;
    @FindBy(xpath = "//div[text()='Executive']")
    public WebElement executiveTitle;

    @FindBy(xpath = "//div[@class='lower-content']//descendant::*[text()='Richard Antony']/following::div[@class='text']")
    public WebElement richardQuote;
    @FindBy(xpath = "//div[@class='lower-content']//descendant::*[text()='Charz Cuthbert']/following::div[@class='text']")
    public WebElement charzQuote;
    @FindBy(xpath = "//div[@class='lower-content']//descendant::*[text()='Eliot Hananiah']/following::div[@class='text']")
    public WebElement eliotQuote;
    @FindBy(xpath = "//div[@class='lower-content']//descendant::*[text()='Daren Eldbridge']/following::div[@class='text']")
    public WebElement darenQuote;

    @FindBy(xpath = "//html[@id='facebook']")
    public WebElement facebookPage;
    @FindBy(xpath = "//*[(text()='Explore')]")
    public WebElement twitterPage;
    @FindBy(xpath = "//a[@id='uhfCatLogo']")
    public WebElement skypePageLogo;
    @FindBy(xpath = "//*[@class='linkedin-text']")
    public WebElement linkedInPageLogo;

    @FindBy(xpath = "(//h1[normalize-space()='We are Recruitment Experts'])[1]")
    public WebElement recExpertsHeader;

    @FindBy(xpath = "//a[contains(text(), 'Our Services')]")
    public WebElement ourServicesBtn;

    @FindBy(xpath = "(//li[@class='current'])[1]")
    public WebElement ourServicesPage;

    @FindBy(xpath = "//h3[normalize-space()='Evaluate Resume']")
    public WebElement evaluateResume;
    @FindBy(xpath = "//h3[normalize-space()='Interview']")
    public WebElement interview;
    @FindBy(xpath = "//h3[normalize-space()='Screening']")
    public WebElement screening;
    @FindBy(xpath = "//h3[normalize-space()='Process Done']")
    public WebElement processDone;
    @FindBy(xpath = "//section[@class='working-process sp-two']//div[@class='container']//div[1]//div[1]//div[2]")
    public WebElement evaluateResumeText;
    @FindBy(xpath = "//div[contains(text(), 'Praising pain')]")
    public WebElement interviewText;
    @FindBy(xpath = "//section[@class='working-process sp-two']//div[3]//div[1]//div[2]")
    public WebElement screeningText;
    @FindBy(xpath = "//section[@class='working-process sp-two']//div[4]//div[1]//div[2]")
    public WebElement processDoneText;
    @FindBy(xpath = "//h2[normalize-space()='Welcome to Advance Systems LLC.']")
    public WebElement header;
    @FindBy(xpath = "//h4[normalize-space()='Kuba Z']")
    public WebElement name;
    @FindBy(xpath = "//div[normalize-space()='CEO & Founder']")
    public WebElement title;
}

