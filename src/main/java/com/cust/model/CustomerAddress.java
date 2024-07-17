package com.cust.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CustomerAddress")
public class CustomerAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

//    @ManyToOne(fetch = FetchType.LAZY)
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String addressType;

    public CustomerAddress() {
        // Default constructor
    }

    // Constructor without customer parameter
    public CustomerAddress(String address, String city, String state, String zipCode, String country, String addressType) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.addressType = addressType;
    }

    // Getters and setters

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    @Override
    public String toString() {
        return "CustomerAddress [addressId=" + addressId + ", customer=" + customer + ", address=" + address +
                ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", country=" + country +
                ", addressType=" + addressType + "]";
    }
}
