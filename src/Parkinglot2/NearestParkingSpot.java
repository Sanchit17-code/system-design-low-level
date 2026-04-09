package Parkinglot2;

import java.util.List;

public class NearestParkingSpot implements ParkingStrategy{


    @Override
    public ParkingSpot generateParkingSpot(Vehicle vehicle, List<Floor> floors) {
        VehicleType vehicleType = vehicle.getVehicleType();
        for(Floor floor : floors){
            for(ParkingSpot spot : floor.getParkingSpotList()){
                synchronized (spot){
                    if(spot.isOccupied() == false){
                        return spot;
                    }
                }
            }
        }
        System.out.println("Parking is full, cannot park any vehicle");
        return null;
    }
}
