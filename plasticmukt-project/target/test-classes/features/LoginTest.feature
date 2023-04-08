@LoginTest
Feature: Login verification scenarios

  @InvalidLoginValidation
  Scenario: Validation for failed login with incorrect email address
    #	Given Open Chrome Browser
    Given Have the Credentials for "https://plasticmukt.com/" website
    Then Go to Addresses in My account section
    When Input incorrect email address and password and try to login
      | User_Name                     | Password     |
      | pradhansoumitra096@gmail.comm | Soumitra1234 |
    Then Assert an error text "Unknown email address. Check again or try your username." appears

  @LoginValidation
  Scenario: Validation for login with correct email address
    Given Have the Credentials for "https://plasticmukt.com/" website
    Then Go to Addresses in My account section
    Then Input correct credentials and login
      | User_Name                    | Password     |
      | pradhansoumitra096@gmail.com | Soumitra1234 |
