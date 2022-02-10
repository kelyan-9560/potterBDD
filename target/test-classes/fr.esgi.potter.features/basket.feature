Feature: Price of a shopping basket

  Scenario: one book
    Given a shopping basket with books [1]
    When add to my shopping basket
    Then the book should cost 8

  Scenario: two books
    Given a shopping basket with books [1, 2]
    When add to my shopping basket
    Then the book should cost

  Scenario: three books
    Given a shopping basket with books [1, 2, 3]
    When add to my shopping basket
    Then the books should cost 21.6

  Scenario: four books
    Given a shopping basket with books [1, 2, 3, 4]
    When add to my shopping basket
    Then the books should cost 25.6

  Scenario: five books
    Given a shopping basket with books [1, 2, 3, 4, 5]
    When add to my shopping basket
    Then the books should cost 30

  Scenario:
    Given a shopping basket with [1, 2, 3, 4, 5, 1, 2, 3, 4]
    When add a collection with five different books
    When add a collection with four different books
    Then the shopping basket should be at 65.6
