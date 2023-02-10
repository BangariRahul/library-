package com.example.library.model;



public class Library {
    private String name;
    private String address;
    private int number;
    private String facilities;

    public Library(String name, String address, int number, String facilities) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.facilities = facilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", facilities='" + facilities + '\'' +
                '}';
    }
}
