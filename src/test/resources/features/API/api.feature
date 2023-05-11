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

<<<<<<< HEAD
  @AD-21
  Scenario: Verify option to add new course to database
    Given I perform get request to "devcourse" endpoint
    Then Verify response status code is 200
=======
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
    Given I perform a PUT request to "https://tla-school-api.herokuapp.com/api/school/resources/students" with body:
      | streetAddress | 1100 Pensylvania Avenue NW |
      | city          | Washington, DC             |
      | state         | VA                         |
      | zip           | 20004                      |
      | places        | yes                        |
      | company       | META                       |
      | location      | Washington, DC             |
      | firstName     | Uran                       |
      | lastName      | Suranchiyev                |
      | batch         | 7                          |
      | email         | uransura@gmail.com         |
    Then the response status code is 200
    And the response body contains the following fields:
      | 1100 Pensylvania Avenue NW |
      | Washington, DC             |
      | VA                         |
      | 20004                      |
      | yes                        |
      | META                       |
      | Washington, DC             |
      | Uran                       |
      | Suranchiyev                |
      | 7                          |
      | uransura@gmail.com         |
>>>>>>> main
