package Parkinglot2;

import java.util.List;

public class Floor {
    private final int floorNo;
    private List<ParkingSpot> parkingSpotList;

    public Floor(int floorNo, List<ParkingSpot> parkingSpotList) {
        this.floorNo = floorNo;
        this.parkingSpotList = parkingSpotList;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }
}
