import java.util.ArrayList;

public class SmartParkingSlotManager {

    static ArrayList<String> vehicles = new ArrayList<>();

    public static void vehicleEntry(String number) {

        vehicles.add(number);
        System.out.println(number + " Entered.");
    }

    public static void vehicleExit(String number) {

        if (vehicles.remove(number)) {
            System.out.println(number + " Exited.");
        } else {
            System.out.println("Vehicle Not Found.");
        }
    }

    public static void searchVehicle(String number) {

        if (vehicles.contains(number))
            System.out.println(number + " is parked.");
        else
            System.out.println(number + " is not parked.");
    }

    public static void displayVehicles() {

        System.out.println("\nParked Vehicles:");

        for (String vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println("Occupied Slots: " + vehicles.size());
    }

    public static void main(String[] args) {

        vehicleEntry("UP80AB1234");
        vehicleEntry("DL10XY5678");
        vehicleEntry("MP20CD9876");

        searchVehicle("DL10XY5678");

        vehicleExit("UP80AB1234");

        displayVehicles();
    }
}