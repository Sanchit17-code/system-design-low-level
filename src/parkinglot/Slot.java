package parkinglot;

import parkinglot.enums.ParkingSpotType;

public class Slot {

    private final String id;
    private final ParkingSpotType parkingSpotType;
    private Boolean isFree = true;

    public Slot(String id, ParkingSpotType parkingSpotType){
        this.id = id;
        this.parkingSpotType =parkingSpotType;
    }

    public Boolean getIsFree(){
        return this.isFree;
    }

    public void setIsFree(Boolean value){
        this.isFree = value;
    }
}
