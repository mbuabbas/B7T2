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
    Examples:
      | button name |
      | Home        |
      | About Us    |
      | Services    |
      | Clients     |
      | Join Us     |
      | Contact Us  |

  @AD-10
  Scenario Outline: Verify section with 5 items displayed as a headers and descriptions under it
    When Scroll down the homepage
    Then Verify "<item>" displayed
    Examples:
      | item                          |
      | Leadership Development        |
      | Capability Building           |
      | Rewards & Benefits            |
      | Employee & Employer Relations |
      | Excellent Customer Service    |
