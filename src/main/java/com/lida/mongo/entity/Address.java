package com.lida.mongo.entity;

/**
 * Created by John on 2017-2-8.
 */
public class Address {

    private String city;
    private String street;
    private int num;

    public Address() {
    }

    public Address(String city, String street, int num) {
        this.city = city;
        this.street = street;
        this.num = num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", num=" + num +
                '}';
    }
}
