package fr.esgi.potter.features;

import fr.esgi.potter.ShoppingBasket;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class MyStepdefs {

    ShoppingBasket shoppingBasket = new ShoppingBasket();


    @Given("a shopping basket with books [{int}]")
    public void aShoppingBasketWithBooks(int arg0) {
        List<Integer> books = new ArrayList<>(arg0);
    }


    @Given("a shopping basket with books [{int}, {int}]")
    public void aShoppingBasketWithBooks(int arg0, int arg1) {
        List<Integer> books = new ArrayList<>();
        books.add(arg0);
        books.add(arg1);

    }

    @Given("a shopping basket with books [{int}, {int}, {int}]")
    public void aShoppingBasketWithBooks(int arg0, int arg1, int arg2) {
        List<Integer> books = new ArrayList<>();
        books.add(arg0);
        books.add(arg1);
        books.add(arg2);

    }

    @Given("a shopping basket with books [{int}, {int}, {int}, {int}]")
    public void aShoppingBasketWithBooks(int arg0, int arg1, int arg2, int arg3) {
        List<Integer> books = new ArrayList<>();
        books.add(arg0);
        books.add(arg1);
        books.add(arg2);
        books.add(arg3);
    }

    @Given("a shopping basket with [{int}, {int}, {int}, {int}, {int}, {int}, {int}, {int}, {int}]")
    public void aShoppingBasketWith(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        List<Integer> books = new ArrayList<>();
        books.add(arg0);
        books.add(arg1);
        books.add(arg2);
        books.add(arg3);
        books.add(arg4);
    }

    @When("add to my shopping basket")
    public void addToMyShoppingBasket() {
        shoppingBasket.setShoppingBasket();
    }

    @Then("the book should cost {double}")
    public void theBookShouldCost(int arg0, int arg1) {
        
    }

    @Given("a shopping basket with books [{int}, {int}, {int}, {int}, {int}]")
    public void aShoppingBasketWithBooks(int arg0, int arg1, int arg2, int arg3, int arg4) {

    }


}
