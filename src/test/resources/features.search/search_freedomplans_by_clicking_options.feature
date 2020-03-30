Feature: Searching Resident Offer

  Background: I have launched the application

    Given User is on the Sales Tool Kit home page and lands on main menu

    @TC001
    Scenario: Searching for a freedom Plan

      When User Select Deal
    And  the user clicks on Data
    And  the user clicks on Light Starter
    And  the user clicks on Yes
    And the user clicks on Freedom Plan Packages
    And  the user clicks on No
    And the user clicks on Next
    And the user clicks on Save
    And the user chooses device option NO
    Then the user clicks on Ok and the offer should be saved

    @TC002
    Scenario: Searching for a freedom Plan


      When User Select Deal
      And  the user clicks on Data
      And  the user clicks on Light Starter
      And  the user clicks on Yes
      And the user clicks on Freedom Plan Packages
      And  the user clicks on No
      And the user clicks on Next
      And the user clicks on Save
      And the user chooses device option YES
      And the user chooses device type
      And the user chooses screen
      And the user chooses storage capacity
      And the user chooses deal
      And the user clicks on mobile packages
      And the user chooses value added offer NO
      And the user chooses Next for Final Mobile Package
      And the user clicks Save to save mobile package
      Then the user clicks on Ok and the mobile offer should be saved

    @TC003 @Test
     Scenario: Searching for Prepaid Visitor Offers

      When User Select Deal
      And the user clicks on Visitor
      And the user proceeds
      And the user chooses Visitor Offer
      And Select Value Added Offer
      And Clicks on Notify Customer
      And Enter Email
      Then Verify that Reference Number is generated


        @TC004 @Test
        Scenario: Searching for Prepaid Resident Offers

        When User Select Deal
          And Select Type
          And Select Deal Type
          And Select Data
          And Select Offer
          And Select Value Added Offer
          And Clicks on Notify Customer
          And Enter Email
          Then Verify that Reference Number is generated



