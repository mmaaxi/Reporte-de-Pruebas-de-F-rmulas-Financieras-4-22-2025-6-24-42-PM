Feature: Validar recalculo automático tras la actualización de datos

  Scenario: Recalculo automático tras actualización de datos en los campos de pago, IVA y reservas
    Given el usuario está en la página de cálculo
    When el usuario modifica los valores de pago a "500", IVA a "50" y reservas a "100"
    Then el sistema debe recalcular automáticamente con los nuevos valores
    And los cálculos actualizados deben coincidir con los valores esperados