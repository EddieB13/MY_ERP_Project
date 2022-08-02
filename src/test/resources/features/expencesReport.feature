Feature: Create new Expenses Report

  User story: Expense Manager should be able to create Expense Report Summary


  Background:
    Given User logged in as a expensesManager
    Then User is on the Expenses page link


    #  Verify that the Expense Manager is able to create Expenses Report Summary by selecting "Create"
    #  option for each Employee.
  Scenario: Creating a new expense report
    And User selects the Expense Reports module
    And User clicks "Create" button to register
    And User enters "Trip to New York" on Expense Report Summary bar
    And User clicks Employee button
    And User select "David Samson" employee
    And User clicks Save button to save
    When User sees the "Trip to New York" on the page
    Then User clicks Approve button
    And User selects the Expense Reports To Approve module
    And User types "Trip to New York" on the search bar
    And User clicks the check box of the first appeared result
    And User clicks action button
    And User deletes the last action
    And User clicks Ok to confirm the delete action






#    And User selects the Expense Reports module
#    And User clicks "Create" button to register
#    And User selects the Expense Report Summary bar
#    And User enters "Trip to New York" to bar
#    Then User clicks Employee button
#    And User select "David Samson" employee
#    And User clicks Add an Item link to add different person expense than "David Samson"
#    And User clicks Select button at bottom and close the page
#    And User clicks Save button to save
#    Then alert message should be displayed as You can not expense lines of another employee

#  Verify that the "You cannot add expense lines of another employee" error message
#  is displayed when selecting expenses of another employee when approving an expense
#  on Expenses to Approve page.




  #  Verify that the "The following fields are invalid  * field name " error message
 #  is displayed when mandatory field left blank
  Scenario: To fill mandatory fields otherwise user should see alert message
    And User clicks "Create" button to register
    And User fills  Expense Report Summary and Employee with invalid data
    Then Verify alert message should be displayed clearly






#
