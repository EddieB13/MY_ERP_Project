@wip
Feature: Create new Expenses Report

  User story: Expense Manager should be able to create Expense Report Summary


  Background:
    Given the user logged in as a expensesManager
    Then the user is on the Expenses page link


    #  Verify that the Expense Manager is able to create Expenses Report Summary by selecting "Create"
#  option for each Employee.
  Scenario:
    And the user clicks "Create" button to register
    And User enters Expenses Description
    And User enters Product details
    And User enters Employee information
    Then Verify that Expenses report Summary for each Employee is created.




    #  Verify that the "You cannot add expense lines of another employee" error message
#  is displayed when selecting expenses of another employee when approving an expense
#  on Expenses to Approve page.




  #  Verify that the "The following fields are invalid  * field name " error message
 #  is displayed when mandatory field left blank
  Scenario: To fill mandatory fields otherwise user should see alert message
    And the user clicks "Create" button to register
    And the user fills  Expense Report Summary and Employee with invalid data
    Then Verify alert message should be displayed clearly






#
