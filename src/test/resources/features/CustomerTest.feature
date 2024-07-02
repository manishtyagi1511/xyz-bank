Feature: Customer should login and logout

  @smoke
  Scenario: Customer should login and logout successfully
    Given I am on the homepage
    When I click on Customer Login Tab
    And I search customer that I created
    And I click on Login Button
    And I verify Logout tab displayed
    And I click on Logout
    Then I verify your name text displayed

  @sanity
  Scenario: customer Should Deposit Money Successfully
    Given I am on the homepage
    When I click on Customer Login Tab
    And I search customer that I created
    And I click on Login Button
    And I click on Deposit button
    And I enter amount hundred
    And I click on deposit button1
    Then I verify the message Deposit Successful

  @regression
  Scenario: customer Should Withdraw Money Successfully
    Given I am on the homepage
    When I click on Customer Login Tab
    And I search customer that I created
    And I click on Login Button
    And I click on Withdrawl Tab
    And I enter amount fifty
    And I click on Withdrawl button
    Then I verify the message Transaction Successful




