package com.mperic.objects;

public abstract class Vehicle {

    private final String name;
    private final int year;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
