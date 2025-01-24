package com.assisted;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
    String name;
    double maxSpeed;
    String fuelType;
    List<Vehicle> vehicleType;
    
    Vehicle(String name,double maxSpeed,String fuelType){
        this.name = name;
        this.maxSpeed =maxSpeed;
        this.fuelType=fuelType;
        vehicleType = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicleType.add(vehicle);
    }

    public void showVehicleType(){
        System.out.println("Vehicle available : ");
        for(Vehicle vehicle:vehicleType){
            System.out.println(" -"+vehicle.name);
        }
        System.out.println();
    }

    public void displayInfo(){
        System.out.println("Vehicle Name : "+ name);
        System.out.println("Maximum Speed of "+name+" : ");
        System.out.println("Feul Type of "+name+" : ");
        System.out.println();
        
    }
}
class Motorcycle extends Vehicle{
    String type = "Motorcycle";
    int seatCapacity=2;

    Motorcycle(String name,double maxSpeed,String fuelType){
        super(name,maxSpeed,fuelType);
    }
    @Override
    public void displayInfo(){
        System.out.println("Vehicle Type : "+ type);
        System.out.println("Vehicle Name: "+name);
        System.out.println("Maximum Speed of "+name+" : "+maxSpeed);
        System.out.println("Feul Type of "+name+" : ");
        System.out.println("Seat Capacity : "+seatCapacity);
        System.out.println();
    }
}
class Car extends Vehicle{
    String type = "Car";
    int seatCapacity=4;

    Car(String name,double maxSpeed,String fuelType){
        super(name,maxSpeed,fuelType);
    }
    @Override
    public void displayInfo(){
        System.out.println("Vehicle Type : "+ type);
        System.out.println("Vehicle Name: "+name);
        System.out.println("Maximum Speed of "+name+" : "+maxSpeed);
        System.out.println("Feul Type of "+name+" : ");
        System.out.println("Seat Capacity : "+seatCapacity);
        System.out.println();
    }
}
class Truck extends Vehicle{
    String type = "Truck";
    int seatCapacity=2;

    Truck(String name,double maxSpeed,String fuelType){
        super(name,maxSpeed,fuelType);
    }
    @Override
    public void displayInfo(){
        System.out.println("Vehicle Type : "+ type);
        System.out.println("Vehicle Name: "+name);
        System.out.println("Maximum Speed of "+name+" : "+maxSpeed);
        System.out.println("Feul Type of "+name+" : ");
        System.out.println("Seat Capacity : "+seatCapacity);
        System.out.println();
    }
}
public class VehicleandTransportSystem {
    public static void main(String args[]){
        Vehicle vehicle = new Vehicle(null, 0, null);
        Vehicle car = new Car("Bugatti Chiron Sports 300+",490 , "Diesel");
        Vehicle truck = new Truck("Volvo Iron Knight", 380, "Diesel");
        Vehicle motorcycle = new Motorcycle("Kawasaki Ninja H2R", 400, "Petrol");

        vehicle.addVehicle(car);
        vehicle.addVehicle(truck);
        vehicle.addVehicle(motorcycle);

        vehicle.showVehicleType();

        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();
    }
}
