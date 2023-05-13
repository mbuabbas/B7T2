package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AboutUsPage {

    public AboutUsPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//h3[normalize-space()='Evaluate Resume']")
    public WebElement EvaluateResume;
    @FindBy(xpath = "//h3[normalize-space()='Interview']")
    public WebElement Interview;

    @FindBy(xpath = "//h3[normalize-space()='Screening']")
    public WebElement Screening;

    @FindBy(xpath = "//h3[normalize-space()='Process Done']")
    public WebElement ProcessDone;

}
