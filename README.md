MediTrack - Clinic & Appointment Management System
MediTrack is a modular, object-oriented system implemented in Core Java to manage patients, doctors, and appointments. It demonstrates proficiency in Java fundamentals, SOLID principles, and advanced features like concurrency and streams.


🚀 Features

Core OOP Design: Implements inheritance (Person → Doctor/Patient) and abstraction (MedicalEntity) .


Appointment Management: Create and track appointments using a status-based Enum system (PENDING, CONFIRMED, CANCELLED).


Billing System: Generates bills with tax calculations and provides immutable BillSummary objects .


Generic Data Layer: A centralized DataStore<T> for managing entities .


Persistence: Save and load data via CSV utility.


Advanced Features: Deep cloning for patients, stream-based analytics for doctor fees, and Singleton-based ID generation.


🛠️ Project Structure
The project follows a standard Java package hierarchy :


com.airtribe.meditrack.entity: Domain models (Patient, Doctor, Appointment) .


com.airtribe.meditrack.service: Business logic for handling services .


com.airtribe.meditrack.util: Utilities for I/O, ID generation, and validation .


com.airtribe.meditrack.exception: Custom exception handling .


com.airtribe.meditrack.interfaces: Functional interfaces like Searchable and Payable .

💻 Setup & Usage
Prerequisites
Java Development Kit (JDK) 11 or higher.

VS Code with "Extension Pack for Java" installed.

Compilation
From the project root directory, run:

Bash

javac -d bin src/main/java/com/airtribe/meditrack/**/*.java
Running the Application
To start the menu-driven console interface:

Bash

java -cp bin com.airtribe.meditrack.Main
Running Manual Tests
To verify logic without JUnit:

Bash

java -cp bin com.airtribe.meditrack.test.TestRunner
📄 Documentation
Detailed technical documentation is available in the docs/ folder:



JVM_Report.md: Breakdown of JVM internals (Class Loader, Heap vs Stack, JIT) .




Design_Decisions.md: Explanation of design patterns used (Singleton, Strategy).


Setup_Instructions.md: Detailed environment configuration.
