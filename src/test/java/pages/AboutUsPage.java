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
    @FindBy(xpath = "//section[@class='working-process sp-two']//div[@class='row']//div[2]//div[1]//div[1]")
    public WebElement interviewText;
    @FindBy(xpath = "//section[@class='working-process sp-two']//div[3]//div[1]//div[2]")
    public WebElement screeningText;
    @FindBy(xpath = "//section[@class='working-process sp-two']//div[4]//div[1]//div[2]")
    public WebElement processDoneText;
}
