package com.mperic;

import com.mperic.objects.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Vehicle truck = new Truck(1988, 7);
        IVehicle car = new Car(2023);
        IVehicle bike = new MotorBike();

        IVehicle v = i -> System.out.println("Anonimus vehicle1 " + i);

        List<IVehicle> vehicles = List.of(new Car(2023), new MotorBike(), v);

        for (IVehicle vehicle : vehicles) {
            vehicle.startUp(1);
        }
    }
}


