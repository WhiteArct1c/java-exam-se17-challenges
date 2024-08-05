package br.com.newgo;

import static org.junit.jupiter.api.Assertions.*;

import br.com.newgo.newfastfood.controller.OrderController;
import br.com.newgo.newfastfood.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

/**
 * Classe de testes para OrderController.
 */
public class OrderControllerTest {
    private List<Product> menu;
    private OrderController orderController;

    @BeforeEach
    public void setUp() {
        menu = Arrays.asList(
                new Product(1L, "X-Bacon", 5.99),
                new Product(2L, "X-Salada",2.99),
                new Product(3L, "X-Tudo", 1.99),
                new Product(4L, "X-Egg", 9.0)
        );
        orderController = new OrderController(menu);
    }

    @Test
    public void testAddItemToOrder() {
        orderController.addItemToOrder(1L);
        assertEquals(1, orderController.getOrder().getItems().size());
        assertEquals("X-Bacon", orderController.getOrder().getItems().get(0).getName());
    }

    @Test
    public void testAddItemToOrder_ItemNotFound() {
        orderController.addItemToOrder(5L);
        assertEquals(0, orderController.getOrder().getItems().size());
    }

    @Test
    public void testCalculateTotal() {
        // TODO: Deve falhar enquanto o método não for implementado
        orderController.addItemToOrder(1L);
        orderController.addItemToOrder(2L);
        assertEquals(8.98, orderController.getOrder().calculateTotal(), 0.01);
    }

    @Test
    public void testDisplayMenu() {
        // Teste básico para verificar se o menu é exibido corretamente
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        orderController.displayMenu();

        String expectedOutput = "Menu:" + System.lineSeparator() +
                "1 - X-Bacon: $5.99" + System.lineSeparator() +
                "2 - X-Salada: $2.99" + System.lineSeparator() +
                "3 - X-Tudo: $1.99" + System.lineSeparator() +
                "4 - X-Egg: $9.0" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out);

    }

    @Test
    public void testDisplayOrder() {
        // Teste básico para verificar se o pedido é exibido corretamente
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        orderController.addItemToOrder(4L);
        orderController.displayOrder();

        String expectedOutput = "Seu pedido:" + System.lineSeparator() +
                "X-Egg: $9.0" + System.lineSeparator() +
                "Total: $0.0" + System.lineSeparator() ;
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out);
    }
}
