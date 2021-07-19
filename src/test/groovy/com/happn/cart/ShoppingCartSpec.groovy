package com.happn.cart

import spock.lang.Specification
import spock.lang.Subject

class ShoppingCartSpec extends Specification {

    @Subject
    private ShoppingCartFacade shoppingCartFacade = new ShoppingCartFacade()

    def "a product can be added to a shopping cart"() {
        given: "a shopping cart"
        and: "a product with a price"
        when: "the product is placed in the shopping cart"
        then: "number of products in shopping cart has increased"
        and: "total price of products has been changed"
    }

    def "a product inside the shopping cart can be removed"() {
        given: "a shopping cart"
        and: "a product inside shopping cart"
        when: "the product is removed from the shopping cart"
        then: "number of products in shopping cart has decreased"
        and: "total price of products has been changed"
    }

    def "a product which is not inside the shopping cart cannot be removed"() {
        given: "a shopping cart"
        and: "a product which is missing inside the shopping cart"
        when: "the product is going to be removed from the shopping cart"
        then: "an error occurs"
//            thrown(ProductIsNotInTheShoppingCartError)
    }

    def "shopping cart is cashed with correct amount of money and cleared"() {
        given: "a shopping cart"
        when: "the shopping cart is cashed with correct amount of money"
        then: "the shopping cart is cleared"
        and: "total price of products is zero"
    }
}
