class Patient{
    
    public static String hospitalName = "Gayatri MultiSpeciality Hospital";
    static int totalPatients=0;
    static int randomId=1000;
    
    private String name; 
    private int age; 
    private String ailment;

    private final int patientId;
    
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment; 
        this.patientId= randomId++ +1; 
        totalPatients++; 
    }

    public static void getTotalPatients(){
        System.out.println("Total Patients in the hospital is: "+ totalPatients);
    }

    
    public void displayPatientDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println();
    }

    public static void checkInstance(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj; 
            patient.displayPatientDetails(); 
        } else {
            System.out.println("This is not a Patient object.");
        }
    }
} 
public class HospitalManagementSystem{
    public static void main(String[] args) {
         
         Patient patient1 = new Patient("Kim", 21, "Cough");
         Patient patient2 = new Patient("Marry", 22, "Fever");
 
         
         patient1.displayPatientDetails();
         System.out.println();
 
         
         patient2.displayPatientDetails();
         System.out.println();
 
         
         Patient.getTotalPatients();
         System.out.println();
 
         Patient.checkInstance(patient1); 
         Patient.checkInstance("Not a patient"); 
    }
    
}