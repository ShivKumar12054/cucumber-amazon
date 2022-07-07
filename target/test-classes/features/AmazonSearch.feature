Feature: Amazon Search
  Scenario: Search a product
    Given I have a search field on amazom page
    When I search for a product with name "Apple Macbook pro" and price "1000"
    Then Product with name "Apple macbook pro" should be displayed
    Then order id with 12121