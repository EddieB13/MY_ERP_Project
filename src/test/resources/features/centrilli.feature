Feature: Inventory Functionality

  As a PosManager, I should be able to check/edit the Inventory of the company.
  So that I can list all products in the company, I can add new products to inventory,
  I can select the Product type, I can set prices (cost & sales)


  Background: : POs manager enters on centrilli web app
    Given User is on centrilli login page
    When  User types "posmanager10@info.com" as username
    And   User types "posmanager" as password
    And   User clicks on login button
    And   Click on More dropdown
    Then  User clicks on Fleet element


  Scenario: POs manager creates new inventory
    When  User is on Vehicles page
    And   User clicks Create button
    And   Clicks on Model dropdown
    Then  Click on create and edit option


  Scenario: POs enters specific details of new vehicle
    And   User enters "Vehicle Model" and "Vehicle Brand"
    #And   Clicks Save
    #And   Enters "License Plate"
    #And   Clicks Save button


  #Scenario: POs manager continues to sub-page to create new vehicle
   # When Click on More dropdown
   # And  User clicks on Fleet element
   # Then Use is on Vehicles page
