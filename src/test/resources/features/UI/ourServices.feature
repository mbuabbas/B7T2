Feature: Our Services page Scenarios

  Background:
    Given I open "Our Services" page

  @AD-33
  Scenario Outline: There should be 4 divisions displayed for now on this page
    Given I click on "<division>" button
    Then Verify division opening corresponding page by "<title of the page>"
    Examples:
      | division               | title of the page                              |
      | Finance                | Advance Systems - Finance Division             |
      | Information Technology | Advance Systems - IT Division                  |
      | Healthcare             | Advance Systems - Healthcare Division          |
      | Government Projects    | Advance Systems - Government Projects Division |