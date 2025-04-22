Feature: Validar manejo de error en caso de formato incorrecto en la entrada de datos

  Scenario: Usuario ingresa dato inválido y el sistema muestra mensaje de error
    Given el usuario está en la página de entrada de datos
    When el usuario ingresa un formato de dato inválido en el campo de entrada
    Then el sistema muestra un mensaje de error indicando el formato incorrecto
    When el usuario intenta ejecutar el cálculo de la fórmula
    Then el sistema impide el cálculo y solicita la corrección de los datos ingresados