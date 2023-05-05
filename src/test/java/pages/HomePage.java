package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

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


}
