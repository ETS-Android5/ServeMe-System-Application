package com.example.myapplication;

public class Customer {

    public String name, email, number, address, password, type;

    public Customer()
    {

    }

    public Customer(String name, String email, String number, String address, String password, String type)
    {
        this.name = name;
        this.email = email;
        this.number = number;
        this.address = address;
        this.password = password;
        this.type = type;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
