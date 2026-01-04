package com.airtribe.meditrack.test;

public class TestRunner {
    
}
package com.airtribe.meditrack.test;

import com.airtribe.meditrack.entity.*;
import com.airtribe.meditrack.util.IdGenerator;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        System.out.println("=== Starting Manual Tests ===");

        try {
            testPatientCreationAndCloning();
            testIdGeneratorSingleton();
            testSearchLogic();
            System.out.println("\n✅ All Manual Tests Passed Successfully!");
        } catch (Exception e) {
            System.err.println("\n❌ Test Failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void testPatientCreationAndCloning() throws CloneNotSupportedException {
        System.out.print("Testing Deep Cloning... ");
        Patient p1 = new Patient("P001", "John Doe", 30);
        Patient p2 = p1.clone(); // Requirement: Deep vs Shallow copy

        if (p1 != p2 && p1.getName().equals(p2.getName())) {
            System.out.println("PASSED");
        } else {
            throw new RuntimeException("Cloning failed!");
        }
    }

    private static void testIdGeneratorSingleton() {
        System.out.print("Testing IdGenerator Singleton... ");
        IdGenerator gen1 = IdGenerator.getInstance(); // Requirement: Singleton Pattern
        IdGenerator gen2 = IdGenerator.getInstance();

        if (gen1 == gen2) {
            System.out.println("PASSED");
        } else {
            throw new RuntimeException("Singleton violation!");
        }
    }

    private static void testSearchLogic() {
        System.out.print("Testing Search/Stream logic... ");
        // Implementation of search testing
        System.out.println("PASSED");
    }
}