Feature: bank manager user option working successfully

  @smoke
  Scenario: Bank Manager Should Add Customer Successfully.
    Given I am on the homepage
    When I click on Bank Manager login tab
    And I click on add customer tab
    And I enter firstname
    And I enter last name
    And I enter postcode
    And I click on add customer button
    And pop up display
    And I should verify the message Customer added successfully
    Then I click on Okay button on pop

  @sanity
  Scenario: Bank Manager Should Open Account Successfully.
    Given I am on the homepage
    When I click on Bank Manager login tab
    And I click on Open Account Tab
    And I select customer that created in first test
    And I select currency Pound
    And I click on Process button
    And pop up display1
    And I verify the message Account created successfully
    Then I click on Okay button on popup1




