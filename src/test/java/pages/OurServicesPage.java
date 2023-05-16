package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class OurServicesPage {
    public OurServicesPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='filter-list row clearfix']/div/div/a")
    public List<WebElement> divisionButtons;
    @FindBy(xpath = "//title")
    public WebElement title;
}
