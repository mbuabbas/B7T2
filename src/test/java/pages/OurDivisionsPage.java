package pages;

import org.openqa.selenium.support.PageFactory;
import step_definitions.UI.OurDivisionsSteps;
import utils.BrowserUtils;

public class OurDivisionsPage
{
    public OurDivisionsPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
}
