@HomeScenarios
  Feature: Home scenarios
    @test
    Scenario: Verify text is displayed
      Then I should see text "Looking for a dream job?" is displayed

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


