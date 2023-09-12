Feature: View And Export Page
#23
  Scenario: View and export admin
    When User click menu view and export admin
    Then User should see text in view export page admin
#24
  Scenario: View and export for check calender admin
    When User click menu view and export without url admin
    And User click start date for check the calender
    Then User should see the calender admin
#25
  Scenario: View and export input valid start date admin
    When User click menu view and export without url admin
    And User input start date admin
    Then User should see text in the valid start date
#26
  Scenario: View and export with invalid letter start date admin
    When User click menu view and export without url admin
    And User input letter in start date admin
    Then User should see text in start date admin
#27
  Scenario: View and export with invalid number start date admin
    When User click menu view and export without url admin
    And User input invalid number start date admin
    Then User should see text in start date for number admin
#28
  Scenario: View and export with valid end date admin
    When User click menu view and export without url admin
    And User input end date admin
    Then User should see text in the valid end date
#29
  Scenario: View and export with invalid letter end date admin
    When User click menu view and export without url admin
    And User input letter in end date admin
    Then User should see text in end date admin
#30
  Scenario: View and export with invalid number start date admin
    When User click menu view and export without url admin
    And User input invalid number end date admin
    Then User should see text in end date for number admin
#31
  Scenario: View and export button filter with valid data admin
    When User click menu view and export without url admin
    And User input start date admin
    And User input end date admin
    And User click button filter admin
    Then User should see data after click button filter
#32
  Scenario: View and export button filter with invalid data admin
    When User click menu view and export without url admin
    And User click button filter admin
    Then User should see warning message in start date field
#33
  Scenario: User click filter after without fill to end date field admin
    When User click menu view and export without url admin
    And User input start date admin
    And User click button filter admin
    Then User should see warning message in end date field
