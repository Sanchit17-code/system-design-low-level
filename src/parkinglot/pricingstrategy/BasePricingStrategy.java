package parkinglot.pricingstrategy;

import parkinglot.Ticket;
import parkinglot.enums.VehicleType;
import parkinglot.vehicle.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;

public class BasePricingStrategy {
    public double costComputation(Ticket ticket){
        Vehicle vehicle = ticket.getVehicle();
        LocalDateTime exitTime = LocalDateTime.now();
        long hours = Math.max(1, Duration.between(ticket.getEntryTime(),exitTime).toHours());
        return ratePerHour(vehicle.getType()) * hours;
    }

    private double ratePerHour(VehicleType type){
        return switch(type){
            case BIKE -> 10;
            case CAR -> 20;
            case TRUCK -> 30;
        };
    }
}
