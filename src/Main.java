public class Main {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle("TN38AB1234",VehicleType.CAR);
        // ParkingSlot slot = new ParkingSlot("C1",VehicleType.CAR);
        // System.out.println("vehicle: "+vehicle.getVehicleNumber());
        // System.out.println("Type: " + vehicle.getType());
        // System.out.println("Slot available: " + slot.isAvailable());
        // slot.park(vehicle);
        // System.out.println("Slot available: " + slot.isAvailable());
        // System.out.println("Parked vehicle: "+ slot.getVehicle().getVehicleNumber());
        // slot.removeVehicle();
        // System.out.println("Slot available: " + slot.isAvailable());
        ParkingLot parkingLot = new ParkingLot();
        ParkingSlot bikeSlot1 = new ParkingSlot("B1", VehicleType.BIKE);
        ParkingSlot bikeSlot2 = new ParkingSlot("B2", VehicleType.BIKE);
        ParkingSlot carSlot1 = new ParkingSlot("C1", VehicleType.CAR);
        ParkingSlot carSlot2 = new ParkingSlot("C2", VehicleType.CAR);
        ParkingSlot truckSlot = new ParkingSlot("T1", VehicleType.TRUCK);
        parkingLot.addSlot(bikeSlot1);
        parkingLot.addSlot(bikeSlot2);
        parkingLot.addSlot(carSlot1);
        parkingLot.addSlot(carSlot2);
        parkingLot.addSlot(truckSlot);
        System.out.println("Parking lot created !");
        Vehicle car = new Vehicle("TN38AB1234",VehicleType.CAR);
        ParkingSlot parkedSlot = parkingLot.parkVehicle(car);
        if(parkedSlot != null) {
            System.out.println("Vehicle parked successfully");
            System.out.println("vehicle number : " + car.getVehicleNumber());
            System.out.println("Slot: "+parkedSlot.getSlotId());
        }
        else {
            System.out.println("No suitable parking slot available");
        }
    }
}
