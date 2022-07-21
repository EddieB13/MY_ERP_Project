Feature: Create new CONTACTS

  User story: As a POS Manager I should be able to create notes


  Background:
    Given  User is logged in with valid credentials
    And    user is in Customers submenu


  Scenario: Verify that the user can create new contact
    When  User clicks Create button
    And   Enters name and contact name on according fields
    And   Clicks save button
    Then  Verify that new contact is created


  Scenario: Verify that the user can switch Kanban-List view
    When   User is on kanban view
    And    User click on list view
    Then   Verify that list view is displayed

  @wip
   Scenario: Verify that the user can discard changes
     When  User clicks Create button
     And   Enters name and contact name on according fields
     And   User clicks discard button
    Then   Verify changes are not saved


 ## Scenario: Verify that the user can edit contact
 ## When
 ## And
 ## And
 ## Then


 ## Scenario: Verify that the user can delete contact
 ## When
 ## And
 ## And
 ## Then