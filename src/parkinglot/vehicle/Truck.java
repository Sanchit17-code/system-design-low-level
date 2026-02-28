package parkinglot.vehicle;

import parkinglot.enums.VehicleType;

public class Truck extends Vehicle{
    Truck(String vehicleNumber) {
        super(vehicleNumber, VehicleType.TRUCK);
    }
}
