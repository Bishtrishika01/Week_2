/*Problem 3: Hospital, Doctors, and Patients (Association and Communication)
Description: Model a Hospital where Doctor and Patient objects interact through consultations. A doctor can see multiple patients, and each patient can consult multiple doctors.
Tasks:
Define a Hospital class containing Doctor and Patient classes.
Create a method consult() in the Doctor class to show communication, which would display the consultation between a doctor and a patient.
Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
Goal: Practice creating an association with communication between objects by modeling doctor-patient consultations.*/
import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private String patientId;

    public Patient(String name, String patientId) {
        this.name = name;
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public String getPatientId() {
        return patientId;
    }

    public void viewPatientDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient ID: " + patientId);
    }
}

class Doctor {
    private String name;
    private String doctorId;
    private List<Patient> patients;

    public Doctor(String name, String doctorId) {
        this.name = name;
        this.doctorId = doctorId;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName() + ".");
    }

    public void viewPatients() {
        System.out.println("Doctor " + name + " is consulting the following patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
        System.out.println();
    }
}

class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void viewHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors in the hospital:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName());
        }
        System.out.println("Patients in the hospital:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
        System.out.println();
    }
}

public class HospitalDetails {
    public static void main(String[] args) {
 
        Patient patient1 = new Patient("sachin", "P001");
        Patient patient2 = new Patient("vivek", "P002");
        Patient patient3 = new Patient("Ashish", "P003");

        Doctor doctor1 = new Doctor("Dr. Black", "D001");
        Doctor doctor2 = new Doctor("Dr. Green", "D002");

        Hospital hospital = new Hospital("City Hospital");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        hospital.viewHospitalDetails();

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient3);

        doctor1.viewPatients();
        doctor2.viewPatients();
    }
}
