package com.airtribe.meditrack.entity;

public class Patient extends Person implements Cloneable {
    private int age;

    public Patient(String id, String name, int age) {
        super(id, name); // Constructor chaining [cite: 51]
        this.age = age;
    }

    @Override
    public Patient clone() throws CloneNotSupportedException {
        return (Patient) super.clone(); // Deep copy requirement [cite: 51]
    }
}