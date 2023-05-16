@AboutUsScenarios
  Feature: About us scenarios
    Background: Given that the user navigates to About Us Page

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

