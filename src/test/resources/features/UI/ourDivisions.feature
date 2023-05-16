
@OurDivisionsScenarios

Feature: Our Divisions Page Scenarios

Background:
Given I open "Our Divisions" page

    @AD-35
    Scenario Outline: Division page: Contacts
      When I click a "<Division name>"button
      Then Verify on each division page "<Contact Our Team>" is displayed


      Examples:
        |Division name         |Contact Our Team|
        |Finance               |Address: 10090 Main St, Fairfax, VA, USA Call Us:+1 703-831-3217|
        |Information Technology|Address: 10090 Main St, Fairfax, VA, USA Call Us:+1 703-831-3217|
        |Healthcare            |Address: 10090 Main St, Fairfax, VA, USA Call Us:+1 703-831-3217|
        |Government Projects   |Address: 10090 Main St, Fairfax, VA, USA Call Us:+1 703-831-3217|
        |Others                |Address: 10090 Main St, Fairfax, VA, USA Call Us:+1 703-831-3217|

  @AD-34
  Scenario Outline: Verify buttons that navigate to another page without have to go back to Our Divisions page
    Then Verify header of the page is "Our Divisions"
    When I click on "<Division>" button
    Then Verify header of the page is "<Division>"
    And I click on "Finance" quick button
    Then Verify header of the page is "Finance Division"
    When I navigate back to previous page if current "<Division>" page is not "Finance" page
    Then Verify header of the page is "<Division>"
    And I click on "Information Technology" quick button
    Then Verify header of the page is "Information Technology Division"
    When I navigate back to previous page if current "<Division>" page is not "Information Technology" page
    Then Verify header of the page is "<Division>"
    And I click on "Healthcare" quick button
    Then Verify header of the page is "Healthcare Division"
    When I navigate back to previous page if current "<Division>" page is not "Healthcare" page
    Then Verify header of the page is "<Division>"
    And I click on "Government Projects" quick button
    Then Verify header of the page is "Government Projects"
    When I navigate back to previous page if current "<Division>" page is not "Government Projects" page
    Then Verify header of the page is "<Division>"
    And I click on "Others" quick button
    Then Verify header of the page is "Others"
    Examples:
      | Division               |
      | Finance                |
      | Information Technology |
      | Healthcare             |
      | Government Projects    |
      | Others                 |


