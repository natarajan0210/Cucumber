@Search
Feature: Verifying Adactin Hotel SearchHotel Details

  Background: 
    Given User is on the Adactinhotel page

  Scenario Outline: Verifying Adactin Hotel SearchHotel details with selecting all fields
    When User should perform login "<userName>", "<password>"
    Then User should verify successfully login message "Hello natarajan0210!"
    And User should search the hotel after successfully Login "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should after verify successfully search message "Select Hotel"

    Examples: 
      | userName      | password | location | hotels         | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | natarajan0210 | HI4551   | London   | Hotel Sunshine | Deluxe   | 2 - Two   | 10/07/2022  | 12/07/2022   | 2 - Two       | 1 - One          |

  Scenario Outline: Verifying Adactin Hotel SearchHotel details with selecting mandatory fields
    When User should perform login "<userName>", "<password>"
    Then User should verify successfully login message "Hello natarajan0210!"
    And User should search the hotel after successfully login with  mandatory fields "<location>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>" and "<adultsPerRoom>"
    Then User should after verify successfully search message "Select Hotel"

    Examples: 
      | userName      | password | location | noOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | natarajan0210 | HI4551   | London   | 2 - Two   | 10/07/2022  | 12/07/2022   | 2 - Two       |

  Scenario Outline: Verifying Adactin Hotel SearchHotel details with selecting invalid date
    When User should perform login "<userName>", "<password>"
    Then User should verify successfully login message "Hello natarajan0210!"
    And User should search the hotel after successfully Login "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should after verify search get error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName      | password | location | hotels         | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | natarajan0210 | HI4551   | London   | Hotel Sunshine | Deluxe   | 2 - Two   | 10/07/2022  | 06/07/2022   | 2 - Two       | 1 - One          |

  Scenario Outline: Verifying Adactin Hotel SearchHotel details without selecting any fields
    When User should perform login "<userName>", "<password>"
    Then User should verify successfully login message "Hello natarajan0210!"
    And User should search the hotel without select details after successfully login
    Then User should verify after search get error message "Please Select a Location"

    Examples: 
      | userName      | password |
      | natarajan0210 | HI4551   |
