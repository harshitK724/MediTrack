package com.airtribe.meditrack.entity;

 abstract class MedicalEntity { } // Base abstract class requirement [cite: 51]

public abstract class Person extends MedicalEntity {
    private String id; // Encapsulation: Private fields [cite: 51]
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}