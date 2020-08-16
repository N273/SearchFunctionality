

Feature: Search Functionality

  AS a customer
  I want to
  search a product
  so i can do shopping
  Scenario Outline: Customer is able to search a product
    Given Customer is on homepage
    When Customer search a "<product>"
    And  Customer clicks on a search button
    Then Customer can see all the product

    Examples:
    |Product|

    |bikes  |
    |push chair|