

Feature: AboutUs Page Scenarios

  Background:
    Given I open "About Us" page


  @AD-29
  Scenario Outline: There should be a section header "Why Choose Us" in the about us page containing 3 sub headers
    Given That the user navigates to the About Us Page
    And Verify if "Why Choose Us" header is displayed in the page
    Then Verify if following "<Headers>" are displayed
    Examples:
      | Headers           |
      | On Time Services  |
      | Experienced Team  |
      | Good Track Records  |

  @AD-30 @AD-30a
  Scenario: Verify team header
    Then Verify "Meet Our Experts" text is displayed

  @AD-30 @AD-30b
  Scenario Outline: Verify team pictures, title, quotes, and social media links are displayed
    And Verify that picture of "<Staff Name>" is displayed
    And Verify that "<Title>" title is displayed
    And Verify "<Staff Quote>" text is displayed

    Examples:
      | Staff Name      | Title      | Staff Quote   |
      | Richard Antony  | Founder    | Richard quote |
      | Charz Cuthbert  | President  | Charz quote   |
      | Eliot Hananiah  | HR Manager | Eliot quote   |
      | Daren Eldbridge | Executive  | Daren quote   |

  @AD-30 @AD-30c
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

  @AD-30 @AD-30d
  Scenario Outline: Verify that social media button under each staff should take to corresponding pages
    When I click on social media button "facebook" under "<Staff Name>" picture
    Then Verify that social media button "facebook" take to to corresponding page
    When I navigate back to previous page
    And I click on social media button "twitter" under "<Staff Name>" picture
    Then Verify that social media button "twitter" take to to corresponding page
    When I navigate back to previous page
    And I click on social media button "skype" under "<Staff Name>" picture
    Then Verify that social media button "skype" take to to corresponding page
    When I navigate back to previous page
    And I click on social media button "linkedin" under "<Staff Name>" picture
    Then Verify that social media button "linkedin" take to to corresponding page
    Examples:
      | Staff Name      |
      | Richard Antony  |
      | Charz Cuthbert  |
      | Eliot Hananiah  |
      | Daren Eldbridge |


  @AD-31
  Scenario: About Us page: Call to action button
    Given That the user navigates to the About Us Page
    And Verify Under Expert section a header text "We are Recruitment Experts" is displayed
    When I click on "Our Services" button
    Then Verify "Our Services" button takes the user to the Services page
