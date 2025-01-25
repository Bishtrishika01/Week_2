/*Hospital Patient Management
Description: Design a system to manage patients in a hospital:
Create an abstract class Patient with fields like patientId, name, and age.
Add an abstract method calculateBill() and a concrete method getPatientDetails().
Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
Implement an interface MedicalRecord with methods addRecord() and viewRecords().
Use encapsulation to protect sensitive patient data like diagnosis and medical history.
Use polymorphism to handle different patient types and display their billing details dynamically.*/
package com.practiceproblems;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagement {
    public static void main(String[] args) {
        
        Patient inPatient = new InPatient(1, "Rishika", 43, 5000, 2000);
        Patient outPatient = new OutPatient(2, "Vansh", 33, 500, 300);

        if (inPatient instanceof MedicalRecord) {
            ((MedicalRecord) inPatient).addRecord("Admitted for surgery.");
            ((MedicalRecord) inPatient).addRecord("Discharged after 4 days.");
        }

        if (outPatient instanceof MedicalRecord) {
            ((MedicalRecord) outPatient).addRecord("Consulted for fever.");
            ((MedicalRecord) outPatient).addRecord("Prescribed medicines.");
        }

        List<Patient> patients = new ArrayList<>();
        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                System.out.println("Medical History:");
                System.out.println(((MedicalRecord) patient).viewRecords());
            }
            System.out.println("*************************************************************");
        }
    }
}
abstract class Patient {
        private int patientId;
        private String name;
        private int age;

        public Patient(int patientId, String name, int age) {
            this.patientId = patientId;
            this.name = name;
            this.age = age;
        }

        public abstract double calculateBill();

        public void getPatientDetails() {
            System.out.println("Patient ID: " + patientId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}
class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private double treatmentCharges;
    private String medicalHistory = "";

    public InPatient(int patientId, String name, int age, double roomCharges, double treatmentCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.treatmentCharges = treatmentCharges;
    }
    
    @Override
    public double calculateBill() {
        return roomCharges + treatmentCharges;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {

        if (medicalHistory.isEmpty()) {
            return "No records available.";

        } else {
            return medicalHistory;
        }

    }
}
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double medicineCharges;
    private String medicalHistory = "";

    public OutPatient(int patientId, String name, int age, double consultationFee, double medicineCharges) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicineCharges = medicineCharges;
    }

    @Override
    public double calculateBill() {
        return consultationFee + medicineCharges;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {
        if (medicalHistory.isEmpty()) {
            return "No records available.";

        } else {
            return medicalHistory;
        }
    }
}