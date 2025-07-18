@Suite @Login
Feature: CP01 - Validar inicio de sesion

  Background: Validar el inicio de sesion con credenciales validas

    Given el usuario entra al sistema

    @ValidCredentials
    Scenario: 1 - Iniciar Sesion con credenciales
      When ingresa credenciales validas
      Then el sistema muestra el home
