package com.airtribe.meditrack.util;

// Singleton Pattern
public class IdGenerator {
    private static IdGenerator instance;
    private int currentId = 1000;

    private IdGenerator() {}

    public static synchronized IdGenerator getInstance() {
        if (instance == null) instance = new IdGenerator();
        return instance;
    }

    public String nextId(String prefix) {
        return prefix + (++currentId);
    }
}