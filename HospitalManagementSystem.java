import java.util.*;
import java.util.Date;
class Patient {
    private String id;
    private String name;
    private int age;
    private String address;

    public Patient(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "Patient{id='" + id + "', name='" + name + "', age=" + age + ", address='" + address + "'}";
    }
}
class Appointment {
    private String id;
    private String patientId;
    private Date date;
    private String doctorName;

    public Appointment(String id, String patientId, Date date, String doctorName) {
        this.id = id;
        this.patientId = patientId;
        this.date = date;
        this.doctorName = doctorName;
    }

    // Getters
    public String getId() { return id; }
    public String getPatientId() { return patientId; }
    public Date getDate() { return date; }
    public String getDoctorName() { return doctorName; }

    @Override
    public String toString() {
        return "Appointment{id='" + id + "', patientId='" + patientId + "', date=" + date + ", doctorName='" + doctorName + "'}";
    }
}
class EHR {
    private String patientId;
    private String medicalHistory;

    public EHR(String patientId, String medicalHistory) {
        this.patientId = patientId;
        this.medicalHistory = medicalHistory;
    }

    // Getters
    public String getPatientId() { return patientId; }
    public String getMedicalHistory() { return medicalHistory; }

    @Override
    public String toString() {
        return "EHR{patientId='" + patientId + "', medicalHistory='" + medicalHistory + "'}";
    }
}
class Billing {
    private String patientId;
    private double amount;
    private String status;

    public Billing(String patientId, double amount, String status) {
        this.patientId = patientId;
        this.amount = amount;
        this.status = status;
    }

    // Getters
    public String getPatientId() { return patientId; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Billing{patientId='" + patientId + "', amount=" + amount + ", status='" + status + "'}";
    }
}
class Inventory {
    private String id;
    private String name;
    private int quantity;
    private double pricePerUnit;

    public Inventory(String id, String name, int quantity, double pricePerUnit) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPricePerUnit() { return pricePerUnit; }

    @Override
    public String toString() {
        return "Inventory{id='" + id + "', name='" + name + "', quantity=" + quantity + ", pricePerUnit=" + pricePerUnit + "}";
    }
}
class Staff {
    private String id;
    private String name;
    private String role;
    private double salary;

    public Staff(String id, String name, String role, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Staff{id='" + id + "', name='" + name + "', role='" + role + "', salary=" + salary + "}";
    }
}

public class HospitalManagementSystem {
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();
    private List<EHR> ehrRecords = new ArrayList<>();
    private List<Billing> billings = new ArrayList<>();
    private List<Inventory> inventory = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();

    // Patient Registration
    public void registerPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient registered: " + patient);
    }

    // Schedule Appointment
    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment scheduled: " + appointment);
    }

    // Add EHR
    public void addEHR(EHR ehr) {
        ehrRecords.add(ehr);
        System.out.println("EHR added: " + ehr);
    }

    // Process Billing
    public void processBilling(Billing billing) {
        billings.add(billing);
        System.out.println("Billing processed: " + billing);
    }

    // Manage Inventory
    public void addInventory(Inventory item) {
        inventory.add(item);
        System.out.println("Inventory item added: " + item);
    }

    // Manage Staff
    public void addStaff(Staff staff) {
        staffMembers.add(staff);
        System.out.println("Staff member added: " + staff);
    }

    // Main method
    public static void main(String[] args) {
        HospitalManagementSystem system = new HospitalManagementSystem();

        // Sample data
        system.registerPatient(new Patient("P001", "John Doe", 30, "123 Elm Street"));
        system.scheduleAppointment(new Appointment("A001", "P001", new Date(), "Dr. Smith"));
        system.addEHR(new EHR("P001", "No significant medical history."));
        system.processBilling(new Billing("P001", 150.00, "Paid"));
        system.addInventory(new Inventory("I001", "Bandages", 100, 1.50));
        system.addStaff(new Staff("S001", "Dr. Smith", "Doctor", 5000.00));
    }
}
