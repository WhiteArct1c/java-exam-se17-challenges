package br.com.newgo.newfastfood.repository;

import br.com.newgo.newfastfood.model.impl.users.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRepositoryTest {

    private final UserRepository userRepository = new UserRepository();

    @BeforeEach
    public void setUp() {
        userRepository.addUser(new Customer(1L, "John Doe", "john@gmail.com", "1199998888"));
        userRepository.addUser(new Customer(2L, "Jane Doe", "jane@gmail.com", "1187879999"));
        userRepository.addUser(new Customer(3L, "Alice", "alice@gmail.com", "1178099999"));
        userRepository.addUser(new Customer(4L, "Bob", "bob@gmail.com", "1166669999"));
        userRepository.addUser(new Customer(5L, "Charlie", "charlie@gmail.com", "1155559999"));
        userRepository.addUser(new Customer(6L, "David", "david@gmail.com", "1144449999"));
    }

    @Test
    public void testAddUser() {
        userRepository.addUser(new Customer(7L, "Eve", "eve@gmail.com", "1133339999"));
        assertEquals(7, userRepository.getUsers().size());
    }

    @Test
    public void testGetUsers(){
        assertEquals(6, userRepository.getUsers().size());
    }

    @Test
    public void testGetUserById(){
        assertEquals("John Doe", userRepository.getUserById(1L).getName());
    }

    @Test
    public void testGetTotalUsers(){
        assertEquals(6, userRepository.getTotalUsers());
    }

    @Test
    public void testGetFirstUser(){
        assertEquals("John Doe", userRepository.getFirstUser().getName());
    }

    @Test
    public void testGetAllUsersSortedByName(){
        assertEquals("Alice", userRepository.getUsersSortedByName().get(0).getName());
    }

    @Test
    public void testGroupUsersByLastFourPhoneDigits(){
        assertEquals(2, userRepository.groupUsersByLastFourPhoneDigits().size());
    }

    @Test
    public void testGroupUsersByNameLengthAndSameLength(){
        assertEquals(4, userRepository.groupUsersByNameLengthAndSameLength().size());
    }
}
