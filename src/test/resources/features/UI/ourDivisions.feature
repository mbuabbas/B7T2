@OurDivisionsScenarios

Feature: Our Divisions Page Scenarios

  Background:
    Given user opens "Our Divisions" page

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


