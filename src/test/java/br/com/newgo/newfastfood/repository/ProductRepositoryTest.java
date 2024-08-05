package br.com.newgo.newfastfood.repository;

import br.com.newgo.newfastfood.model.impl.products.Hamburguer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductRepositoryTest {

    private final ProductRepository productRepository = new ProductRepository();

    @BeforeEach
    public void setUp() {
        productRepository.addProduct(new Hamburguer(1L, "X-Bacon", 15.0));
        productRepository.addProduct(new Hamburguer(2L, "X-Salada", 10.0));
        productRepository.addProduct(new Hamburguer(3L, "X-Tudo", 20.0));
        productRepository.addProduct(new Hamburguer(4L, "X-Egg", 12.0));
        productRepository.addProduct(new Hamburguer(5L, "X-Burger", 8.0));
        productRepository.addProduct(new Hamburguer(6L, "X-Frango", 10.0));
        productRepository.addProduct(new Hamburguer(7L, "X-Vegan", 15.0));
    }

    @Test
    public void testAddProduct() {
        productRepository.addProduct(new Hamburguer(7L, "X-Vegan", 18.0));
        assertEquals(8, productRepository.getProducts().size());
    }

    @Test
    public void testGetProducts(){
        assertEquals(7, productRepository.getProducts().size());
    }

    @Test
    public void testGetProductById(){
        assertEquals("X-Bacon", productRepository.getProductById(1L).getName());
    }

    @Test
    public void testGetMostExpensiveProduct(){
        assertEquals("X-Tudo", productRepository.getMostExpensiveProduct().getName());
    }

    @Test
    public void testGetCheapestProduct(){
        assertEquals("X-Burger", productRepository.getCheapestProduct().getName());
    }

    @Test
    public void testGetSumProductsPrices(){
        assertEquals(75.0, productRepository.getSumProductsPrices());
    }

    @Test
    public void testGetAverageProductsPrices(){
        assertEquals(12.5, productRepository.getAverageProductsPrices());
    }

    @Test
    public void testGroupProductsByPrice(){
        assertEquals(5, productRepository.groupProductsByPrice().size());
    }

    @Test
    public void testPartitionProductsByOddIds(){
        assertEquals(4, productRepository.partitionProductsByOddIds().get(true).size());
    }
}
