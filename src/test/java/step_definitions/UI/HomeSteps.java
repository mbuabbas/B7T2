package step_definitions.UI;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
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
            case "facebook":
                BrowserUtils.isDisplayed(page.facebookBtns.get(1));
                break;
            case "twitter":
                BrowserUtils.isDisplayed(page.twitterBtns.get(1));
                break;
            case "instagram":
                BrowserUtils.isDisplayed(page.instagramBtns.get(1));
                break;
            case "linkedin":
                BrowserUtils.isDisplayed(page.linkedinBtns.get(1));
                break;
            default:
                Assert.fail("Invalid button");
        }
    }

    @When("Scroll down the homepage")
    public void scrollDownTheHomepage() {
        BrowserUtils.moveIntoView(page.welcomeHeader);
    }

    @When("Click on {string} button")
    public void clickOnButton(String btnName) {
        switch (btnName.toLowerCase()) {
            case "home":
                BrowserUtils.click(page.homeBtns.get(1));
                break;
            case "about us":
                BrowserUtils.click(page.aboutUsBtns.get(1));
                break;
            case "services":
                BrowserUtils.click(page.servicesBtns.get(1));
                break;
            case "clients":
                BrowserUtils.click(page.clientsBtn);
                break;
            case "join us":
                BrowserUtils.click(page.joinUsBtns.get(1));
                break;
            case "contact us":
                BrowserUtils.click(page.contactUsBtns.get(1));
                break;
            case "scroll to top":
                BrowserUtils.click(page.scrollToTop);
                break;
            case "facebook":
                BrowserUtils.click(page.facebookBtns.get(1));
                break;
            case "twitter":
                BrowserUtils.click(page.twitterBtns.get(1));
                break;
            case "instagram":
                BrowserUtils.click(page.instagramBtns.get(1));
                break;
            case "linkedin":
                BrowserUtils.click(page.linkedinBtns.get(1));
                break;
            default:
                Assert.fail("Invalid button");
        }

    }

    @Then("Verify title of the page is {string}")
    public void verifyTitleOfThePageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("Verify that button {string} is Displayed without using move in to view method")
    public void verifyThatButtonIsDisplayedWithoutUsingMoveInToViewMethod(String button) {
        BrowserUtils.isDisplayedWithNoMoveInToView(page.applyNowBtn);
    }


    @Then("Verify address: {string} is displayed")
    public void verifyAddressIsDisplayed(String txt) {
        BrowserUtils.isDisplayed(page.adressInfo);

    }
    @Then("Verify contact info: {string} is displayed")
    public void verifyContactInfoIsDisplayed(String quickContact) {

        BrowserUtils.isDisplayed(page.quickContact);
    }

    @When("I click on social media button {string}")
    public void iClickOnSocialMediaButton(String socialMediaBtn) {
        switch (socialMediaBtn.toLowerCase()){
            case "facebook":
                BrowserUtils.click(page.facebookBtn);
                BrowserUtils.switchToNewWindow();
                break;
            case "twitter":
                BrowserUtils.click(page.twitterBtn);
                BrowserUtils.switchToNewWindow();
                break;
            case "instagram":
                BrowserUtils.click(page.instagramBtn);
                BrowserUtils.switchToNewWindow();
                break;
            case "linkedin":
                BrowserUtils.click(page.linkedlnBtn);
                BrowserUtils.switchToNewWindow();
                break;
            default:
                Assert.fail("Invalid button name");

        }
    }

    @Then("Verify each button takes user to corresponding page with {string}")
    public void verifyEachButtonTakesUserToCorrespondingPageWith(String URL) {
        BrowserUtils.switchToNewWindow();
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(),URL);

    }
    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String footerInfo) {
        BrowserUtils.isDisplayed(page.footerInfo);
    }

    @When("I click a {string}")
    public void iClickA(String btnName) {
        switch (btnName.toLowerCase())
        {
            case "home":
                BrowserUtils.click(page.footerHomeLink);
                break;
            case "about us":
                BrowserUtils.click(page.footerAboutUsLink);
                break;
            case "services":
                BrowserUtils.click(page.footerServicesLink);
                break;
            case "clients":
                BrowserUtils.click(page.footerClientsLink);
                break;
            case "join us":
                BrowserUtils.click(page.footerJoinUsLink);
                break;
            case "contact us":
                BrowserUtils.click(page.footerContactUsLink);
                break;
            default:
                Assert.fail("Invalid button");
        }
    }

    @Then("Verify {string} opening corresponding page")
    public void verifyOpeningCorrespondingPage(String expectedPage) {
        String actual = BrowserUtils.getText(page.currentPage);
        BrowserUtils.assertEquals(actual, expectedPage.toUpperCase());

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