package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AboutUsPage
{
    public AboutUsPage(){ PageFactory.initElements(BrowserUtils.getDriver(), this);}

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

}
