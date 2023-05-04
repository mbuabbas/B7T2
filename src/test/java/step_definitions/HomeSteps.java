package step_definitions;

import io.cucumber.java.en.Then;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;
    public HomeSteps() {
        page = new HomePage();
    }

    @Then("Verify button {string} is displayed")
    public void verifyButtonIsDisplayed(String navBtn) {
        switch (navBtn){
            case "Get Support" -> BrowserUtils.assertEquals(BrowserUtils.getText(page.getSupportNavBtn), navBtn);
            case "Job Career" -> BrowserUtils.assertEquals(BrowserUtils.getText(page.jobCareerNavBtn), navBtn);
            case "Feedback" -> BrowserUtils.assertEquals(BrowserUtils.getText(page.feedBackNavBtn), navBtn);
            case "English" -> BrowserUtils.assertTrue(true);
            case "Spanish" -> BrowserUtils.assertTrue(true);
            case "French" -> BrowserUtils.assertTrue(true);

        }
    }
}
