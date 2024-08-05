package br.com.newgo.newfastfood.view;

import br.com.newgo.newfastfood.controller.OrderController;
import br.com.newgo.newfastfood.model.impl.products.Hamburguer;
import br.com.newgo.newfastfood.model.impl.users.Customer;
import br.com.newgo.newfastfood.repository.UserRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Hamburguer hamburguer1 = new Hamburguer(1L, "X-Bacon", 10.0);
        Hamburguer hamburguer2 = new Hamburguer(2L, "X-Salada", 8.0);
        Hamburguer hamburguer3 = new Hamburguer(3L, "X-Tudo", 15.0);
        Hamburguer hamburguer4 = new Hamburguer(4L, "X-Egg", 9.0);
        Hamburguer hamburguer5 = new Hamburguer(5L, "X-Frango", 10.0);
        Hamburguer hamburguer6 = new Hamburguer(6L, "X-Vegano", 12.0);
        Hamburguer hamburguer7 = new Hamburguer(7L, "X-Burger", 7.0);

        List<Hamburguer> hamburguers = List.of(hamburguer1, hamburguer2, hamburguer3, hamburguer4, hamburguer5, hamburguer6, hamburguer7);

//        MenuView menuView = new MenuView();
//        menuView.displayMenu(hamburguers);



        OrderController orderController = new OrderController(hamburguers);

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
