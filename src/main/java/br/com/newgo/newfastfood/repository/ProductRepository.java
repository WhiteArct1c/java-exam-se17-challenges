package br.com.newgo.newfastfood.repository;

import br.com.newgo.newfastfood.model.IProduct;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;

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
     * Get the sum of all products prices from the list of products using stream API (reduce)
     * @return double
     */
    public double getSumProductsPrices() {
        return 0;
    }

    /**
     * Summarize all products prices from the list of products using stream API (summaryStatistics)
     * @return DoubleSummaryStatistics
     */
    public DoubleSummaryStatistics summarizeProductsPrices() {
        return null;
    }

    /**
     * Group products by price range from the list of products using stream API (groupingBy)
     * @return Map<String, List<IProduct>>
     */
    public Map<String, List<IProduct>> groupProductsByPriceRange() {
        return null;
    }

    /**
     * Partition product list by odd and even id from the list of products using stream API (partitioningBy)
     * @return Map<Boolean, List<IProduct>>
     */
    public Map<Boolean, List<IProduct>> partitionProductsByOddAndEvenId() {
        return null;
    }

}
