/*Ride-Hailing Application
Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.*/
package com.practiceproblems;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(new Car("car1", "Rishika", 25.0));
        vehicles.add(new Bike("bike121", "Jane", 30.0));
        vehicles.add(new Auto("auto121", "Harry", 10.0));

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof GPS) {
                ((GPS) vehicle).updateLocation("Bhopal");
            }
        }

        double distance = 20.0;

        for (Vehicle vehicle : vehicles) {
            
           vehicle.getVehicleDetails();

            if (vehicle instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            }

            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            System.out.println("***********************************************************************************");
        }
        
        System.out.println("\n--- Updating Locations ---");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof GPS) {
                ((GPS) vehicle).updateLocation("Indore");
                vehicle.getVehicleDetails();
                System.out.println( " -> Updated Location: "+ ((GPS) vehicle).getCurrentLocation());
            }
        }
    }
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    //getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
    
    public void getVehicleDetails(){
        System.out.println("Vehicle id: "+vehicleId );
        System.out.println("Driver Name: "+driverName);
        System.out.println("Rate per Km: "+ratePerKm);
    }
   
    public abstract double calculateFare(double distance);

}

interface GPS {
    String getCurrentLocation();
  
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS{
    private String currentLocation;
    
    Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }
    
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    
    @Override
    public void updateLocation(String newLocation) {
    this.currentLocation = newLocation;
    }
    
    @Override
    public double calculateFare(double distance) {
        return distance*getRatePerKm();
    }
}
class Bike extends Vehicle implements  GPS{
    private String currentLocation;
   
    Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }
    
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    
    @Override
    public void updateLocation(String newLocation) {
    this.currentLocation= newLocation;
    }
    
    @Override
    public double calculateFare(double distance) {
        return distance*getRatePerKm();
    }
}
class Auto extends Vehicle implements GPS{
    private String currentLocation;
    
    Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }
    
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
   
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation= newLocation;
    }
    
    @Override
    public double calculateFare(double distance) {
        return distance*getRatePerKm();
    }
}