package com.sample.aop;


public class EmployeeBO {

    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "EmployeeBO{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
