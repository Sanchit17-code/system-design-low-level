package parkinglot.vehicle;

import parkinglot.enums.VehicleType;

public class Car extends Vehicle{
    Car(String vehicleNumber) {
        super(vehicleNumber, VehicleType.CAR);
    }
}
