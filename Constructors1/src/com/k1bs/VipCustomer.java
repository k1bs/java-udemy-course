package com.k1bs;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer() {
        this("Default Name", "Default Limit", "Default Email");
    }

    public VipCustomer(String name, String email) {
        this(name, "Default Limit", email);
    }

    public VipCustomer(String name, String creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
