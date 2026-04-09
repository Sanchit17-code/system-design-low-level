package Parkinglot2;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot generateParkingSpot(Vehicle vehicle, List<Floor> floors);
}
