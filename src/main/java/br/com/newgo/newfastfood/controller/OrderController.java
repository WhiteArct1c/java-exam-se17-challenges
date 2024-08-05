package br.com.newgo.newfastfood.controller;

import br.com.newgo.newfastfood.model.Order;
import br.com.newgo.newfastfood.model.Product;
import br.com.newgo.newfastfood.view.MenuView;
import br.com.newgo.newfastfood.view.OrderView;

import java.util.List;
import java.util.Scanner;

/**
 * Controlador que gerencia a lógica do pedido.
 */
public class OrderController {
    private Order order;
    private MenuView menuView;
    private OrderView orderView;
    private List<Product> menu;

    /**
     * Construtor para criar um controlador de pedido.
     *
     * @param menu Lista de itens do menu.
     */
    public OrderController(List<Product> menu) {
        this.order = new Order();
        this.menuView = new MenuView(menu);
        this.orderView = new OrderView();
        this.menu = menu;
    }

    /**
     * Exibe o menu.
     */
    public void displayMenu() {
        menuView.displayMenu(menu);
    }

    /**
     * Adiciona um item ao pedido com base no nome do item.
     *
     * @param idItem Nome do item a ser adicionado.
     */
    public void addItemToOrder(Long idItem) {
        for (Product item : menu) {
            if (item.getId() == idItem) {
                order.addItem(item);
                return;
            }
        }
        System.out.println("Item não encontrado.");
    }

    /**
     * Exibe o pedido.
     */
    public void displayOrder() {
        orderView.displayOrder(order);
    }

    /**
     * Inicia o pedido e interage com o usuário para adicionar itens.
     */
    public void startOrder() {
        Scanner scanner = new Scanner(System.in);
        String input;
        displayMenu();
        while (true) {

            System.out.println("Digite o id (Numero) item para adicionar ao pedido ou 'finalizar' para encerrar:");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("finalizar")) {
                break;
            }

            addItemToOrder(Long.getLong(input));
        }

        displayOrder();
    }

    /**
     * Obtém o pedido atual.
     *
     * @return O pedido atual.
     */
    public Order getOrder() {
        return order;
    }
}
