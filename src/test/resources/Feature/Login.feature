@Login
Feature: Login to Sphere

  @ValidCredentials
  Scenario: Login with valid credentials
    Given User is on Home page
    When User enters username
    And User enters password
    Then User should be able to login successfully
    Given User enters in Dashboard
    When User enters ProfileIamge
    And User enters in  change Password
    And User enters in  Old Password
    And User enters in New Password
    And User enters in Verify Password
    Then User should be save


  @Login
  Scenario: Save changes
#    Given User enters in Dashboard
#    When User enters Account
#    And User enters in  password
#    And User enters in  conform password
#    Then User should be save