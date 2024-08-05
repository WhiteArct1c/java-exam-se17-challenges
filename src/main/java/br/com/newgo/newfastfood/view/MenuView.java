package br.com.newgo.newfastfood.view;

import br.com.newgo.newfastfood.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Exibe o menu para o usuário.
 */
public class MenuView {

    List<Product> itensMenu = new ArrayList<>();

    /**
     * Construtor para criar uma nova instância de MenuView.
     *
     * @param itensMenu Lista de itens do menu.
     */
    public MenuView(List<Product> itensMenu) {
        this.itensMenu = itensMenu;
    }

    /**
     * Exibe o menu.
     *
     * @param menu Lista de itens do menu.
     */
    public void displayMenu(List<Product> menu) {
        System.out.println("Menu:");
        for (Product item : this.itensMenu) {
            System.out.println( item.getId() + " - "+ item.getName() + ": $" + item.getPrice());
        }
    }
}
