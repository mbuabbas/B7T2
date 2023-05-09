@api
Feature: practice api

  @AS-20
  Scenario: Retrieve SDET Course Names
    Given the "SDET" course endpoint is "https://tla-school-api.herokuapp.com/api/school/programs/devcourse"
    When I send a GET request to the SDET course endpoint
    Then the response status code is 200
    And the response body contains the following fields:
      | id       |
      | name     |
      | duration |

  Scenario: Retrieve Devs Course Names
    Given the "Dev" course endpoint is "https://tla-school-api.herokuapp.com/api/school/programs/devcourse"
    When I send a GET request to the SDET course endpoint
    Then the response status code is 200
    And the response body contains the following fields:
      | id       |
      | name     |
      | duration |

  @AD-22
  Scenario: Delete existing course from the db
    Given the "SDET" course endpoint is "https://tla-school-api.herokuapp.com/api/school/programs/sdetcourse"
    When I send a POST request to the SDET course endpoint with body:
      | name     | Uran test Sasuke |
      | duration | 1002 days          |
    Then the response status code is 200
    And the response body contains the following fields:
      | Uran test Sasuke |
      | 1002 days          |
    When I send a DELETE request to the SDET course with name "Uran test Sasuke"
    Then the response status code is 200
    And  the name "Uran test Sasuke" not exist in  response body