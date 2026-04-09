package Parkinglot2;

import java.time.Duration;
import java.time.LocalDateTime;

public class NormalDaysPricingCalculation implements  PricingStrategy{
    @Override
    public long calculatePricing(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        VehicleType vehicleType = ticket.getVehicle().getVehicleType();
        LocalDateTime exitTime = LocalDateTime.now();

        Duration duration = Duration.between(entryTime,exitTime);
        long hours = duration.toHours();
        if(hours==0){
            hours=1;
        }
        return switch(vehicleType){
            case CAR -> hours * 50;
            case TRUCK -> hours*100;
            case BIKE -> hours * 20;
        };

    }
}
