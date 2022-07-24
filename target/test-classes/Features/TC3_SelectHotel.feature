@Select
Feature: Verifying Adactin Hotel SelectHotel Details

  Background: 
    Given User is on the Adactinhotel page

  Scenario Outline: Verifying Adactin Hotel SelectHotel details with select the hotel
    When User should perform login "<userName>", "<password>"
    Then User should verify successfully login message "Hello natarajan0210!"
    And User should search the hotel after successfully Login "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should after verify successfully search message "Select Hotel"
    And User should select the hotel and continue after successfully search
    Then User should verify successfully select hotel get message "Book A Hotel"

    Examples: 
      | userName      | password | location | hotels         | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | natarajan0210 | HI4551   | London   | Hotel Sunshine | Deluxe   | 2 - Two   | 10/07/2022  | 12/07/2022   | 2 - Two       | 1 - One          |

  Scenario Outline: Verifying Adactin Hotel SelectHotel details without select the hotel
    When User should perform login "<userName>", "<password>"
    Then User should verify successfully login message "Hello natarajan0210!"
    And User should search the hotel after successfully Login "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should after verify successfully search message "Select Hotel"
    And User should without select the hotel and continue after successfully search
    Then User should verify after continue get error message "Please Select a Hotel"

    Examples: 
      | userName      | password | location | hotels         | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | natarajan0210 | HI4551   | London   | Hotel Sunshine | Deluxe   | 2 - Two   | 10/07/2022  | 12/07/2022   | 2 - Two       | 1 - One          |
