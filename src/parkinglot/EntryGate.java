package parkinglot;

import parkinglot.enums.VehicleType;
import parkinglot.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class EntryGate {


    public Slot findSlot(Vehicle vehicle, Parkinglot lot){
        VehicleType type = vehicle.getType();
        List<Floor> floors = lot.getFloors();
        for(Floor floor : floors){
            for(Slot slot : floor.getSlots()){
                if(slot.getIsFree()== true){
                    return slot;
                }
            }
        }
        return null;
    }

    public Ticket generateTicket(Vehicle vehicle, Parkinglot lot){
        Slot slot = findSlot( vehicle, lot );
        if(slot==null){
            throw new RuntimeException("Np parkign slot available");
        }
        slot.setIsFree(false);
        Ticket ticket = new Ticket(UUID.randomUUID().toString(), vehicle, slot, LocalDateTime.now());
        return ticket;
    }

}
