package me.sidepjt.eatgo.domain;

public class Restaurant {

    private final String name;
    private final String address;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNameInAddress() {
        return name + " in " + address;
    }
}