Feature: New Customer

  Background: Inicio de sesion GuruBank
    Given que estoy en la pagina de GuruBank
    When ingreso mi usuario y clave
       | mngr333141 | EhYbuna |
  Scenario: Registro de New Customer
    When Llenar el formulario
       | Pepito | f | 19/11/2021 | CLL 46c 67 A 41 | Dabeiba | No | 073792 | 3127813528 | pepito104p@gmail.com | 1234567 | 
    Then Validar el submit