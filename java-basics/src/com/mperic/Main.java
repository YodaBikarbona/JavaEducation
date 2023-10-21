package com.mperic;

import com.mperic.objects.*;

import java.util.*;
import java.util.logging.Logger;

public class Main {

    public static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Vehicle truck = new Truck(1988, 7);
        Car car = new Car(2023);
        IVehicle bike = new MotorBike();

        IVehicle v = i -> System.out.println("Anonimus vehicle1 " + i);

        ByteReader reader = new ByteReader();

        IVehicle print = reader.print(car);

        String query = String.format("""
                    select v.model, v.year from vehicle v 
                  inner join registration_plate p on v.plate_id = p.id
                  where v.name = %s
                """, "opel");

        logger.info(query);

    }

    public IVehicle startVehicle(EVehicle vehicle) {
        return switch (vehicle) {
            case CAR -> new Car(1);
            case MOTOR_BIKE -> new MotorBike();
            default -> throw new IllegalStateException("Unexpected value: " + vehicle);
        };
    }
}


