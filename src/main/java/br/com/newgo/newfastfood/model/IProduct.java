package br.com.newgo.newfastfood.model;

public interface IProduct {
    Long getId();
    String getName();
    double getPrice();
    void setId(Long id);
    void setName(String name);
    void setPrice(double price);

}
