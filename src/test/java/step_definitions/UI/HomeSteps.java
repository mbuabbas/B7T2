package step_definitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.AboutUsPage;
import pages.HomePage;
import pages.OurDivisionsPage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;
    AboutUsPage aboutUsPage;
    OurDivisionsPage ourDivisionsPage;

    public HomeSteps() {
        page = new HomePage();
        aboutUsPage = new AboutUsPage();
        ourDivisionsPage = new OurDivisionsPage();
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
                BrowserUtils.isDisplayed(page.clientsBtns.get(1));
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
            case "read more":
                BrowserUtils.isDisplayed(page.readMoreBtn4);
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
                BrowserUtils.click(page.clientsBtns.get(1));
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
        BrowserUtils.waitForElementVisibility(page.instagramBtn);
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
        switch (socialMediaBtn.toLowerCase()) {
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
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), URL);

    }

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String footerInfo) {
        BrowserUtils.isDisplayed(page.footerInfo);
    }


    @Then("Verify {string} place holder is displayed")
    public void verifyPlaceHolderIsDisplayed(String emailInputField) {
        BrowserUtils.isDisplayed(page.emailInputField);
    }

    @When("I click a {string}")
    public void iClickA(String btnName) {
        switch (btnName.toLowerCase()) {
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
            case "read more":
                BrowserUtils.click(page.readMoreBtn4);
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
                BrowserUtils.assertEquals(BrowserUtils.getText(page.leadershipDev), item);
                break;
            case "Capability Building":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.capabilityBuilding), item);
                break;
            case "Rewards & Benefits":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.rewardsBenefits), item);
                break;
            case "Employee & Employer Relations":
                String employeeItem = "Employee & Employer\nRelations";
                BrowserUtils.assertEquals(BrowserUtils.getText(page.employeeEmployer), employeeItem);
                break;
            case "Excellent Customer Service":
                BrowserUtils.assertEquals(BrowserUtils.getText(page.customerService), item);
                break;
            default:
                Assert.fail("Invalid text");
        }
    }


    @Then("Verify {string} is listed in line")
    public void verifyIsListedInLine(String companyName) {
        boolean isThere = false;
        int numInList = 0;
        for (int i = 0; i < page.companyNamesInLine.size(); i++) {
            System.out.println(page.companyNamesInLine.get(i).getAttribute("alt"));
            System.out.println(companyName);
            if (page.companyNamesInLine.get(i).getAttribute("alt").equals(companyName)) {
                isThere = true;
                numInList = i;
                break;
            }
        }
        BrowserUtils.waitForElementVisibility(page.companyNamesInLine.get(numInList));
        if (isThere) {
            BrowserUtils.assertEquals(page.companyNamesInLine.get(numInList).getAttribute("alt"), companyName);
        }
    }

    @And("Verify {string} logo is displayed")
    public void verifyLogoIsDisplayed(String companyName) {
        for (int i = 0; i < page.companyNamesInLine.size(); i++) {
            if (page.companyNamesInLine.get(i).getAttribute("alt").equals(companyName)) {
                BrowserUtils.isDisplayed(page.companyNamesInLine.get(i));
                break;
            }
        }
    }

    @When("Loading the home page")
    public void whenLoadingTheHomePage() {
        BrowserUtils.sleep(3000);
        BrowserUtils.click(page.homeBtn);
    }

    @And("Verify section part of the Home Page displays a text {string}")
    public void verifySectionPartOfTheHomePageDisplaysAText(String parallaxText) {
        BrowserUtils.sleep(3000);
        BrowserUtils.waitForElementVisibility(page.parallaxText);

        BrowserUtils.assertTrue(page.parallaxText.isDisplayed());

    }


    @Then("Verify if section part of the Home Page refreshes and change display text to {string}")
    public void verifyIfSectionPartOfTheHomePageRefreshesAndChangeDisplayTextTo(String text) {
        BrowserUtils.sleep(3000);
        BrowserUtils.waitForElementVisibility(page.parallaxText2);
        BrowserUtils.assertTrue(page.parallaxText2.isDisplayed());
    }

    @Then("Verify if button leads to {string} end point page")
    public void verifyIfButtonLeadsToEndPointPage(String url) {
        switch (url.toLowerCase()) {
            case "services":
                BrowserUtils.sleep(3000);
                BrowserUtils.switchToNewWindow();
                BrowserUtils.assertTrue(BrowserUtils.getDriver().getCurrentUrl().contains(url));
                break;
            case "joinus.html":
                BrowserUtils.sleep(3000);
                BrowserUtils.switchToNewWindow();
                BrowserUtils.assertTrue(BrowserUtils.getDriver().getCurrentUrl().contains(url));
                break;
        }
    }

    @And("Verify {string} button in the main header is visible")
    public void verifyButtonInTheMainHeaderIsVisible(String mainHeaderBtn) {
        switch (mainHeaderBtn.toLowerCase()) {
            case "join us":
                BrowserUtils.sleep(3000);
                BrowserUtils.assertTrue(page.mainHeaderJoinUsBtn.isDisplayed());
                break;
            default:
                Assert.fail("Test Failed");
        }
    }

    @And("Click on {string} button in the main header")
    public void clickOnButtonInTheMainHeader(String mainHeaderBtn) {
        switch (mainHeaderBtn.toLowerCase()) {
            case "join us":
                BrowserUtils.click(page.mainHeaderJoinUsBtn);
                break;
            default:
                Assert.fail("Test Failed");
        }
    }

    @Then("Verify if clients name and state are displayed")
    public void verifyIfClientsNameAndStateAreDisplayed() {
        BrowserUtils.sleep(1000);
        BrowserUtils.isDisplayed(page.clientsName);
        BrowserUtils.sleep(1000);
        BrowserUtils.isDisplayed(page.clientsState);
//        BrowserUtils.assertTrue(page.clientsName.isDisplayed());
//        BrowserUtils.assertTrue(page.clientsState.isDisplayed());
    }


    @Then("Verify if clients message is displayed")
    public void verifyIfClientsMessageIsDisplayed() {
        BrowserUtils.sleep(1000);
        BrowserUtils.isDisplayed(page.clientsMsg);

    }

    @And("Verify under Testimonial {string} is displayed")
    public void verifyUnderTestimonialIsDisplayed(String header) {
        BrowserUtils.sleep(1000);
        BrowserUtils.isDisplayed(page.testimonialHeader);
    }

    @Then("Verify header of the page is {string}")
    public void verifyHeaderOfThePageIs(String header) {
        BrowserUtils.sleep(3000);
        switch (header.toLowerCase()) {
            case "home":
                BrowserUtils.isDisplayedWithNoMoveInToView(page.homeFirstHeader);
                break;
            case "about us":
                BrowserUtils.isDisplayedWithNoMoveInToView(page.aboutUsHeader);
                break;
            case "services":
                BrowserUtils.isDisplayedWithNoMoveInToView(page.servicesHeader);
                break;
            case "clients":
                BrowserUtils.isDisplayedWithNoMoveInToView(page.clientHeader);
                break;
            case "join us":
                BrowserUtils.isDisplayedWithNoMoveInToView(page.joinUsHeader);
                break;
            case "contact us":
                BrowserUtils.isDisplayedWithNoMoveInToView(page.contactUsHeader);
                break;
            case "our divisions":
                BrowserUtils.isDisplayedWithPressKeyUp(ourDivisionsPage.ourDivisionsHeader);
                break;
            case "finance division":
            case "finance":
                BrowserUtils.isDisplayedWithPressKeyUp(ourDivisionsPage.financeDivisionHeader);
                break;
            case "information technology division":
            case "information technology":
                BrowserUtils.isDisplayedWithPressKeyUp(ourDivisionsPage.iTHeader);
                break;
            case "healthcare division":
            case "healthcare":
                BrowserUtils.isDisplayedWithPressKeyUp(ourDivisionsPage.healthecareHeader);
                break;
            case "government projects":
            case "government":
                BrowserUtils.isDisplayedWithPressKeyUp(ourDivisionsPage.governmentHeader);
                break;
            case "others":
                BrowserUtils.isDisplayedWithPressKeyUp(ourDivisionsPage.othersHeader);
                break;
            default:
                Assert.fail("Invalid header!");
        }
    }

    @Then("Verify {string} text is displayed")
    public void verifyTextIsDisplayed(String text) {
        switch (text.toLowerCase()) {
            case "welcome to advance systems llc.":
                BrowserUtils.assertEquals(page.centerHeaderText.getText(), text);
                BrowserUtils.isDisplayedWithPressKeyUp(page.centerHeaderText);
                break;
            case "our mission is simple, deliver very honest recruitment services to every customer.":
                BrowserUtils.assertEquals(page.centerSecondaryHeader.getText(), text);
                BrowserUtils.isDisplayedWithPressKeyUp(page.centerSecondaryHeader);
                break;
            case "description":
                BrowserUtils.assertTrue(!page.descriptionText.getText().isEmpty());
                BrowserUtils.isDisplayedWithPressKeyUp(page.descriptionText);
                break;
            case "meet our experts":
                BrowserUtils.assertEquals(aboutUsPage.meetOurExpertHeader.getText(), text);
                BrowserUtils.isDisplayedWithPressKeyUp(aboutUsPage.meetOurExpertHeader);
                break;
            case "richard quote":
                BrowserUtils.assertTrue(!aboutUsPage.richardQuote.getText().isEmpty());
                BrowserUtils.isDisplayedWithPressKeyUp(aboutUsPage.richardQuote);
                break;
            case "charz quote":
                BrowserUtils.assertTrue(!aboutUsPage.charzQuote.getText().isEmpty());
                BrowserUtils.isDisplayedWithPressKeyUp(aboutUsPage.charzQuote);
                break;
            case "eliot quote":
                BrowserUtils.assertTrue(!aboutUsPage.eliotQuote.getText().isEmpty());
                BrowserUtils.isDisplayedWithPressKeyUp(aboutUsPage.eliotQuote);
                break;
            case "daren quote":
                BrowserUtils.assertTrue(!aboutUsPage.darenQuote.getText().isEmpty());
                BrowserUtils.isDisplayedWithPressKeyUp(aboutUsPage.darenQuote);
                break;
            default:
                Assert.fail("Invalid text!");

        }
    }

}
