@BillingAddressTest
Feature: Billing Address verification scenarios

  @BlankFirstNameValidation
  Scenario: Validation for error text for blank First Name
    Given Have the Credentials for "https://plasticmukt.com/" website
    Then Go to Addresses in My account section
    Given Input correct credentials and login
      | User_Name                    | Password     |
      | pradhansoumitra096@gmail.com | Soumitra1234 |
    Then Go to Edit Billing address to modify existing Address
    When Clear First Name
    Then Save the address
    Then Assert error text "First name is a required field." appears

  @InvalidEmailValidation
  Scenario: Validation for error text for incorrect email address
    Given Have the Credentials for "https://plasticmukt.com/" website
    Then Go to Addresses in My account section
    Given Input correct credentials and login
      | User_Name                    | Password     |
      | pradhansoumitra096@gmail.com | Soumitra1234 |
    Then Go to Edit Billing address to modify existing Address
    When Clear Email and input incorrect Email "pradhansoumitra096@gmailcom"
    Then Save the address
    Then Assert error text "Email address is not a valid email address." appears

  @InvalidPhoneValidation
  Scenario: Validation for error text for incorrect phone number
    Given Have the Credentials for "https://plasticmukt.com/" website
    Then Go to Addresses in My account section
    Given Input correct credentials and login
      | User_Name                    | Password     |
      | pradhansoumitra096@gmail.com | Soumitra1234 |
    Then Go to Edit Billing address to modify existing Address
    When Clear Email and input incorrect Phone "abcde"
    Then Save the address
    Then Assert error text "Phone is not a valid phone number." appears

  @BillingAddressValidation
  Scenario: Validation for shipping address
    Given Have the Credentials for "https://plasticmukt.com/" website
    Then Go to Addresses in My account section
    Given Input correct credentials and login
      | User_Name                    | Password     |
      | pradhansoumitra096@gmail.com | Soumitra1234 |
    Then Go to Edit Billing address to modify existing Address
    Then Enter billing address details
      | First_Name | Last_Name | Address1    | Address2  | City      | State     | Postcode | Phone      | Email       |
      | Sou        | Pra       | 1, abc Lane | Esplanade | Bangalore | Karnataka |   500012 | 9876543210 | abc@abc.com |
    Then Save the address
    Then Assert alert text "Address changed successfully." appears
