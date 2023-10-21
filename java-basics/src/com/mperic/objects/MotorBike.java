package com.mperic.objects;

public class MotorBike implements IVehicle {

    @Override
    public void startUp(int i) {
        System.out.println("Motorbike is starting up " + i);
    }
}
