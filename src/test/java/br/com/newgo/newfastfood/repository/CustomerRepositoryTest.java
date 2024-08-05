package br.com.newgo.newfastfood.repository;

import br.com.newgo.newfastfood.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomerRepositoryTest {

    private final CustomerRepository customerRepository = new CustomerRepository();

    @BeforeEach
    public void setUp() {
        customerRepository.addUser(new Customer(1L, "John Doe", 24,"john@gmail.com", "1199998888"));
        customerRepository.addUser(new Customer(2L, "Jane Doe", 33,"jane@gmail.com", "1187879999"));
        customerRepository.addUser(new Customer(3L, "Alice", 32,"alice@gmail.com", "1178099999"));
        customerRepository.addUser(new Customer(4L, "Bob", 40,"bob@gmail.com", "1166669999"));
        customerRepository.addUser(new Customer(5L, "Charlie", 20,"charlie@gmail.com", "1155559999"));
        customerRepository.addUser(new Customer(6L, "David", 18,"david@gmail.com", "1144449999"));
    }

    @Test
    public void testAddUser() {
        customerRepository.addUser(new Customer(7L, "Eve", 19,"eve@gmail.com", "1133339999"));
        assertEquals(7, customerRepository.getCustomers().size());
    }

    @Test
    public void testGetUsers(){
        assertEquals(6, customerRepository.getCustomers().size());
    }

    @Test
    public void testGetUserById(){
        assertNotNull(customerRepository.getUserById(1L));
        assertEquals("John Doe", customerRepository.getUserById(1L).getName());
    }

    @Test
    public void testGetTotalUsers(){
        assertEquals(6, customerRepository.getTotalUsers());
    }

    @Test
    public void testGetFirstUser(){
        assertNotNull(customerRepository.getFirstUser());
        assertEquals("John Doe", customerRepository.getFirstUser().getName());
    }

    @Test
    public void testGetAllUsersSortedByName(){
        assertNotNull(customerRepository.getUsersSortedByName());
        assertEquals("Alice", customerRepository.getUsersSortedByName().get(0).getName());
    }

    @Test
    public void testGetUsersBetweenAges(){
        assertNotNull(customerRepository.getUsersBetweenAges(20, 30));
        assertEquals(3, customerRepository.getUsersBetweenAges(20, 30).size());
    }

    @Test
    public void testGroupUsersByLastFourPhoneDigits(){
        assertNotNull(customerRepository.groupUsersByLastFourPhoneDigits());
        assertEquals(2, customerRepository.groupUsersByLastFourPhoneDigits().size());
    }

    @Test
    public void testGroupUsersByNameLengthAndSameLength(){
        assertNotNull(customerRepository.groupUsersByNameLengthAndSameLength());
        assertEquals(4, customerRepository.groupUsersByNameLengthAndSameLength().size());
    }
}
