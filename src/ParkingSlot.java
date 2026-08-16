public class ParkingSlot {
    private String slotId;
    private VehicleType slotType;
    private Vehicle vehicle;
    public ParkingSlot(String slotId, VehicleType slotType) {
        this.slotId = slotId;
        this.slotType = slotType;
    }
    public String getSlotId() {
        return slotId;
    }
    public VehicleType getSlotType() {
        return slotType;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public boolean isAvailable() {
        return vehicle == null;
    }
    public void park(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void removeVehicle() {
        this.vehicle = null;
    }
}

