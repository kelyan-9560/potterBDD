Feature: Price
        In order to buy Potter books
        As customer
        I want to know the price the price of my basket

  Scenario: 1 book cost 8
    Given a book
    When add volume 1 of book to my shopping basket
    Then price should be 8

  Scenario: 1 book cost 8
    Given a book
    When add volume 2 of book to my shopping basket
    Then price should be 8

  Scenario: 1 book cost 8
    Given a book
    When add volume 3 of book to my shopping basket
    Then price should be 8

  Scenario: 1 book cost 8
    Given a book
    When add volume 4 of book to my shopping basket
    Then price should be 8

  Scenario: 1 book cost 8
    Given a book
    When add volume 5 of book to my shopping basket
    Then price should be 8



  Scenario: one collection whith one book
    Given a book
    When add to my shooping basket
    Then the book should cost 8

  Scenario: one collection whith two books
  Given two different books
  When add to my shooping basket
  THEN the books should cost 15.2

  Scenario: one collection whith three books
  Given three different books
  When add to my shooping basket
  THEN the books should cost 21.6

  Scenario: one collection whith four books
  Given four different books
  When add to my shooping basket
  THEN the books should cost 25.6

  Scenario: one collection whith five books
  Given five different books
  When add to my shooping basket
  THEN the books should cost 30

  Scenario: two collections whith five and four books
  Given a shooping basket with two collections
  When add a collection whith five different books
  When add a collection with four different books
  THEN the shooping basket should be at 65.6

  Scenario: two collections whith five and three books
  Given a shooping basket with two collections
  When add a collection whith five different books
  When add a collection with three different books
  THEN the shooping basket should be at 51.6

  Scenario: two collections whith five and two books
  Given a shooping basket with two collections
  When add a collection whith five different books
  When add a collection with two different books
  THEN the shooping basket should be at 45.2

  Scenario: two collections whith five and one book
  Given a shooping basket with two collections
  When add a collection whith five different books
  AND add a collection with one books
  THEN the shooping basket should be at 38