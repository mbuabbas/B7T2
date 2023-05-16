@ContactUsScenarios
  Feature: Contact Us Scenarios
    Background: 
      Given I open "Contact Us" page

    @AD-37
    Scenario Outline: There should be a form where user can fill out their information and message to send a request.
      Then Verify if theres a form to fill in the page
      Then Verify if form contains the following "<Fields>"
      Examples:
      | Fields |
      | Your Name* |
      | Phone Number |
      | Choose Service |
      | Your Message... |
      | Submit Now |
