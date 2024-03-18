package org.example;

public class Address { // address of the customer
    private int number;
    private String street;
    private String city;
    private String province;
    private String zip;
    private String country;

    public Address(){
    }

    public Address (int number, String street, String city, String province, String zip, String country) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.province = province;
        this.zip = zip;
        this.country = country;
    }

    // Getters
    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    // Setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
