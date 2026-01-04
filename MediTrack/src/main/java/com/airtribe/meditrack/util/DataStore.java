package com.airtribe.meditrack.util;

import java.util.ArrayList;
import java.util.List;

public class DataStore<T> { // Generic class requirement [cite: 30]
    private List<T> items = new ArrayList<>();

    public void add(T item) { items.add(item); }
    public List<T> getAll() { return items; }
}