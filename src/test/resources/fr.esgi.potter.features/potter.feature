Feature: Price
        In order to buy Potter books
        As customer
        I want to know the price the price of my basket

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



  Scenario: 1 collection whith 1 book
    Given 1 book
    When add to my shooping basket
    Then the book should cost 8

  Scenario: 1 collection whith 2 books
    Given 2 different books
    When add to my shooping basket
    Then the books should cost 15.2

  Scenario: 1 collection whith 3 books
    Given 3 different books
    When add to my shooping basket
    Then the books should cost 21.6

  Scenario: 1 collection whith four books
    Given 4 different books
    When add to my shooping basket
    Then the books should cost 25.6

  Scenario: 1 collection whith 5 books
    Given 5 different books
    When add to my shooping basket
    Then the books should cost 30

  Scenario: 2 collections whith 5 and four books
    Given a shooping basket with 2 collections
    When add a collection whith 5 different books
    And add a collection with four different books
    Then the shooping basket should be at 65.6

  Scenario: 2 collections whith 5 and 3 books
    Given a shooping basket with 2 collections
    When add a collection whith 5 different books
    And add a collection with 3 different books
    Then the shooping basket should be at 51.6

  Scenario: 2 collections whith 5 and 2 books
    Given a shooping basket with 2 collections
    When add a collection whith 5 different books
    And add a collection with 2 different books
    Then the shooping basket should be at 45.2

  Scenario: 2 collections whith 5 and 1 book
    Given a shooping basket with 2 collections
    When add a collection whith 5 different books
    And add a collection with 1 books
    Then the shooping basket should be at 38