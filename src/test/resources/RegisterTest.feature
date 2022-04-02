Feature: Register new user in Fortesza page

  Background: Stagging or development enviroment ready to run tests
    Given Get configuration driver for the login automation

  Scenario Outline: Register user on Fortesza page succesfuly
    Given The user clicks on register button fill the form with email <email> and password <pass>
    When check terms and conditions box and clicks on create account button
    And User registered succesfully on Fortesza page and click on continue
    Then User fill form with basic information:
      | name   | name2   | lastname   | lastname2   | Genre   | country   | phone   | document   | maritalStatus   |
      | <name> | <name2> | <lastname> | <lastname2> | <Genre> | <country> | <phone> | <document> | <maritalStatus> |

    Examples:
      | email                  | pass     | name  | name2    | lastname | lastname2 | Genre | country  | phone      | document  | maritalStatus |
      | jolori346556@gmail.com | Prueba1* | Jorge | Humberto | Lozano   | Arenas    | M     | colombia | 3005302178 | 123456789 | soltero/a     |



