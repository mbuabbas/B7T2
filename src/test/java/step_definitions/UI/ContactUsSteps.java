package step_definitions.UI;

import pages.AboutUsPage;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsSteps {
    ContactUsPage page;
    HomePage homePage;
    public ContactUsSteps(){
        homePage = new HomePage();
        page = new ContactUsPage();
    }

}
