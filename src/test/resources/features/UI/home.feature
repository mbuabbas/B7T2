@HomeScenarios
Feature: Home scenarios

  @AD-6
  Scenario Outline: Verify navigation bar buttons
    Then Verify button "<button name>" is displayed
    Examples:
      | button name |
      | Get Support |
      | Job Career  |
      | Feedback    |
      | English     |
      | Spanish     |
      | French      |

  @AD-5
  Scenario: Verify title of the homepage should be "Advance Systems - Home"
    Then Verify title of the homepage be "Advance Systems - Home"


  @AD-8
  Scenario Outline: Verify navigation bar buttons are visible even scroll down the page
    When Scroll down the homepage
    Then Verify "<button name>" button is visible
    When Click on "<button name>" button
    Then Verify title of the page is "Advance Systems - <button name>"
    Examples:
      |button name|
      |Home       |
      |About Us   |
      |Services   |
      |Clients    |
      |Join Us    |
      |Contact Us |

  @AD-17
  Scenario: Verify a button that would scroll the window to top content once clicked
    When Scroll down the homepage
    Then Click on "scroll to top" button
    Then Verify that button "Apply now" is Displayed without using move in to view method

  @AD-3
  Scenario: Verify contact info on main page is displayed
    Then Verify address: "10090 Main Street Fairfax, VA, USA" is displayed
    Then Verify contact info: "Quick Contact: +1 703-831-3217" is displayed


  @AD-9
  Scenario Outline: Verify each social media button takes user to corresponding page
    When I click on social media button "<socialMediaButton>"
    Then Verify each button takes user to corresponding page with "<URL>"
    Examples:
      |socialMediaButton|URL|
      | Facebook            | https://www.facebook.com/  |
      | Twitter             | https://twitter.com/  |
      | Instagram           | https://www.instagram.com/ |
      | LinkedIn            | https://www.linkedin.com/  |

  @AD-13
  Scenario: Verify the following information is displayed in footer section:
    Then Verify "Address: 10090 Main St, Fairfax, VA" is displayed
    Then Verify "Phone: +1 703-831-3217" is displayed
    Then Verify "Email: Info@advancesystems.us" is displayed
    Then Verify "Mon to Sat: 9.00 am to 5:00 pm" is displayed

  @AD-15
  Scenario Outline: Verify the social media buttons are displayed and should take you to those pages
    Then Verify "<social media>" button is visible
    When Click on "<social media>" button
    Then Verify each button takes user to corresponding page with "<URL>"
    Examples:
      |social media       |URL                       |
      |Facebook           |https://www.facebook.com/ |
      |Twitter            |https://twitter.com/      |
      |Instagram          |https://instagram.com/    |
      |LinkedIn           |https://www.linkedin.com/ |