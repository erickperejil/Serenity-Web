@Suite @PayService
Feature: CP03 - Pagar un servicio

  Background: Para usuarios registrados

    Given el sistema muestra el home
    And ingresa al modulo de pago de servicios

  @PagarRecarga
  Scenario: 1 - Pagar Recarga de Claro
    When llena el formulario de pago de servicios
    And confirma la transaccion
    Then Visualizar resultado de transaccion exitosa
    And visualiza el estado de cuenta
    And visualiza movimientos
    And navega al home
