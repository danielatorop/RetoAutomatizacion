Feature: regiset the users in the page utest
  Scenario: register the user new
    Given the user enters the page
    When You must fill out the form
    |name|lastame|email|month|day|year|
    |Andres|garcia|garciar299@gmail.com|April|11|1990|
    Then the validate the register succes

