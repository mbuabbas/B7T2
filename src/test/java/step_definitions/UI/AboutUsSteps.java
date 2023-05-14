package step_definitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

    @Given("I open {string} page")
    public void iOpenPage(String navBtn)
    {
        switch(navBtn.toLowerCase())
        {
            case "about us":
                BrowserUtils.waitForElementVisibility(homePage.aboutUsBtns.get(0));
                BrowserUtils.click(homePage.aboutUsBtns.get(0));
                break;
            default:
                Assert.fail("Invalid Navigation button");

        }
    }

    @And("Verify that picture of {string} is displayed")
    public void verifyThatPictureOfIsDisplayed(String staffName)
    {
        switch(staffName.toLowerCase())
        {
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
    public void verifyThatTitleIsDisplayed(String title)
    {
        switch (title.toLowerCase())
        {
            case "founder":
                BrowserUtils.assertEquals(page.founderTitle.getText(),title);
                BrowserUtils.isDisplayedWithPressKeyUp(page.founderTitle);
                break;
            case "president":
                BrowserUtils.assertEquals(page.presientTitle.getText(),title);
                BrowserUtils.isDisplayedWithPressKeyUp(page.presientTitle);
                break;
            case "hr manager":
                BrowserUtils.assertEquals(page.hRManagerTitle.getText(),title);
                BrowserUtils.isDisplayedWithPressKeyUp(page.hRManagerTitle);
                break;
            case "executive":
                BrowserUtils.assertEquals(page.executiveTitle.getText(),title);
                BrowserUtils.isDisplayedWithPressKeyUp(page.executiveTitle);
                break;
            default:
                Assert.fail("Invalid Title!");
        }
    }

    @And("Verify {string} buttons under {string} picture are visible")
    public void verifyButtonsUnderPictureAreVisible(String socialMediaBtn, String staffName)
    {
                BrowserUtils.isEnabledWithKeyUp(BrowserUtils.getDriver().findElement(By.xpath("" +
                        "//div[@class='lower-content']//descendant::*[text()='" + staffName + "']" +
                        "/following::a[contains(@href,'" + socialMediaBtn + "')]")));

                BrowserUtils.isDisplayedWithPressKeyUp(BrowserUtils.getDriver().findElement(By.xpath("" +
                        "//div[@class='lower-content']//descendant::*[text()='" + staffName + "']" +
                        "/following::a[contains(@href,'" + socialMediaBtn + "')]")));
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



    @Then("Verify if following {string} are displayed:")
    public void verifyIfFollowingAreDisplayed(String header) {
        switch (header.toLowerCase()){
            case "on time services":
                BrowserUtils.isDisplayed(page.onTimeServicesHeader);
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

    @When("I click on social media button {string} under {string} picture")
    public void iClickOnSocialMediaButtonUnderPicture(String socialMediaBtn, String staffName)
    {
        BrowserUtils.clickWithPressUpKey(BrowserUtils.getDriver().findElement(By.xpath("" +
                "//div[@class='lower-content']//descendant::*[text()='" + staffName + "']" +
                "/following::a[contains(@href,'" + socialMediaBtn + "')]")));
    }

    @Then("Verify that social media button {string} take to to corresponding page")
    public void verifyThatSocialMediaButtonTakeToToCorrespondingPage(String socialMediaName)
    {
        switch (socialMediaName.toLowerCase())
        {
            case "facebook":
                BrowserUtils.isDisplayed(page.facebookPage);
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(),"https://www.facebook.com/");

                break;
            case "twitter":
                BrowserUtils.isDisplayed(page.twitterPage);
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(),"https://twitter.com/");

                break;
            case "skype":
                BrowserUtils.isDisplayed(page.skypePageLogo);
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(),"https://www.skype.com/en/");
                break;
            case "linkedin":
                BrowserUtils.sleep(1000);
                BrowserUtils.isDisplayed(page.linkedInPageLogo);
                BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(),"https://www.linkedin.com/");
                break;
            default:
                Assert.fail("Invalid Social Media page!");
        }
    }

    @When("I navigate back to previous page")
    public void iNavigateBackToPreviousPage()
    {
        BrowserUtils.getDriver().navigate().back();
    }
}
