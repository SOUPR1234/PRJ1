@ShippingAddressTest
Feature: Shipping Address verification scenarios

  @ShippingAddressValidation
  Scenario: Validation for shipping address
    Given Have the Credentials for "https://plasticmukt.com/" website
    Then Go to Addresses in My account section
    Given Input correct credentials and login
      | User_Name                    | Password     |
      | pradhansoumitra096@gmail.com | Soumitra1234 |
    Then Go to Edit Shipping address to modify existing Address
    Then Enter shipping address details
      | First_Name | Last_Name | Address1    | Address2  | City      | State     | Postcode |
      | Sou        | Pra       | 1, abc Lane | Esplanade | Bangalore | Karnataka |   500012 |
    Then Save the address
    Then Assert alert text "Address changed successfully." appears
