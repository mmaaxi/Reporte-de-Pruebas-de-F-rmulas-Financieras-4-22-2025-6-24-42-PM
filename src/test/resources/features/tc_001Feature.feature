Feature: Validación de actualización de fórmula en el campo 'Pago'

  Scenario: Calcular correctamente el pago incluyendo IVA y descuentos
    Given El usuario ingresa "1000" en el campo de monto base
    And El usuario ingresa "18" en el campo de IVA
    And El usuario ingresa "50" en el campo de descuento
    When El usuario ejecuta el cálculo de la fórmula de 'Pago'
    Then El sistema debe mostrar el valor calculado correctamente como "1180"