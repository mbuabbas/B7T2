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

    @FindBy(xpath = "//div[@class='text'][text()='Looking for a dream job?']")
    public WebElement test;

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

}
