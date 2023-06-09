package step_definitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AboutUsPage;
import pages.HomePage;
import pages.OurServicesPage;
import pages.OurDivisionsPage;
import utils.BrowserUtils;

import java.util.List;


public class AboutUsSteps {
    OurServicesPage ourServicesPage;
    AboutUsPage page;
    HomePage homePage;
    private Actions actions;
    OurDivisionsPage ourDivisionsPage;

    public AboutUsSteps() {
        ourServicesPage = new OurServicesPage();
        page = new AboutUsPage();
        homePage = new HomePage();
        ourDivisionsPage = new OurDivisionsPage();
    }

    @Given("I open {string} page")
    public void iOpenPage(String navBtn) {
        switch (navBtn.toLowerCase()) {
            case "about us":
                BrowserUtils.waitForElementVisibility(homePage.aboutUsBtns.get(0));
                BrowserUtils.click(homePage.aboutUsBtns.get(0));
                break;
            case "our services":
                BrowserUtils.waitForElementVisibility(homePage.servicesBtns.get(0));
                BrowserUtils.click(homePage.servicesBtns.get(0));
                break;
            case "our divisions":
                BrowserUtils.waitForElementVisibility(homePage.servicesBtns.get(0));
                BrowserUtils.click(homePage.servicesBtns.get(0));
                break;
            case "contact us":
                BrowserUtils.waitForElementVisibility(homePage.contactUsBtns.get(0));
                BrowserUtils.click(homePage.contactUsBtns.get(0));
                BrowserUtils.sleep(3000);
                break;
            default:
                Assert.fail("Invalid Navigation button");

        }
    }

    @And("Verify that picture of {string} is displayed")
    public void verifyThatPictureOfIsDisplayed(String staffName) {
        switch (staffName.toLowerCase()) {
            case "richard antony":
                BrowserUtils.isDisplayedWithPressKeyUp(page.team1Photo);
                break;
            case "charz cuthbert":
                BrowserUtils.isDisplayedWithPressKeyUp(page.team2Photo);
                break;
            case "eliot hananiah":
                BrowserUtils.isDisplayedWithPressKeyUp(page.team3Photo);
                break;
            case "daren eldbridge":
                BrowserUtils.isDisplayedWithPressKeyUp(page.team4Photo);
                break;
            default:
                Assert.fail("Invalid Staff Photo!");

        }
    }

    @And("Verify that {string} title is displayed")
    public void verifyThatTitleIsDisplayed(String title) {
        switch (title.toLowerCase()) {
            case "founder":
                BrowserUtils.assertEquals(page.founderTitle.getText(), title);
                BrowserUtils.isDisplayedWithPressKeyUp(page.founderTitle);
                break;
            case "president":
                BrowserUtils.assertEquals(page.presientTitle.getText(), title);
                BrowserUtils.isDisplayedWithPressKeyUp(page.presientTitle);
                break;
            case "hr manager":
                BrowserUtils.assertEquals(page.hRManagerTitle.getText(), title);
                BrowserUtils.isDisplayedWithPressKeyUp(page.hRManagerTitle);
                break;
            case "executive":
                BrowserUtils.assertEquals(page.executiveTitle.getText(), title);
                BrowserUtils.isDisplayedWithPressKeyUp(page.executiveTitle);
                break;
            default:
                Assert.fail("Invalid Title!");
        }
    }

    @And("Verify {string} buttons under {string} picture are visible")
    public void verifyButtonsUnderPictureAreVisible(String socialMediaBtn, String staffName) {
        BrowserUtils.isEnabledWithKeyUp(BrowserUtils.getDriver().findElement(By.xpath("" +
                "//div[@class='lower-content']//descendant::*[text()='" + staffName + "']" +
                "/following::a[contains(@href,'" + socialMediaBtn + "')]")));

        BrowserUtils.isDisplayedWithPressKeyUp(BrowserUtils.getDriver().findElement(By.xpath("" +
                "//div[@class='lower-content']//descendant::*[text()='" + staffName + "']" +
                "/following::a[contains(@href,'" + socialMediaBtn + "')]")));
    }

    @Given("That the user navigates to the About Us Page")
    public void givenThatTheUserNavigatesToTheAboutUsPage() {
        BrowserUtils.sleep(1000);
        BrowserUtils.click(homePage.aboutUsBtn);
        BrowserUtils.switchToNewWindow();

    }


