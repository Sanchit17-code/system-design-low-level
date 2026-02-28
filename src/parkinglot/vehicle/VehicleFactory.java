package parkinglot.vehicle;

import parkinglot.enums.VehicleType;

public class VehicleFactory {
    Vehicle createVehicle(VehicleType type, String vehicleNumber){
      return  switch(type){
            case BIKE -> new Bike(vehicleNumber);
            case CAR -> new Car(vehicleNumber);
            case TRUCK -> new Truck(vehicleNumber);
        };
    }
}
