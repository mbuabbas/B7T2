package step_definitions.UI;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OurDivisionsPage;
import utils.BrowserUtils;

public class OurDivisionsSteps
{
    OurDivisionsPage page;
    public OurDivisionsSteps(){
        page = new OurDivisionsPage();
    }

    @When("I click on {string} quick button")
    public void i_click_on_quick_button(String btn)
    {
        switch (btn.toLowerCase())
        {
            case "finance":
                BrowserUtils.clickWithPressUpKey(page.financeQuickLinkBtn);
                break;
            case "information technology":
                BrowserUtils.clickWithPressUpKey(page.iTQuickLinkBtn);
                break;
            case "healthcare":
                BrowserUtils.clickWithPressUpKey(page.healthcareQuickLinkBtn);
                break;
            case "government projects":
                BrowserUtils.clickWithPressUpKey(page.governmentQuickLinkBtn);
                break;
            case "others":
                BrowserUtils.clickWithPressUpKey(page.othersQuickLinkBtn);
                break;
            default:
                Assert.fail("Test Failed");
        }

    }

    @When("I navigate back to previous page if current {string} page is not {string} page")
    public void iNavigateBackToPreviousPageIfCurrentPageIsNotPage(String testingPage, String currentPage)
    {
        if (!testingPage.equals(currentPage))
        {
            BrowserUtils.getDriver().navigate().back();
        }
    }
}
