package br.com.newgo.newfastfood.repository;

import br.com.newgo.newfastfood.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//TODO: Um dos grupos irá implementar a classe ProductRepository
public class ProductRepository {

    //Faz sentido essa variável ser volatile ou não? Por quê? Considere que a aplicação é multithread e como isso impacta o restante do código.
    private volatile List<Product> products = new ArrayList<>();

    /**
     * Add product to the list of products
     * @param product
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Get all products from the list of products
     * @return List<IProduct>
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Get product by id from the list of products using stream API and Optional
     * @param id
     * @return Product
     */
    public Product getProductById(Long id) {
        return null;
    }

    /**
     * Get the most expensive product from the list of products using stream API (max)
     * @return IProduct
     */
    public Product getMostExpensiveProduct() {
        return null;
    }

    /**
     * Get the cheapest product from the list of products using stream API (min)
     * @return IProduct
     */
    public Product getCheapestProduct() {
        return null;
    }

    /**
     * Get the sum of all products prices from the list of products using stream API (sum)
     * @return double
     */
    public double getSumProductsPrices() {
        return 0;
    }

    /**
     * Get product with the price above the average from the list of products using stream API (filter)
     * @return List<Product>
     */
    public List<Product> getProductsAboveAveragePrice() {
        return null;
    }

    /**
     * Summarize all products prices from the list of products using stream API (summaryStatistics)
     * and return the average price using the method from DoubleSummaryStatistics
     *
     * @return double
     */
    public double getAverageProductsPrices() {
        return 0;
    }

    /**
     * Group products by price from the list of products using stream API (groupingBy)
     * @return Map<Double, List<Product>>
     */
    public Map<Double, List<Product>> groupProductsByPrice() {
        return null;
    }

    /**
     * Partition product list by odd ids from the list of products using stream API (partitioningBy)
     * @return Map<Boolean, List<Product>>
     */
    public Map<Boolean, List<Product>> partitionProductsByOddIds() {
        return null;
    }

}
