package parkinglot;

import java.util.List;

public class Parkinglot {
    private final List<Floor> floors;
    public Parkinglot(List<Floor> floors){
        this.floors = floors;
    }
    public List<Floor>getFloors(){
        return this.floors;
    }
}
