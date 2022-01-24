Feature: Price of two potter's collections

  Scenario: 2 collections with 5 and 4 books
    Given a shopping basket with 2 collections
    When add a collection with 5 different books
    And add another collection with 4 different books
    Then the shopping basket should be at 55.6

  Scenario: 2 collections with 5 and 3 books
    Given a shopping basket with 2 collections
    When add a collection with 5 different books
    And add a collection with 3 different books
    Then the shopping basket should be at 51.6

  Scenario: 2 collections with 5 and 2 books
    Given a shopping basket with 2 collections
    When add a collection with 5 different books
    And add a collection with 2 different books
    Then the shopping basket should be at 45.2

  Scenario: 2 collections with 5 and 1 book
    Given a shopping basket with 2 collections
    When add a collection with 5 different books
    And add a collection with 1 different books
    Then the shopping basket should be at 38