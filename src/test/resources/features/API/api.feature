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
      | name             | duration  |
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
      | name             | duration  |
      | Uran test 2001 | 1002 days |