package step_definitions;

import io.cucumber.java.en.Then;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;
    public HomeSteps() {
        page = new HomePage();
    }
    @Then("I should see text {string} is displayed")
    public void i_should_see_text_is_displayed(String text) {
        BrowserUtils.assertEquals(BrowserUtils.getText(page.test), text);
    }

}
