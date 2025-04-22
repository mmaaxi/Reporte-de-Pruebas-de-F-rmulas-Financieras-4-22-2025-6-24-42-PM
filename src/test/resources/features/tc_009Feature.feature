Feature: Validate calculation consistency with multiple records

  Scenario: Validate calculations with different entries
    Given the user has entered multiple records with various payment, VAT, and reserve values
    When the user executes the batch calculation process
    Then each record should display correct results according to its data