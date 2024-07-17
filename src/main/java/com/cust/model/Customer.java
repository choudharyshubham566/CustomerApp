package com.cust.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "Customers")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    
//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<CustomerAddress> addresses = new ArrayList<>();

    public Customer() {
        // Default constructor
    }

    // Constructor without addresses parameter
    public Customer(int customerId, String firstName, String lastName, String email, String phone) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    // Getters and setters

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public List<CustomerAddress> getAddresses() {
//        return addresses;
//    }
//
//    public void setAddresses(List<CustomerAddress> addresses) {
//        this.addresses = addresses;
//    }

    // Method to add an address to the list
//    public void addAddress(CustomerAddress address) {
//        addresses.add(address);
//        address.setCustomer(this); // Set the bidirectional relationship
//    }
//
//    // Method to remove an address from the list
//    public void removeAddress(CustomerAddress address) {
//        addresses.remove(address);
//        address.setCustomer(null); // Remove the bidirectional relationship
//    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName +
                ", email=" + email + ", phone=" + phone + "]";
    }
}
