package com.happn.cart;

import org.junit.jupiter.api.Test;

class ShoppingCartTest {

    private ShoppingCartFacade shoppingCartFacade = new ShoppingCartFacade();

    @Test
    void aProductCanBeAddedToAShoppingCart() {
        // given

        // when

        // then "number of products in shopping cart has increased"

        // and "total price of products has been changed"

    }

    @Test
    void aProductInsideTheShoppingCartCanBeRemoved() {
        // given

        // when

        // then "number of products in shopping cart has decreased"

        // and "total price of products has been changed"

    }

    @Test
    void aProductWhichIsNotInsideTheShoppingCartCannotBeRemoved() {
        // given

        // when

        // then
        // throw exception
    }

    @Test
    void shoppingCartIsCashedWithCorrectAmountOfMoneyAndCleared() {
        // given

        // when

        // then "the shopping cart is cleared"

        // and "total price of products is zero"

    }
}
