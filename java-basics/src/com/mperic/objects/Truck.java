package com.mperic.objects;

public class Truck extends Vehicle {
    private int weight;

    public Truck(int year, int weight) {
        super("Truck", year);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                "year=" + super.getYear() +
                '}';
    }
}
