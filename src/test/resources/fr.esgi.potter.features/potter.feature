Feature: Price of a shopping basket

  Scenario: 1 book cost 8
    Given 1 book
    When add volume 1 of book to my shopping basket
    Then price should be 8

  Scenario: 1 book cost 8
    Given 1 book
    When add volume 2 of book to my shopping basket
    Then price should be 8

  Scenario: 1 book cost 8
    Given 1 book
    When add volume 3 of book to my shopping basket
    Then price should be 8

  Scenario: 1 book cost 8
    Given 1 book
    When add volume 4 of book to my shopping basket
    Then price should be 8

  Scenario: 1 book cost 8
    Given 1 book
    When add volume 5 of book to my shopping basket
    Then price should be 8




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
    When add the 4 different books to my shopping basket
    Then the shopping basket should cost 30

  Scenario: 2 collections with 5 and four books
    Given a shopping basket with 2 collections
    When add a collection with 5 different books
    And add a collection with four different books
    Then the shopping basket should be at 65.6

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
    And add a collection with 1 books
    Then the shopping basket should be at 38