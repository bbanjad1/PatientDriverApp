package patient.java;

import java.util.Scanner;
public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  patient details
        System.out.println("Enter patient's first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter patient's middle name: ");
        String middleName = scanner.nextLine();
        System.out.println("Enter patient's last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter patient's street address: ");
        String streetAddress = scanner.nextLine();
        System.out.println("Enter patient's city: ");
        String city = scanner.nextLine();
        System.out.println("Enter patient's state: ");
        String state = scanner.nextLine();
        System.out.println("Enter patient's ZIP code: ");
        String zip = scanner.nextLine();
        System.out.println("Enter patient's phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter emergency contact name: ");
        String emergencyContactName = scanner.nextLine();
        System.out.println("Enter emergency contact phone number: ");
        String emergencyContactPhone = scanner.nextLine();

        // Creating a Patient object
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zip, phoneNumber, emergencyContactName, emergencyContactPhone);
        
        // details for 3 procedures
        Procedure[] procedures = new Procedure[3];
        double totalCharges = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name of procedure " + (i+1) + ": ");
            String procedureName = scanner.nextLine();
            System.out.println("Enter date of procedure (MM/DD/YYYY): ");
            String procedureDate = scanner.nextLine();
            System.out.println("Enter name of practitioner: ");
            String practitionerName = scanner.nextLine();
            System.out.println("Enter charges for the procedure: ");
            double procedureCharges = scanner.nextDouble();
            scanner.nextLine(); 

            //  calculating total charges
            procedures[i] = new Procedure(procedureName, procedureDate, practitionerName, procedureCharges);
            totalCharges += procedureCharges;
        }

        // Displaying  patient info
        System.out.println("\nPatient info:");
        System.out.println(patient);

        // Displaying  procedure details
        for (int i = 0; i < procedures.length; i++) {
          
            System.out.println(procedures[i] + "\n");
        }

        // Displaying total charges 
        System.out.println("\nTotal Charges: $" + totalCharges);

        // student details
        System.out.println("\nStudent Name: Bishal");
        System.out.println("MC#: MC777777");
        System.out.println("Due Date: 10/12/2024");

        scanner.close();
    }
}