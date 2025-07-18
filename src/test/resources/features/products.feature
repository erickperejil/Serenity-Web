@Suite @MyProducts
Feature: CP02 - Validar los productos de un usuario

  Background: Validar los productos que tiene un usuario

    Given el sistema muestra el home



  @Saldos
  Scenario: 1 - Cuenta de ahorros
    When ingresa a cuenta de ahorro
    Then visualiza los saldos y detalles
    And visualiza el estado de cuenta
    And visualiza movimientos
    And navega al home
