package com.airtribe.meditrack;

import com.airtribe.meditrack.entity.Patient;
import com.airtribe.meditrack.util.DataStore;
import com.airtribe.meditrack.util.IdGenerator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataStore<Patient> patientStore = new DataStore<>();
        Scanner scanner = new Scanner(System.in);
        IdGenerator idGen = IdGenerator.getInstance();

        while (true) {
            System.out.println("\n--- MediTrack Menu ---");
            System.out.println("1. Register Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            
            int choice = scanner.nextInt();
            if (choice == 3) break;

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.next();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    patientStore.add(new Patient(idGen.nextId("PAT"), name, age));
                    System.out.println("Patient registered successfully!");
                    break;
                case 2:
                    patientStore.getAll().forEach(p -> 
                        System.out.println("ID: " + p.getId() + " | Name: " + p.getName()));
                    break;
            }
        }
        scanner.close();
    }
}