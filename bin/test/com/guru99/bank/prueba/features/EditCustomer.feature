
Feature: Edit Customer

 Background: Inicio de sesion GuruBank
    Given Que tengo cliente creado
    When Datos del clinte para editar
      | Pepito | f | 19/11/2021 | CLL 46c 67 A 41 | Dabeiba | No | 073792 | 3127813528 | pepito104@gmail.com | 1234567 | 

  Scenario: Edit Customer
     When Datos nuevos
     | CLL 46c 67 A 41 | Dabeiba | No disponible | 073792 | 3127813528 | pepito104@gmail.com | 123pepito |
     Then Submit de validar
