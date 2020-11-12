Feature: : check Lunch functionality with valid expenses manager credential
  Background:
    Given user in the "Lunch" page



@pasha
  Scenario: check 'My Lunch' module functionality
    #Given user in the "Lunch" page
    When user click on "New Order" tab
    Then user should be able to order a new item
    And check ordered item by clicking on "Previous Orders" tab
    And check expenses by clicking on "Your Lunch Account" tab

###############################################################################################################
@pasha
Scenario Outline: check "Manager" module functionality
     # Given user in the "Lunch" page
      When user click on "<tabs>" tab
      Then user should be able to see "<expect result> information"
      Examples:
|tabs              | expect result                 |
|  Today`s order   |     Orders by Vendor          |
| Orders by Vendor |     Control Vendors           |
| Control Accounts |     Control Accounts          |
| Employee Payments|    Register Cash Moves        |

##################################################################################################################
@pasha
  Scenario Outline: check "Products" tab functionality from "Configurations" module
    # Given user in the "Lunch" page
    When user click on "Products" tab
    Then user should be able to see Products page
    And create new product
    And choose all products by clicking on "Products" checkbox
    And choose specific item by clicking on this item
    And sort items by clicking on "<specTable>" tab
    Examples:
      | specTable   |
      | Product     |
      | Category    |
      | Vendor      |
      | Description |
      | Price       |
###############################################################################################################


  @pasha
  Scenario: check "Products Categories" tab functionality from "Configurations" module
    # Given user in the "Lunch" page
    When user click on "Products Categories" tab
    Then user should be able to see Products Categories page
    And create new product
    And choose all products by clicking on "Categories" checkbox
    And choose specific category by clicking on this item
    And sort categories by clicking on "Category" tab
###################################################################################################################
  @pasha
  Scenario: check "Alerts" tab functionality from "Configurations" module
    # Given user in the "Lunch" page
    When user click on "Alerts" tab
    Then user should be able to see Alerts page
    And create new message
    And choose all messages by clicking on "Message" checkbox
    And choose specific message by clicking on this item
    And sort messages by clicking on "Message" tab
##################################################################################################################