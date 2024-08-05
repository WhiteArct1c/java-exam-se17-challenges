package br.com.newgo.newfastfood.repository;

import br.com.newgo.newfastfood.model.IProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//TODO: Um dos grupos irá implementar a classe ProductRepository
public class ProductRepository {

    //Faz sentido essa variável ser volatile ou não? Por quê? Considere que a aplicação é multithread e como isso impacta o restante do código.
    private volatile List<IProduct> products = new ArrayList<>();

    /**
     * Add product to the list of products
     * @param product
     */
    public void addProduct(IProduct product) {
        products.add(product);
    }

    /**
     * Get all products from the list of products
     * @return List<IProduct>
     */
    public List<IProduct> getProducts() {
        return products;
    }

    /**
     * Get product by id from the list of products using stream API and Optional
     * @param id
     * @return IProduct
     */
    public IProduct getProductById(Long id) {
        return null;
    }

    /**
     * Get the most expensive product from the list of products using stream API (max)
     * @return IProduct
     */
    public IProduct getMostExpensiveProduct() {
        return null;
    }

    /**
     * Get the cheapest product from the list of products using stream API (min)
     * @return IProduct
     */
    public IProduct getCheapestProduct() {
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
     * @return Map<Double, List<IProduct>>
     */
    public Map<Double, List<IProduct>> groupProductsByPrice() {
        return null;
    }

    /**
     * Partition product list by odd ids from the list of products using stream API (partitioningBy)
     * @return Map<Boolean, List<IProduct>>
     */
    public Map<Boolean, List<IProduct>> partitionProductsByOddIds() {
        return null;
    }

}
