Feature: Validate handling of negative values in payment operations

  Scenario: Validation for negative payment values
    Given I am on the payment page
    When I enter a negative value in the payment field
    Then I should see a validation error message
    And no erroneous calculation should be performed
    And the system should request a correction of the data