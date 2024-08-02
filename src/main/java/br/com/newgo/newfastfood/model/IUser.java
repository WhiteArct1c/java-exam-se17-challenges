package br.com.newgo.newfastfood.model;

public interface IUser {
    Long getId();
    String getName();
    String getEmail();
    String getPhone();
    void setId(Long id);
    void setName(String name);
    void setEmail(String email);
    void setPhone(String phone);
}
