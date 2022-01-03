@stories
Feature: Utest
  create a new user in utest.com
  @scenario1
  Scenario: create a new user
    Given than jesus wants to register in utest.com

    When he fill out the fields of the registration form
    | strName | strLastName | strEmail                      | strMonthBirthday    | strDayBirthday  | strYearBirthday | strCity | strCodPostal  | strPassword                |
    | Jesus   | Doria       | jesusdaniel152009222@gmail.com | June                | 19              | 1993            | Covenas | 706050        | choucairTestingPrueba2021* |
    Then he looks at the utest splash screen