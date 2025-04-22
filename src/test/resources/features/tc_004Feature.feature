Feature: Validar integración de datos de impuestos, descuentos y montos de reserva

  Scenario: Validar datos de impuestos, descuentos y montos de reserva
    Given el usuario ha accedido al sistema de reservas
    When el usuario ingresa los datos de impuestos, descuentos y montos de reserva
    Then el sistema muestra todos los datos ingresados de forma coherente

  Scenario: Validar cálculos del reporte contable
    Given el usuario ejecuta el reporte contable actualizado
    Then los cálculos en los campos 'Pago', 'IVA Acumulado' y 'Monto acumulado Folio Reserva 5401' son correctos