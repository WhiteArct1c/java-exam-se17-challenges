package br.com.newgo.newfastfood.view;

import br.com.newgo.newfastfood.model.impl.users.Customer;
import br.com.newgo.newfastfood.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(new Customer(1L, "John Doe", "john@gmail.com", "123456789"));
    }
}
