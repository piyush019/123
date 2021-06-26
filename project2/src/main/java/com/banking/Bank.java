package com.banking;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            return false;
        }

        branches.add(new Branch(name));
        return true;
    }

    public boolean addCustomer(String branch, String customer, double initialTransaction) {
        Branch checkBranch = findBranch(branch);
        if (checkBranch != null) {
            return checkBranch.newCustomer(customer, initialTransaction);
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branch, String customer, double transaction) {
        Branch checkBranch = findBranch(branch);
        if (checkBranch != null) {
            return checkBranch.addCustomerTransaction(customer, transaction);
        } else {
            return false;
        }
    }

    public boolean listCustomers(String branch, boolean printTransaction) {
        Branch checkBranch = findBranch(branch);
        if (checkBranch != null) {
            List<Customer> customers = checkBranch.getCustomers();
            System.out.println("Customer details for branch " + branch);
            for (int i = 0; i < customers.size(); i++) {
                System.out.println("Customer: " + customers.get(i).getName() + "[" +(i+1) + "]");
                if (printTransaction) {
                    System.out.println("Transactions");
                    List<Double> amount = customers.get(i).getTransactions();
                    for (int j = 0; j < amount.size(); j++) {
                        System.out.println("[" + (j+1)+ "] Amount " + amount.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(name)) {
                return branches.get(i);
            }
        }

        return null;
    }
}
