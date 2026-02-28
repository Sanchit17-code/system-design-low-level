package parkinglot.vehicle;

import parkinglot.enums.VehicleType;

public abstract class Vehicle {
   private final String vehicleNumber;
   private final VehicleType type;

   Vehicle(String vehicleNumber, VehicleType type){
       this.type = type;
       this.vehicleNumber = vehicleNumber;
   }

   public String getVehicleNumber(){
       return this.vehicleNumber;
   }

   public VehicleType getType(){
       return this.type;
   }

}
