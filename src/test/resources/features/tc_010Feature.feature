Feature: Validar generación de logs y auditoría tras la actualización de fórmulas

  Scenario: Actualización de datos y verificación del log y auditoría
    Given que el usuario está en la página de actualización de datos
    When el usuario actualiza los datos que activan el recalculo de fórmulas
    Then el sistema debe registrar en el log la ejecución del cálculo y la actualización de las fórmulas
    And verificar en la sección de auditoría que se generó un registro detallado de la acción