
@Pasha @Regression
Feature: : check Lunch functionality with valid expenses manager credential
  Background:
    Given user in the "Lunch" page


                                                #US1
##########################################################################################################################
  Scenario: check 'My Lunch' module functionality
    #Given user in the "Lunch" page
    When user click on "New Order" tab
    Then user should be able to order a new item
    And check ordered item by clicking on "Previous Orders"
    And check expenses by clicking on "Your Lunch Account" tab


                                              #US2
##########################################################################################################################
Scenario Outline: check "Manager" module functionality
     # Given user in the "Lunch" page
      When user click on "<tabs>"
      Then user should be able to see information about "<tabs>" page
     And user should be able to do the "<actions>" from the page specific tab
      Examples:
|       tabs       |    actions                     |
|  Today`s order   |  Create a new order for today  |
| Orders by Vendor |  Create a new order by Vendor  |
| Control Accounts |  Create a new account          |
| Employee Payments|  Create a new payment          |


                                         #US3
##################################################################################################################
  Scenario Outline: check "Products" tab functionality from "Configurations" module
    # Given user in the "Lunch" page
    When user  click on "Products" tab
    Then user should be able to see Products page
    And create new product
    And choose all products  by clicking on "Products" checkbox
    And choose specific item by clicking on this item
    And sort items by clicking on "<specTable>" tab
    Examples:
      | specTable   |
      | Product     |
      | Category    |
      | Vendor      |
      | Description |
      | Price       |


                                         #US4
###############################################################################################################


  Scenario: check "Products Categories" tab functionality from "Configurations" module
    # Given user in the "Lunch" page
    When user click on "Products Categories" tab
    Then user should be able to see Products Categories page
    And create new product categories
    And choose all products by clicking on "Categories" checkbox
    And choose specific category by clicking on this item
    And sort categories by clicking on "Category" tab


                                         #US5
###################################################################################################################

  Scenario: check "Alerts" tab functionality from "Configurations" module
    # Given user in the "Lunch" page
    When user clicking on "Alerts" tab
    Then user should be able to see Alerts page
    And create new message
    And choose all messages by clicking on "Message" checkbox
    And choose specific message by clicking on this item
    And sort messages by clicking on "Message" tab

