package br.com.newgo.newfastfood.repository;

import br.com.newgo.newfastfood.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductRepositoryTest {

    private final ProductRepository productRepository = new ProductRepository();

    @BeforeEach
    public void setUp() {
        productRepository.addProduct(new Product(1L, "X-Bacon", 15.0));
        productRepository.addProduct(new Product(2L, "X-Salada", 10.0));
        productRepository.addProduct(new Product(3L, "X-Tudo", 20.0));
        productRepository.addProduct(new Product(4L, "X-Egg", 12.0));
        productRepository.addProduct(new Product(5L, "X-Burger", 8.0));
        productRepository.addProduct(new Product(6L, "X-Frango", 10.0));
        productRepository.addProduct(new Product(7L, "X-Vegan", 15.0));
    }

    @Test
    public void testAddProduct() {
        productRepository.addProduct(new Product(7L, "X-Vegan", 18.0));
        assertEquals(8, productRepository.getProducts().size());
    }

    @Test
    public void testGetProducts(){
        assertEquals(7, productRepository.getProducts().size());
    }

    @Test
    public void testGetProductById(){
        assertNotNull(productRepository.getProductById(1L));
        assertEquals("X-Bacon", productRepository.getProductById(1L).getName());
    }

    @Test
    public void testGetMostExpensiveProduct(){
        assertNotNull(productRepository.getMostExpensiveProduct());
        assertEquals("X-Tudo", productRepository.getMostExpensiveProduct().getName());
    }

    @Test
    public void testGetCheapestProduct(){
        assertNotNull(productRepository.getCheapestProduct());
        assertEquals("X-Burger", productRepository.getCheapestProduct().getName());
    }

    @Test
    public void testGetSumProductsPrices(){
        assertEquals(90.0, productRepository.getSumProductsPrices());
    }

    @Test
    public void testGetProductsAboveAveragePrice(){
        assertNotNull(productRepository.getProductsAboveAveragePrice());
        assertEquals(3, productRepository.getProductsAboveAveragePrice().size());
    }

    @Test
    public void testGetAverageProductsPrices(){
        assertEquals(13, productRepository.getAverageProductsPrices());
    }

    @Test
    public void testGroupProductsByPrice(){
        assertNotNull(productRepository.groupProductsByPrice());
        assertEquals(5, productRepository.groupProductsByPrice().size());
    }

    @Test
    public void testPartitionProductsByOddIds(){
        assertNotNull(productRepository.partitionProductsByOddIds());
        assertEquals(4, productRepository.partitionProductsByOddIds().get(true).size());
    }
}
