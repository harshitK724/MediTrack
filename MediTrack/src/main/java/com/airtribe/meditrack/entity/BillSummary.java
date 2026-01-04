package com.airtribe.meditrack.entity;

public final class BillSummary { // Requirement: Immutable Class
    private final String billId;
    private final double amount;

    public BillSummary(String billId, double amount) {
        this.billId = billId;
        this.amount = amount;
    }

    public String getBillId() { return billId; }
    public double getAmount() { return amount; }
}
