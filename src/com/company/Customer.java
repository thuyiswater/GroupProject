package com.company;


public class Customer {
    private String ID;
    private String firstName;
    private String LastName;
    private int phone;

    public Customer(String ID, String firstName, String lastName, int phone) {
        this.ID = ID;
        this.firstName = firstName;
        LastName = lastName;
        this.phone = phone;
    }

    public Customer() {}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
