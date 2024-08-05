package br.com.newgo.newfastfood.repository;

import br.com.newgo.newfastfood.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//TODO: Um dos grupos irá implementar a classe CustomerRepository
public class CustomerRepository {

    //Faz sentido essa variável ser transient ou não? Por quê?
    private transient List<Customer> customers = new ArrayList<>();

    /**
     * Add user to the list of users
     * @param customer
     */
    public void addUser(Customer customer) {
        customers.add(customer);
    }

    /**
     * Get all users from the list of users
     * @return List<IUser>
     */
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * Get user by id from the list of users using stream API and Optional
     * @param id
     * @return Customer
     */
    public Customer getUserById(Long id) {
        return null;
    }

    /**
     * Get the total number of users from the list of users using stream API (count)
     * @return long
     */
    public long getTotalUsers() {
        return 0;
    }

    /**
     * Get the first user from the list of users using stream API (findFirst) and Optional
     * Case the list is empty, throw a new RuntimeException with the message "No users found" using the same stream pipeline
     * @return Customer
     */
    public Customer getFirstUser() {
        return null;
    }

    /**
     * Get all users sorted by name from the list of users using stream API (sorted)
     * @return List<Customer>
     */
    public List<Customer> getUsersSortedByName() {
        return null;
    }

    /**
     * Group user by the 4 last digits of the phone number from the list of users using stream API (groupingBy)
     * @return Map<String, List<Customer>>
     */
    public Map<String, List<Customer>> groupUsersByLastFourPhoneDigits() {
        return null;
    }

    /**
     * Group users by the length of the name from the list of users and use a downstream collector
     * to count the number of users with the same length of the name using stream API (groupingBy)
     *
     * @return Map<Integer, Long>
     */
    public Map<Integer, Long> groupUsersByNameLengthAndSameLength() {
        return null;
    }

}
