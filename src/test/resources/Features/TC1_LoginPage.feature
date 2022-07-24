@Login
Feature: Verifying Adactin Hotel LoginPage Details

  Background: 
    Given User is on the Adactinhotel page

  Scenario Outline: Verifying Adactin Hotel LoginPage details with valid credentials
    When User should perform login "<userName>", "<password>"
    Then User should verify successfully login message "Hello natarajan0210!"

    Examples: 
      | userName      | password |
      | natarajan0210 | HI4551   |

  Scenario Outline: Verifying Adactin Hotel LoginPage details with Enter Key
    When User should perform login with Enter Key "<userName>", "<password>"
    Then User should verify successfully login message "Hello natarajan0210!"

    Examples: 
      | userName      | password |
      | natarajan0210 | HI4551   |

  Scenario Outline: Verifying Adactin Hotel LoginPage details with Invalid credentials
    When User should perform login "<userName>", "<password>"
    Then User should verify after login get error message "Invalid Login details or Your Password might have expired."

    Examples: 
      | userName      | password |
      | natarajan0210 | AI45515  |
