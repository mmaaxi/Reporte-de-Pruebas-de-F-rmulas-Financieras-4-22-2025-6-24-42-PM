Feature: Validar modificación de la fórmula 'IVA Acumulado'

  Scenario: Cálculo de IVA Acumulado excluyendo IVA retenido
    Given que ingreso todos los valores de IVA, incluyendo los sujetos a ser acumulados y el IVA retenido
    When ejecuto el cálculo de la fórmula 'IVA Acumulado'
    Then el sistema debe calcular el IVA acumulado sumando todos los IVA menos el IVA retenido