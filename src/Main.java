import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
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
        // Vehicle car = new Vehicle("TN38AB1234",VehicleType.CAR);
        // ParkingSlot parkedSlot = parkingLot.parkVehicle(car);
        // if(parkedSlot != null) {
        //     System.out.println("Vehicle parked successfully");
        //     System.out.println("vehicle number : " + car.getVehicleNumber());
        //     System.out.println("Slot: "+parkedSlot.getSlotId());
        // }
        // else {
        //     System.out.println("No suitable parking slot available");
        // }
        // parkingLot.displayStatus();
        // boolean removed =
        // parkingLot.removeVehicle("TN38AB1234");

        // if (removed) {
        //     System.out.println("Vehicle removed successfully!");
        // } else {
        //     System.out.println("Vehicle not found!");
        // }

        // parkingLot.displayStatus();
        while(true) {
            System.out.println("\n========== PARKING SYSTEM ==========");

            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Display Status");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            switch(choice) {
                case 1 : 
                     System.out.print(
                            "Enter vehicle number: "
                    );

                    String vehicleNumber =
                            scanner.next();

                    System.out.print(
                            "Enter vehicle type (BIKE/CAR/TRUCK): "
                    );

                    String typeInput =
                            scanner.next();

                    VehicleType type =
                            VehicleType.valueOf(
                                    typeInput.toUpperCase()
                            );

                    Vehicle vehicle =
                            new Vehicle(
                                    vehicleNumber,
                                    type
                            );

                    ParkingSlot parkedSlot =
                            parkingLot.parkVehicle(vehicle);

                    if (parkedSlot != null) {

                        System.out.println(
                                "Vehicle parked successfully!"
                        );

                        System.out.println(
                                "Slot: "
                                + parkedSlot.getSlotId()
                        );

                    } else {

                        System.out.println(
                                "No suitable slot available."
                        );
                    }

                    break;
                case 2 :

                    System.out.print(
                            "Enter vehicle number: "
                    );

                    String number =
                            scanner.next();

                    boolean removed =
                            parkingLot.removeVehicle(number);

                    if (removed) {

                        System.out.println(
                                "Vehicle removed successfully!"
                        );

                    } else {

                        System.out.println(
                                "Vehicle not found!"
                        );
                    }

                    break;


                case 3:

                    parkingLot.displayStatus();

                    break;


                case 4:

                    System.out.println(
                            "Thank you for using the parking system!"
                    );

                    scanner.close();

                    return;


                default:

                    System.out.println(
                            "Invalid choice!"
                    );

            }
        }
    }
}
