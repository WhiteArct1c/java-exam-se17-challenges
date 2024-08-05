package br.com.newgo.newfastfood.model.impl.order;

import br.com.newgo.newfastfood.model.impl.products.Hamburguer;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um pedido realizado pelo cliente.
 */
public class Order {
    //criar documentação JavaDoc


    private List<Hamburguer> items;

    /**
     * Construtor para criar um pedido vazio.
     */
    public Order() {
        this.items = new ArrayList<>();
    }

    /**
     * Adiciona um item ao pedido.
     *
     * @param item Item a ser adicionado.
     */
    public void addItem(Hamburguer item) {
        items.add(item);
    }

    /**
     * Calcula o valor total do pedido usando Streams.
     *
     * @return Valor total do pedido.
     */
    public double calculateTotal() {
        // TODO: CRIAR Implementação do método para calcular o valor total do pedido usando Streams
        return 0;
    }

    /**
     * Obtém a lista de itens do pedido.
     *
     * @return Lista de itens do pedido.
     */
    public List<Hamburguer> getItems() {
        return items;
    }
}
