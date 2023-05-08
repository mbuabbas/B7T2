package step_definitions.UI;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();
    }

    @Then("Verify button {string} is displayed")
    public void verifyButtonIsDisplayed(String navBtn) {
        switch (navBtn) {
            case "Get Support":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.getSupportNavBtn), navBtn);
                break;
            case "Job Career":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.jobCareerNavBtn), navBtn);
                break;
            case "Feedback":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.feedBackNavBtn), navBtn);
                break;
            case "English": {
                BrowserUtils.click(page.languageBtn);
                BrowserUtils.assertEquals(BrowserUtils.getText(page.englishBtn), navBtn);
                break;
            }
            case "Spanish": {
                BrowserUtils.click(page.languageBtn);
                BrowserUtils.assertEquals(BrowserUtils.getText(page.spanishBtn), navBtn);
                break;
            }
            case "French": {
                BrowserUtils.click(page.languageBtn);
                BrowserUtils.assertEquals(BrowserUtils.getText(page.frenchBtn), navBtn);
                break;
            }
        }
    }

    @Then("Verify title of the homepage be {string}")
    public void verifyTitleOfTheHomepageBe(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);

    }

    @Then("Verify {string} button is visible")
    public void verify_button_is_visible(String btnName) {
        switch (btnName.toLowerCase()) {
            case "home":
                BrowserUtils.isDisplayed(page.homeBtns.get(1));
                break;
            case "about us":
                BrowserUtils.isDisplayed(page.aboutUsBtns.get(1));
                break;
            case "services":
                BrowserUtils.isDisplayed(page.servicesBtns.get(1));
                break;
            case "clients":
                BrowserUtils.isDisplayed(page.clientsBtn);
                break;
            case "join us":
                BrowserUtils.isDisplayed(page.joinUsBtns.get(1));
                break;
            case "contact us":
                BrowserUtils.isDisplayed(page.contactUsBtns.get(1));
                break;
            default:
                Assert.fail("Invalid button");
        }
    }

    @When("Scroll down the homepage")
    public void scrollDownTheHomepage() {
        BrowserUtils.moveIntoView(page.welcomeHeader);
    }



    @Then("Verify {string} displayed")
    public void verifyDisplayed(String item) {
        switch (item) {
            case "Leadership Development":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.leadershipDev),item);
                break;

            case "Capability Building":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.capabilityBuilding),item);
                break;
            case "Rewards & Benefits":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.rewardsBenefits),item);
                break;
            case "Employee & Employer Relations":
                String employeeItem = "Employee & Employer\nRelations";
                BrowserUtils.assertEquals(BrowserUtils.getText(page.employeeEmployer),employeeItem);
                break;
            case "Excellent Customer Service":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.customerService),item);
                break;
            //default:
                //Assert.fail("Invalid text");
        }
    }

}