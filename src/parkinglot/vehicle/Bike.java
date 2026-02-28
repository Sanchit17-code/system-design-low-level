package parkinglot.vehicle;

import parkinglot.enums.VehicleType;

public class Bike extends Vehicle{
    Bike(String vehicleNumber) {
        super(vehicleNumber, VehicleType.BIKE);
    }
}
