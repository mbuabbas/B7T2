@AboutUsScenarios
Feature: AboutUs Page Scenarios

  Background:
    Given I open "About Us" page

  @AD-30a
  Scenario: Verify team header
    Then Verify "Meet Our Experts" text is displayed

  @AD-30b
  Scenario Outline: Verify team pictures, title, quotes, and social media links are displayed
    And Verify that picture of "<Staff Name>" is displayed
    And Verify that "<Title>" title is displayed
    And Verify "<Staff Quote>" text is displayed

#    When I click on social media "<Social Media Btn>" button under "<Picture>"
#    Then Verify each button takes user to corresponding page with "<URL>"
    Examples:
      | Staff Name      | Title      | Staff Quote   | Social Media Btn |
      | Richard Antony  | Founder    | Richard quote | facebook         |
      | Charz Cuthbert  | President  | Charz quote   | twitter          |
      | Eliot Hananiah  | HR Manager | Eliot quote   | skype            |
      | Daren Eldbridge | Executive  | Daren quote   | linkedIn         |

  @AD-30c
  Scenario Outline: Verify social media links are displayed under each Staff
    And Verify "facebook" buttons under "<Staff Name>" picture are visible
    And Verify "twitter" buttons under "<Staff Name>" picture are visible
    And Verify "skype" buttons under "<Staff Name>" picture are visible
    And Verify "linkedin" buttons under "<Staff Name>" picture are visible
    Examples:
      | Staff Name      |
      | Richard Antony  |
      | Charz Cuthbert  |
      | Eliot Hananiah  |
      | Daren Eldbridge |