import java.util.ArrayList;
import java.util.List;
public class ParkingLot {
    private List<ParkingSlot> slots;
    public ParkingLot() {
        slots = new ArrayList<>();
    }
    public void addSlot(ParkingSlot slot) {
        slots.add(slot);
    }
    public ParkingSlot parkVehicle(Vehicle vehicle) {
        for(ParkingSlot slot : slots) {
            if(slot.isAvailable() && slot.getSlotType() == vehicle.getType()) {
                slot.park(vehicle);
                return slot;
            }
        }
        return null;
    }
}
