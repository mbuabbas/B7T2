package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ContactUsPage {
    public ContactUsPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='contact-form style-two']")
    public WebElement contactUsForm;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement nameField;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneField;

    @FindBy(xpath = "//span[@class='ui-selectmenu-text']")
    public WebElement serviceDropDown;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement messageField;

    @FindBy(xpath = "//button[@name='submit-form']")
    public WebElement submitBtn;


}
