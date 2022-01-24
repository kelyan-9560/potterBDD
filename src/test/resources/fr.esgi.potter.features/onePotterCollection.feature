Feature: Price of a shopping basket

  Scenario: 1 collection with 1 book
    Given 1 different books
    When add the 1 different books to my shopping basket
    Then the shopping basket should cost 8.0

  Scenario: 1 collection with 2 books
    Given 2 different books
    When add the 2 different books to my shopping basket
    Then the shopping basket should cost 15.2

  Scenario: 1 collection with 3 books
    Given 3 different books
    When add the 3 different books to my shopping basket
    Then the shopping basket should cost 21.6

  Scenario: 1 collection with four books
    Given 4 different books
    When add the 4 different books to my shopping basket
    Then the shopping basket should cost 25.6

  Scenario: 1 collection with 5 books
    Given 5 different books
    When add the 5 different books to my shopping basket
    Then the shopping basket should cost 30






