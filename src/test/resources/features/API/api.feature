@api
Feature: practice api

  @AD-22
  Scenario Outline: Delete existing course from the db
    Given the "Dev" course endpoint is "https://tla-school-api.herokuapp.com/api/school/programs/devcourse"
    When I send a POST request with body "<name>", "<duration>"
    Then the response status code is 200
    And the response body contains the following fields "<name>", "<duration>"
    When I send a DELETE request to the SDET course with "<name>"
    Then the response status code is 200
    And  the "<name>" not exist in  response body
    Examples:
      | name           | duration  |
      | Uran test 2001 | 1002 days |

  @AD-22-b
  Scenario Outline: Delete existing course from the db
    Given the "SDET" course endpoint is "https://tla-school-api.herokuapp.com/api/school/programs/sdetcourse"
    When I send a POST request with body "<name>", "<duration>"
    Then the response status code is 200
    And the response body contains the following fields "<name>", "<duration>"
    When I send a DELETE request to the SDET course with "<name>"
    Then the response status code is 200
    And  the "<name>" not exist in  response body
    Examples:
      | name           | duration  |
      | Uran test 2001 | 1002 days |

  @AS-20
  Scenario: Retrieve SDET Course Names
    Given I perform get request to  "https://tla-school-api.herokuapp.com/api/school/programs/sdetcourse"
    Then the response status code is 200
    And the response body contains the following fields:
      | id       |
      | name     |
      | duration |

  @AS-20
  Scenario: Retrieve Devs Course Names
    Given I perform get request to  "https://tla-school-api.herokuapp.com/api/school/programs/devcourse"
    Then the response status code is 200
    And the response body contains the following fields:
      | id       |
      | name     |
      | duration |

  @AD-23
  Scenario: Add new student
    Given I send a POST request to "https://tla-school-api.herokuapp.com/api/school/resources/students" with body:
      | batch     | 77                          |
      | firstname | Raul                        |
      | lastname  | Suranchiyev                 |
      | email     | darkhanSuranchiyevgmail.com |
    Then the response status code is 200
    And the response body contains the following fields:
      | 77                          |
      | Raul                        |
      | Suranchiyev                 |
      | darkhanSuranchiyevgmail.com |


  @AD-24
  Scenario: Update existing student info
    Given I send a POST request to "https://tla-school-api.herokuapp.com/api/school/resources/students" with body:
      | batch     | 665      |
      | firstname | Test     |
      | lastname  | Test     |
      | email     | test.com |
    Then the response status code is 200
    And the response body contains the following fields:
      | 665      |
      | Test     |
      | Test     |
      | test.com |
    Given I perform a PUT request to "https://tla-school-api.herokuapp.com/api/school/resources/students" with body:
      | firstName | Uran               |
      | lastName  | Suranchiyev        |
      | batch     | 7                  |
      | email     | uransura@gmail.com |
    Then the response status code is 200
    When I perform get request to  "https://tla-school-api.herokuapp.com/api/school/resources/students"
    Then the response body contains the following fields:
      | Uran               |
      | Suranchiyev        |
      | 7                  |
      | uransura@gmail.com |