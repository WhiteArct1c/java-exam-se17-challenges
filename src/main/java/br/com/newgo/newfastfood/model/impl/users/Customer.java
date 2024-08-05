package br.com.newgo.newfastfood.model.impl.users;

import br.com.newgo.newfastfood.model.IUser;

public class Customer implements IUser{
    private Long id;
    private String name;
    private String email;
    private String phone;

    public Customer(Long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
