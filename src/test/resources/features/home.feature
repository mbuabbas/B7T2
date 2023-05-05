@HomeScenarios
  Feature: Home scenarios
    @test
    Scenario: Verify text is displayed
      Then I should see text "Looking for a dream job?" is displayed
      @AD-5
      Scenario: Verify title of the homepage should be "Advance Systems - Home"
        Then Verify title of the homepage be "Advance Systems - Home"


    @AD-8
    Scenario Outline: Verify navigation bar buttons are visible even scroll down the page
      When Scroll down the homepage
      Then Verify "<button name>" button is visible
      Examples:
      |button name|
      |Home       |
      |About Us   |
      |Services   |
      |Clients    |
      |Join Us    |
      |Contact Us |


