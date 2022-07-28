@wip
Feature: Create new Expenses Report

  User story: Expense Manager should be able to create Expense Report Summary



  Background:
    Given the user logged in as a expensesManager
    Then the user is on the Expenses page link


  Scenario Outline: To fill mandatory fields otherwise user should see alert message
    And the user selects the Expense Reports module
    And the user clicks "Create" button to register
    And the user fills "<Expense Report Summary>" and "<Employee>" with invalid data
    And the user clicks Save button to save
    Then alert message should be displayed cearly

    Examples:
      | Expense Report Summary | Employee       |
      | Trip to Germany        |                |
      |                        | Ashley Presley |