package parkinglot;

import java.util.List;

public class Floor {
    private final int floorNo;
    private final List<Slot> slots;

    public Floor(int floorNo, List<Slot>slots){
        this.floorNo = floorNo;
        this.slots = slots;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public List<Slot> getSlots() {
        return slots;
    }
}
