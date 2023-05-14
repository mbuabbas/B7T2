package step_definitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AboutUsPage;
import pages.HomePage;
import utils.BrowserUtils;

public class AboutUsSteps
{
    AboutUsPage page;
    HomePage homePage;
    public AboutUsSteps()
    {
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
}
