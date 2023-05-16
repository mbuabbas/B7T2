package step_definitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AboutUsPage;
import pages.HomePage;
import utils.BrowserUtils;

public class AboutUsSteps {
    AboutUsPage page;
    HomePage homePage;
    public AboutUsSteps(){
        page = new AboutUsPage();
        homePage = new HomePage();
    }

    @Given("That the user navigates to the About Us Page")
    public void givenThatTheUserNavigatesToTheAboutUsPage(){
        BrowserUtils.sleep(1000);
        BrowserUtils.click(homePage.aboutUsBtn);
        BrowserUtils.switchToNewWindow();

    }


    @And("Verify if {string} header is displayed in the page")
    public void verifyIfHeaderIsDisplayedInThePage(String header) {
        switch(header.toLowerCase()){
            case "why choose us":
                BrowserUtils.sleep(1000);
                BrowserUtils.isDisplayed(page.whyChooseUsHeader1);
                break;
            default:
                Assert.fail("Test Failed");
        }

    }

    @Then("Verify if following {string} are displayed")
    public void verifyIfFollowingAreDisplayed(String header) {
        switch (header.toLowerCase()) {
            case "on time services":
                BrowserUtils.isDisplayed(page.onTimeServicesHeader);
                break;
            case "experienced team":
                BrowserUtils.isDisplayed(page.experiencedTeamHeader);
                break;
            case "good track records":
                BrowserUtils.isDisplayed(page.goodTrackRecordsHeader);
                break;
            default:
                Assert.fail("Test failed");
        }
    }

}
