package fr.esgi.potter.features;

import fr.esgi.potter.ShoppingBasket;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class MyStepdefs {

    ShoppingBasket shoppingBasket = new ShoppingBasket();

    @Given("a shopping basket with books [{int}]")
    public void aShoppingBasketWithBooks(int arg0) {
        int[] books = {
                arg0
        };
        shoppingBasket.setShoppingBasket(books);
    }


    @Given("a shopping basket with books [{int}, {int}]")
    public void aShoppingBasketWithBooks(int arg0, int arg1) {
        int[] books = {
                arg0,
                arg1
        };
        shoppingBasket.setShoppingBasket(books);
    }

    @Given("a shopping basket with books [{int}, {int}, {int}]")
    public void aShoppingBasketWithBooks(int arg0, int arg1, int arg2) {
        int[] books = {
                arg0,
                arg1,
                arg2
        };
        shoppingBasket.setShoppingBasket(books);

    }

    @Given("a shopping basket with books [{int}, {int}, {int}, {int}]")
    public void aShoppingBasketWithBooks(int arg0, int arg1, int arg2, int arg3) {
        int[] books = {
                arg0,
                arg1,
                arg2,
                arg3
        };
        shoppingBasket.setShoppingBasket(books);

    }

    @Given("a shopping basket with [{int}, {int}, {int}, {int}, {int}, {int}, {int}, {int}, {int}]")
    public void aShoppingBasketWith(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int[] books = {
                arg0,
                arg1,
                arg2,
                arg3,
                arg4,
                arg5,
                arg6,
                arg7,
                arg8
        };
        shoppingBasket.setShoppingBasket(books);
    }

    @Given("a shopping basket with books [{int}, {int}, {int}, {int}, {int}]")
    public void aShoppingBasketWithBooks(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] books = {
                arg0,
                arg1,
                arg2,
                arg3,
                arg4
        };
        shoppingBasket.setShoppingBasket(books);
    }

    @When("add to my shopping basket")
    public void addToMyShoppingBasket() {
        //shoppingBasket.setShoppingBasket();
        //todo a voir ce qui est fait ici
    }

    @Then("the book should cost {double}")
    public void theBookShouldCost(double arg0) {
        Assertions.assertThat(shoppingBasket.price()).isEqualTo(arg0);
    }




}
