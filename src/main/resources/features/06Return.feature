Feature: Check return functionality
#1
  Scenario: User access menu return
    When User click menu return
    Then User should see text title page return
#2
  Scenario: User display valid data
    When User enter valid start date
    And User enter valid end date
    And User click button filter
    Then User should see data in table
#3
  Scenario: User display back date
    When User enter start date
    And User enter end date earlier than the start date
    And User click button filter
    Then User should see no data in table
#4
  Scenario: User reset date data
    When User enter valid start date
    And User enter valid end date
    And User click button reset
    Then User should see data in table
#5
  Scenario: User display all data per rows entries
    When User enter valid start date
    And User enter valid end date
    And User click button filter
    And User click combo box
    Then User should see all data in table
#6
  Scenario: User search data by name
    When User click field search
    And User enter name in field search
    And User click button search
    Then User should see the searched data
#7
  Scenario: User search invalid data by name
    When User click field search
    And User enter invalid name in field search
    And User click button search
    Then User should see no data in table
#8
  Scenario: User reset field search
    When User click field search
    And User enter name in field search
    And User click button search
    And User click button reset search
    Then User should see data in table
#9
  Scenario: User direct to menu upload document
    When User click field search
    And User enter name in field search
    And User click button search
    And User click button view
    Then User direct to menu upload document
#10
  Scenario: User display the second page in the data table
    When User enter valid start date
    And User enter valid end date
    And User click button filter
    And User click page number two
    Then User should see data in table
#11
  Scenario: User display the next page in the data table
    When User enter valid start date
    And User enter valid end date
    And User click button filter
    And User click next page
    Then User should see data in table