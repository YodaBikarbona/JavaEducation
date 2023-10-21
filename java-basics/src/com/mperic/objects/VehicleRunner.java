package com.mperic.objects;

public class VehicleRunner {

    private final IVehicle vehicle;

    public VehicleRunner(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void runVehicle() {
        vehicle.startUp(1);
    }
}
