@AboutUsScenarios
  Feature: About us scenarios
    Background: Given that the user navigates to About Us Page

  @AD-29
    Scenario: There should be a section header "Why Choose Us" in the about us page containing 3 sub headers
      Given That the user navigates to the About Us Page
      And Verify if "Why Choose Us" header is displayed in the page
      Then Verify if following "<Headers>" are displayed:
      | Headers           |
      | On Time Services  |
      | Experienced Team  |
      | Good Track Records  |


    @AD-31
    Scenario: About Us page: Call to action button
      Given That the user navigates to the About Us Page
      And Verify Under Expert section a header text "We are Recruitment Experts" is displayed
      When I click on "Our Services" button
      Then Verify "Our Services" button takes the user to the Services page
