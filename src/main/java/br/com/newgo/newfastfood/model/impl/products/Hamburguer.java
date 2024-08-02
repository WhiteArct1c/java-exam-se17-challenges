package br.com.newgo.newfastfood.model.impl.products;

import br.com.newgo.newfastfood.model.IProduct;

public class Hamburguer implements IProduct{
    private Long id;
    private String name;
    private double price;

    public Hamburguer(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
