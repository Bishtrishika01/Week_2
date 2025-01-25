/*Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.*/
package com.practiceproblems;

import java.util.List;
import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Car car = new  Car("3456632", "Car",20000 , 55628);
        Bike bike = new Bike("35632344", "Bike", 6000, 45631);
        Truck truck = new Truck("895674", "Truck", 30000, 567893);

        vehicles.add(truck);
        vehicles.add(bike);
        vehicles.add(car);

        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.getType());
            System.out.println("Rental Cost : "+vehicle.calculateRentalCost(10));
            ((Insurable)vehicle).getInsuranceDetails();
        }
    }
}


abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(String vehicleNumber,String type,double rentalRate){
        this.type = type;
        this.rentalRate = rentalRate;
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public String getType(){
        return type;
    }

    public double getRentalRate(){
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);

}

interface Insurable{
    public double calculateInsurance();
    public void getInsuranceDetails();
}

class Car extends Vehicle implements Insurable{
    private double insurancePolicyNumber;

    Car(String vehicleNumber,String type,double rentalRate,double insurancePolicyNumber){
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days*getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.1;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy No. : "+insurancePolicyNumber);
        System.out.println("Insurance : "+calculateInsurance());
    }
}
class Bike extends Vehicle implements Insurable{
    private double insurancePolicyNumber;

    Bike(String vehicleNumber,String type,double rentalRate,double insurancePolicyNumber){
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days*getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.05;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy No. : "+insurancePolicyNumber);
        System.out.println("Insurance : "+calculateInsurance());
    }
}
class Truck extends Vehicle implements Insurable{
    private double insurancePolicyNumber;

    Truck(String vehicleNumber,String type,double rentalRate,double insurancePolicyNumber){
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days*getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.15;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy No. : "+insurancePolicyNumber);
        System.out.println("Insurance : "+calculateInsurance());
    }
}