package br.com.newgo.newfastfood.view;

import br.com.newgo.newfastfood.model.Order;
import br.com.newgo.newfastfood.model.Product;

/**
 * Exibe o resumo do pedido e o valor total.
 */
public class OrderView {

    /**
     * Exibe o pedido.
     *
     * @param order Pedido a ser exibido.
     */
    public void displayOrder(Order order) {
        System.out.println("Seu pedido:");
        for (Product item : order.getItems()) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total: $" + order.calculateTotal());
    }
}
