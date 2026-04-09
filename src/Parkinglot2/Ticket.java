package Parkinglot2;

import java.time.LocalDateTime;

public class Ticket {

    private final Vehicle vehicle;
    private final LocalDateTime entryTime;
    private final ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, LocalDateTime entryTime, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
