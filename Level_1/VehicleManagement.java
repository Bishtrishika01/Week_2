class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000.0; 

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        
        Vehicle vehicle1 = new Vehicle("John", "Car");
        Vehicle vehicle2 = new Vehicle("Jade", "Aeroplane");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1200.0);

        System.out.println("\nAfter updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
