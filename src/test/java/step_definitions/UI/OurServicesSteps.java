package step_definitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.OurServicesPage;
import utils.BrowserUtils;

public class OurServicesSteps {
    OurServicesPage page;
    public OurServicesSteps(){
        page = new OurServicesPage();
    }
    @Then("Verify division opening corresponding page by {string}")
    public void verify_opening_corresponding_page_by( String expectedTitle) {
        String actualTitle = BrowserUtils.getDriver().getTitle();
        BrowserUtils.assertEquals(actualTitle, expectedTitle);
    }
}
