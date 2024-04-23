package com.duang.springwebquickstart.pojo;

public class Address {
    private String city;
    private  String name;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
