Feature: Login in Fortesza page

  Background: Stagging or development enviroment ready to run tests
    Given Get configuration driver for the login automation

    Scenario Outline: Login on Fortesza page succesfuly
      Given The user login in the page with email <email> and password <pass>
      Examples:
        | email                    | pass          |
        | erasmotorres09@gmail.com | esFortesza21* |