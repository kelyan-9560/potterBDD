package fr.esgi.potter.features;


import fr.esgi.potter.CollectionsFusion;
import fr.esgi.potter.ShoppingBasket;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoCollections {

    ShoppingBasket shoppingBasket = new ShoppingBasket();

    @Given("a shopping basket with {int} collections")
    public void aShoppingBasketWithCollections(int arg0) {
    }


    @When("add a collection with {int} different books")
    public void addACollectionWithDifferentBooks(int numberOfDifferentBooks) {
        int[] collection1 = new int[numberOfDifferentBooks];

        for (int i = 0; i < numberOfDifferentBooks; i++) {
            collection1[i] = i + 1;
        }

        shoppingBasket.setShoppingBasket(collection1);
    }

    @And("add another collection with {int} different books")
    public void addAnotherCollectionWithDifferentBooks(int numberOfDifferentBooks) {
        int[] collection2 = new int[numberOfDifferentBooks];

        for (int i = 0; i < numberOfDifferentBooks; i++) {
            collection2[i] = i + 1;
        }

        int[] collection1 = shoppingBasket.getShoppingBasket();

        int[] fusionCollections = new CollectionsFusion().fusion(collection1, collection2);

        shoppingBasket.setShoppingBasket(fusionCollections);
    }


    @Then("the shopping basket should be at {double}")
    public void theShoppingBasketShouldBeAt(double price) {
        assertEquals(shoppingBasket.price(),price);
    }



}
