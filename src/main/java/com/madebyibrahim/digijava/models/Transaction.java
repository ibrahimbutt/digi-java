package com.madebyibrahim.digijava.models;

public class Transaction {

    private int id;
    private String category;
    private double amount;

    public Transaction(int id, String category, double amount) {
        this.id = id;
        this.category = category;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}

