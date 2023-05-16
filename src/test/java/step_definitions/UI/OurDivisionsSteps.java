package step_definitions.UI;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.jce.provider.BrokenPBE;
import org.junit.Assert;
import pages.OurDivisionsPage;
import utils.BrowserUtils;
import pages.HomePage;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OurDivisionsPage;
import utils.BrowserUtils;


public class OurDivisionsSteps {
    OurDivisionsPage page;
    HomePage homePage;

    public OurDivisionsSteps() {
        page = new OurDivisionsPage();
        homePage = new HomePage();
    }

    @Given("user opens {string} page")
    public void iOpenPage(String navBtn) {
        switch (navBtn.toLowerCase()) {
            case "our divisions":
                BrowserUtils.waitForElementVisibility(homePage.servicesBtns.get(0));
                BrowserUtils.click(homePage.servicesBtns.get(0));
                break;
            default:
                Assert.fail("Invalid Navigation button");

        }
    }

    @When("I click a {string}button")
    public void iClickAButton(String divisionBtn) throws InterruptedException {
        switch (divisionBtn.toLowerCase()) {
            case "finance":
                BrowserUtils.click(page.financeBtn);
                BrowserUtils.switchToNewWindow();
                Thread.sleep(3000);
                break;
            case "information technology":
                BrowserUtils.click(page.iTbtn);
                BrowserUtils.switchToNewWindow();
                Thread.sleep(3000);
                break;
            case "healthcare":
                BrowserUtils.click(page.healthCareBtn);
                BrowserUtils.switchToNewWindow();
                Thread.sleep(3000);
                break;
            case "government projects":
                BrowserUtils.click(page.govProjectsBtn);
                BrowserUtils.switchToNewWindow();
                Thread.sleep(3000);
                break;
            case "others":
                BrowserUtils.click(page.othersBtn);
                BrowserUtils.switchToNewWindow();
                Thread.sleep(3000);
                break;
            default:
                Assert.fail("Invalid button");
        }
    }

    @Then("Verify on each division page {string} is displayed")
    public void verifyOnEachDivisionPageIsDisplayed(String contactInfo) throws InterruptedException {
        BrowserUtils.isDisplayed(page.contactOurTeam);
        Thread.sleep(2000);
        BrowserUtils.waitForElementVisibility(page.contactOurTeam);
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


