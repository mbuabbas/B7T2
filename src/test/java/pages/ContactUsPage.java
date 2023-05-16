package pages;

import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ContactUsPage {
    public ContactUsPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
}
