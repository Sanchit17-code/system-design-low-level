package Parkinglot2;

public class ParkingSpot {
    private final String id;
    private final VehicleType vehicleType;
    private boolean isOccupied;

    public ParkingSpot(String id, VehicleType vehicleType, boolean isOccupied) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.isOccupied = isOccupied;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
