@Book
Feature: Verifying Adactin Hotel BookHotel Details

  Background: 
    Given User is on the Adactinhotel page

  Scenario Outline: Verifying Adactin Hotel BookHotel details with all fields
    When User should perform login "<userName>", "<password>"
    Then User should verify successfully login message "Hello natarajan0210!"
    And User should search the hotel after successfully Login "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should after verify successfully search message "Select Hotel"
    And User should select the hotel and continue after successfully search
    Then User should verify successfully select hotel get message "Book A Hotel"
    And User should book the hotel after successfully select hotel using "<firstName>", "<lastName>" and "<address>"
      | creditCardType   | creditCardNumber | expiryMonth | expiryYear | cvv |
      | American Express | 1234098754327890 | June        |       2022 | 133 |
      | VISA             | 1234098754327890 | June        |       2022 | 123 |
      | Master Card      | 1234098754327890 | June        |       2022 | 130 |
    Then User should verify after successfully book hotel get message "Booking Confirmation"

    Examples: 
      | userName      | password | location | hotels         | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom | firstName | lastName | address              |
      | natarajan0210 | HI4551   | London   | Hotel Sunshine | Deluxe   | 2 - Two   | 05/07/2022  | 07/07/2022   | 2 - Two       | 1 - One          | Natarajan | N        | 1/5, Croydon, London |

  Scenario Outline: Verifying Adactin Hotel BookHotel details without all fields
    When User should perform login "<userName>", "<password>"
    Then User should verify successfully login message "Hello natarajan0210!"
    And User should search the hotel after successfully Login "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should after verify successfully search message "Select Hotel"
    And User should select the hotel and continue after successfully search
    Then User should verify successfully select hotel get message "Book A Hotel"
    And User should book the hotel after successfully without filling details
    Then User should after verify book hotel get error message "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number", "Please Select your Credit Card Type", "Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName      | password | location | hotels         | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | natarajan0210 | HI4551   | London   | Hotel Sunshine | Deluxe   | 2 - Two   | 05/07/2022  | 07/07/2022   | 2 - Two       | 1 - One          |
