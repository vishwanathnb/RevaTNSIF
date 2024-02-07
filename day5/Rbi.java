package com.tnsif.day5;

public class Rbi {
	public class RBI {
	    private String guidelines;
	    private double interestRates;

	    // Constructor, getters, setters for guidelines and interestRates

	    public void setGuidelines(String newGuidelines) {
	        // Implement guideline setting logic
	    }

	    public void updateInterestRates(double newRates) {
	        // Implement interest rate updating logic
	    }

	    // Potentially add enforceRegulations() method
	}

	public class Accounts extends RBI {
	    private int accountNumber;
	    private String name;
	    private double balance;

	    // Constructor, getters, setters for account details

	    public void deposit(double amount) {
	        // Implement deposit logic
	    }

	    public void withdraw(double amount) {
	        // Implement withdraw logic
	    }

	    public void calculateInterest() {
	        // Use inherited interestRates to calculate interest
	    }

	    // Potentially add complyWithGuidelines() method
	}


}
