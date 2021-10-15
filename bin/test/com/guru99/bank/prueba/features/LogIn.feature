
Feature: Log In

  Scenario: Inicio de sesion GuruBank
    Given que estoy en la pagina de GuruBank
    When ingreso mi usuario y clave
      | mngr333141 | EhYbuna |
    Then deberia ver el texto Welcome To Manager s Page of Guru99 Bank
