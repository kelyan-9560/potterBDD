package fr.esgi.potter.features;

import fr.esgi.potter.ShoppingBasket;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OneCollection {

    ShoppingBasket shoppingBasket = new ShoppingBasket();

    @Given("{int} different books")
    public int[] differentBook(int numberOfDifferentBooks) {
        //tableau avec le nombre de livres uniques
        int[] books = new int[numberOfDifferentBooks];

        for (int i = 0; i < numberOfDifferentBooks; i++) {
            books[i] = i + 1;
        }
        return books;

    }

    @When("add the {int} different books to my shopping basket")
    public void addTheDifferentBooksToMyShoppingBasket(int numberOfDifferentBooks) {
        int[] books = new int[numberOfDifferentBooks];

        for (int i = 0; i < numberOfDifferentBooks; i++) {
            books[i] = i + 1;
        }
        shoppingBasket.setShoppingBasket(books);
    }

    @Then("the shopping basket should cost {double}")
    public void theShoppingBasketShouldCost(double price) {
        assertEquals(shoppingBasket.price(), price);
    }

}
