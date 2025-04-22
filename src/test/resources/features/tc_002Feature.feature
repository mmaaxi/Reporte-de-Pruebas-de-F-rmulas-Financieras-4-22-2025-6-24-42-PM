Feature: Validar creación y cálculo de la columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Validar cálculo correcto de la columna 'Monto acumulado Folio Reserva 5401'
    Given Estoy en la página de cálculo de montos
    When Ingreso "1000" en el campo de monto acumulado
    And Ingreso "500" en el campo de monto de reserva actual
    Then El sistema debe mostrar "1000" en el campo de monto acumulado
    And El sistema debe mostrar "500" en el campo de monto de reserva actual
    When Verifico el cálculo de la nueva columna
    Then El resultado mostrado debe ser "1500"