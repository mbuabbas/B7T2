package step_definitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AboutUsPage;
import pages.ContactUsPage;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.Map;

public class ContactUsSteps {
    ContactUsPage page;
    HomePage homePage;
    AboutUsPage aboutUsPage;
    public ContactUsSteps(){
        homePage = new HomePage();
        page = new ContactUsPage();
        aboutUsPage = new AboutUsPage();
    }

    @And("Verify if theres a form to fill in the page")
    public void verifyIfTheresAFormToFillInThePage(){
        BrowserUtils.waitForElementVisibility(page.contactUsForm);
        BrowserUtils.isDisplayed(page.contactUsForm);
    }


    @Then("Verify if form contains the following {string}")
    public void verifyIfFormContainsTheFollowing(String fields) {
        switch(fields.toLowerCase()){
            case "your name*":
                BrowserUtils.waitForElementVisibility(page.nameField);
                BrowserUtils.isDisplayed(page.nameField);
                break;
            case "phone number":
                BrowserUtils.waitForElementVisibility(page.phoneField);
                BrowserUtils.isDisplayed(page.phoneField);
                break;
            case "choose service":
                BrowserUtils.waitForElementVisibility(page.serviceDropDown);
                BrowserUtils.isDisplayed(page.serviceDropDown);
                break;
            case "your message...":
                BrowserUtils.waitForElementVisibility(page.messageField);
                BrowserUtils.isDisplayed(page.messageField);
                break;
            case "submit now":
                BrowserUtils.waitForElementVisibility(page.submitBtn);
                BrowserUtils.isDisplayed(page.submitBtn);
                break;
            default:
                Assert.fail("Test Failed");
        }
    }


}