    @And("Verify if {string} header is displayed in the page")
    public void verifyIfHeaderIsDisplayedInThePage(String header) {
        switch (header.toLowerCase()) {
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


    @When("I click on social media button {string} under {string} picture")
    public void iClickOnSocialMediaButtonUnderPicture(String socialMediaBtn, String staffName) {
        BrowserUtils.clickWithPressUpKey(BrowserUtils.getDriver().findElement(By.xpath("" +
                "//div[@class='lower-content']//descendant::*[text()='" + staffName + "']" +
                "/following::a[contains(@href,'" + socialMediaBtn + "')]")));
    }

    @Then("Verify that social media button {string} take to to corresponding page")
    public void verifyThatSocialMediaButtonTakeToToCorrespondingPage(String socialMediaName) {
        switch (socialMediaName.toLowerCase()) {
            case "facebook":
                BrowserUtils.isDisplayed(page.facebookPage);
                BrowserUtils.sleep(500);
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), "Facebook - log in or sign up");
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), "https://www.facebook.com/");

                break;
            case "twitter":
                BrowserUtils.isDisplayed(page.twitterPage);
                BrowserUtils.sleep(500);
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), "Explore / Twitter");
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), "https://twitter.com/");

                break;
            case "skype":
                BrowserUtils.isDisplayed(page.skypePageLogo);
                BrowserUtils.sleep(500);
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), "Skype | Stay connected with free video calls worldwide");
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), "https://www.skype.com/en/");
                break;
            case "linkedin":
                BrowserUtils.sleep(2000);
                BrowserUtils.isDisplayed(page.linkedInPageLogo);
                BrowserUtils.sleep(500);
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), "LinkedIn: Log In or Sign Up");
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), "https://www.linkedin.com/");
                break;
            default:
                Assert.fail("Invalid Social Media page!");
        }
    }

    @When("I navigate back to previous page")
    public void iNavigateBackToPreviousPage() {
        BrowserUtils.getDriver().navigate().back();
    }


    @And("Verify Under Expert section a header text {string} is displayed")
    public void verifyUnderExpertSectionAHeaderTextIsDisplayed(String headerTxt) {
        BrowserUtils.sleep(4000);
        BrowserUtils.isDisplayed(page.recExpertsHeader);


    }

    @When("I click on {string} button")
    public void iClickOnButton(String ourServicesBtn) {
        switch (ourServicesBtn.toLowerCase()) {
            case "our services":
                BrowserUtils.sleep(4000);
                BrowserUtils.click(page.ourServicesBtn);
                BrowserUtils.switchToNewWindow();
                break;
            case "finance":
                BrowserUtils.clickWithPressUpKey(ourDivisionsPage.financeLinkBtn);
                break;
            case "information technology":
                BrowserUtils.clickWithPressUpKey(ourDivisionsPage.infoTechLinkBtn);
                break;
            case "healthcare":
                BrowserUtils.clickWithPressUpKey(ourDivisionsPage.healthcareLinkBtn);
                break;
            case "government projects":
                BrowserUtils.clickWithPressUpKey(ourDivisionsPage.govProjLinkBtn);
                break;
            case "others":
                BrowserUtils.clickWithPressUpKey(ourDivisionsPage.othersLinkBtn);
                break;
            default:
                Assert.fail("Test Failed");
        }

    }

    @Then("Verify {string} button takes the user to the Services page")
    public void verifyButtonTakesTheUserToTheServicesPage(String servicesPage) {
        BrowserUtils.sleep(1000);
        BrowserUtils.isDisplayed(page.ourServicesPage);


    }


    @And("Verify if following section with  {string} with description text are displayed:")
    public void verifyIfFollowingSectionWithWithDescriptionTextAreDisplayed(String header) {
        String actualHeader = "";
        String description = "";
        switch (header.toLowerCase()) {
            case "evaluate resume":
                BrowserUtils.waitForElementVisibility(page.evaluateResumeText);
                BrowserUtils.waitForElementVisibility(page.evaluateResume);
                description = BrowserUtils.getText(page.evaluateResumeText);
                actualHeader = BrowserUtils.getText(page.evaluateResume);
                break;
            case "interview":
                description = BrowserUtils.getText(page.interviewText);
                actualHeader = BrowserUtils.getText(page.interview);
                break;
            case "screening":
                description = BrowserUtils.getText(page.screeningText);
                actualHeader = BrowserUtils.getText(page.screening);
                break;
            case "process done":
                description = BrowserUtils.getText(page.processDoneText);
                actualHeader = BrowserUtils.getText(page.processDone);
                break;
        }
        BrowserUtils.assertEquals(actualHeader,header);
        BrowserUtils.assertTrue(!description.equals(""));
    }
}


