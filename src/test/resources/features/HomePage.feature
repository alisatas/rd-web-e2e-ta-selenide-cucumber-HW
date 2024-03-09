Feature: As a User I want to test homepage feature

  @Test
  Scenario: User checks dynamic message
    Given openPage
    When User click buttons button
    And User clicks click me button
    Then user checks dynamic message

  @Test
    Scenario Outline: User add new user
    Given open WebTable Page
    Given user click add button
    And user enter data for '<username>' '<surname>' '<email>' '<age>' '<salary>' '<department>'
    And user click save button
    Examples:
      | username | surname | email         | age | salary | department |
      | Ali isa  | tas     | tasal@sdf.com | 34  | 3500   | QA         |

  @Test
  Scenario Outline: User edit a user
    Given open WebTable Page
    Given user click edit button
    And user enter data for '<username>' '<surname>' '<email>' '<age>' '<salary>' '<department>'
    And user click save button
    Then check edited area '<username>'
    Examples:
      | username | surname | email         | age | salary | department |
      | Alisa    | tas     | tasal@sdf.com | 34  | 3500   | Test       |

