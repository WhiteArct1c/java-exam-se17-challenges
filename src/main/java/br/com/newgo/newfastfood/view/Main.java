package br.com.newgo.newfastfood.view;

import br.com.newgo.newfastfood.controller.OrderController;
import br.com.newgo.newfastfood.model.Product;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1L, "X-Bacon", 10.0);
        Product product2 = new Product(2L, "X-Salada", 8.0);
        Product product3 = new Product(3L, "X-Tudo", 15.0);
        Product product4 = new Product(4L, "X-Egg", 9.0);
        Product product5 = new Product(5L, "X-Frango", 10.0);
        Product product6 = new Product(6L, "X-Vegano", 12.0);
        Product product7 = new Product(7L, "X-Burger", 7.0);

        List<Product> products = List.of(product1, product2, product3, product4, product5, product6, product7);

//        MenuView menuView = new MenuView();
//        menuView.displayMenu(hamburguers);



        OrderController orderController = new OrderController(products);

        orderController.startOrder();

//        orderController.addItemToOrder("X-Bacon");
//        orderController.addItemToOrder("X-Salada");
//        orderController.addItemToOrder("X-Tudo");
//        orderController.addItemToOrder("X-Egg");
//        orderController.addItemToOrder("X-Frango");
//        orderController.addItemToOrder("X-Vegano");
//        orderController.addItemToOrder("X-Burger");

    }
}
