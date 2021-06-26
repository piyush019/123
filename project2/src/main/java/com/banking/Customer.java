package com.banking;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }


    public String getName() {
        return name;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}
