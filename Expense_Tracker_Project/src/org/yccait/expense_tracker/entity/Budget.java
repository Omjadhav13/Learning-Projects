package org.yccait.expense_tracker.entity;

public class Budget {
	private double income;
	private double expense;
	private double bills;
	private double savings;
	
	
	public Budget(double income,double expense,double bills,double savings) {
		setIncome(income);
		setExpense(expense);
		setBills(bills);
		setSavings(savings);
	}
	
	
	public void setIncome(double income) {
		this.income=income;
	}
	public double getIncome() {
		return income;
	}
	
	
	public double getExpense() {
		return expense;
	}
	public void setExpense(double expense) {
		this.expense = expense;
	}
	
	
	public double getBills() {
		return bills;
	}
	public void setBills(double bills) {
		this.bills = bills;
	}
	
	
	public double getSavings() {
		return savings;
	}
	public void setSavings(double savings) {
		this.savings = savings;
	}
	
	
	public void addIncome(double amount) {
	    this.income += amount;
	}
	
	public void addExpense(double amount) {
		this.expense+=amount;
	}
	public void addBills(double amount) {
		this.bills+=amount;
	}
	public void addSavings(double amount) {
		this.savings+=amount;
	}
	public void showTotal() {
	    System.out.println("----- Budget Summary -----");
	    System.out.println("Income: " + income);
	    System.out.println("Expense: " + expense);
	    System.out.println("Bills: " + bills);
	    System.out.println("Savings: " + savings);
	    double total = income - expense - bills - savings;
	    System.out.println("Remaining Balance: " + total);
	}

	
	
}
