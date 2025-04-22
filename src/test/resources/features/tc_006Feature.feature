Feature: Validar cálculo con valores máximos para montos y reservas

  Scenario: Ingresar valores máximos y validar cálculos
    Given el usuario está en la página de cálculo
    When ingresa el valor máximo en los campos de pago, acumulado y reserva
    And ejecuta todos los cálculos de fórmulas
    Then el sistema acepta los valores sin errores de desbordamiento
    And el reporte muestra los resultados correctos y precisos