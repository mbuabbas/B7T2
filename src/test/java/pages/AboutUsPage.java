package pages;

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


}
