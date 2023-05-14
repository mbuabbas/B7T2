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
        BrowserUtils.click(homePage.aboutUsBtn);
        BrowserUtils.switchToNewWindow();
        BrowserUtils.sleep(3000);
    }


    @And("Verify if {string} header is displayed in the page")
    public void verifyIfHeaderIsDisplayedInThePage(String header) {
        switch(header.toLowerCase()){
            case "why choose us":
                BrowserUtils.isDisplayed(page.whyChooseUsHeader1);
                BrowserUtils.assertEquals(page.whyChooseUsHeader1.getText(), header);
                BrowserUtils.sleep(1000);
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
                BrowserUtils.moveIntoView(page.onTimeServicesHeader);
                BrowserUtils.assertEquals(page.onTimeServicesHeader.getText(), header);
                break;
            case "experienced team":
                BrowserUtils.isDisplayed(page.experiencedTeamHeader);
                BrowserUtils.assertEquals(page.experiencedTeamHeader.getText(), header);
                break;
            case "good track records":
                BrowserUtils.isDisplayed(page.goodTrackRecordsHeader);
                BrowserUtils.assertEquals(page.goodTrackRecordsHeader.getText(), header);
                break;
            default:
                Assert.fail("Test failed");
        }
    }
}
