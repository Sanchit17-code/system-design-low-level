package Parkinglot2;

import java.time.LocalDateTime;
import java.util.List;

public class EntryGate {
    private final int GateNo;
    private List<Floor> floors;
    public EntryGate(int GateNo, List<Floor>floors) {
        this.GateNo = GateNo;
        this.floors = floors;
    }
    public ParkingSpot generateParkingSpot(Vehicle vehicle, ParkingStrategy parkingStrategy){
        ParkingSpot parkingSpot =   parkingStrategy.generateParkingSpot(vehicle, floors);
        return parkingSpot;
    }
    public Ticket generateTicket(Vehicle vehicle, ParkingStrategy parkingStrategy){
        ParkingSpot parkingSpot = generateParkingSpot(vehicle,parkingStrategy);
        if(parkingSpot != null){
            parkingSpot.setOccupied(true);
            Ticket ticket = new Ticket(vehicle, LocalDateTime.now(), parkingSpot);
            return ticket;
        }
        return null;
    }
}
