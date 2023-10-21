package com.mperic.objects;

public class Car extends Vehicle {

    private String model;
    private float engineCC;
    private RegistrationPlate registrationPlate;

    public Car(int year) {
        super("Car", year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(float engineCC) {
        this.engineCC = engineCC;
    }

    public RegistrationPlate getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(RegistrationPlate registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engineCC=" + engineCC +
                ", registrationPlate=" + registrationPlate +
                "} " + super.toString();
    }
}
