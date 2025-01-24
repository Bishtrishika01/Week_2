// // Sample Problem 2: Vehicle Management System with Hybrid Inheritance
// // Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle
//  are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
// // Tasks:
// // Define a superclass Vehicle with attributes like maxSpeed and model.
// // Create an interface Refuelable with a method refuel().
// // Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while 
// ElectricVehicle include a charge() method.
// // Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how
//  Java interfaces allow adding multiple behaviors

package com.hybridinheritance;

class Vehicle {
    private int maxSpeed;
    private String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Charging " + getModel() + " done!");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        System.out.println("Refueling " + getModel() + " done!");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
    
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model3");
        PetrolVehicle pv = new PetrolVehicle(180, "Toyota");

        ev.charge();
        pv.refuel();
    }
}
