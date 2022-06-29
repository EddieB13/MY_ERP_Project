Feature: Inventory Functionality

  As a PosManager, I should be able to check/edit the Inventory of the company.
  So that I can list all products in the company, I can add new products to inventory,
  I can select the Product type, I can set prices (cost & sales)

  @wip
  Scenario: PosManager creates a new product
    Given User is on Centrilli webPage
    Then  User enters username "posmanager10@info.com"
    And   User enters password "posmanager"
    And   User click on log in button
    Then  User sees homepage
