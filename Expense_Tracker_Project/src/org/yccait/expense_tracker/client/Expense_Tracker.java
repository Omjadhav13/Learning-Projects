package org.yccait.expense_tracker.client;

import java.util.Scanner;
import org.yccait.expense_tracker.entity.Budget;

public class Expense_Tracker {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Budget[]  budget =new Budget[10];
		byte choice=0;
		int count=0;

		double amount,bills,saving,expense;
		do {
			System.out.println("Welcome to Expense Tracker");
			System.out.println("============================");
			System.out.println("1. Add your income");
			System.out.println("2. Add your expense");
			System.out.println("3. Add your total bill amount");
			System.out.println("4. Add your total aavings");
			System.out.println("5. Track");
			System.out.println("-1. Exit");
			choice=sc.nextByte();
			switch(choice) {
				case 1:
						System.out.println("Enter your income");
						amount=sc.nextDouble();
						 budget[count] = new Budget(0, 0, 0, 0);
						budget[count].addIncome(amount);
						count++;
					break;
				case 2:
					System.out.println("Enter your expense");
					expense=sc.nextDouble();
					if(count >0) {
						budget[count-1].addExpense(expense);
						break;	
					}else {
						 System.out.println("No budget created yet. Please add income first.");
					}
					break;
					
				case 3:
					System.out.println("Enter your Bills");
					bills=sc.nextDouble();
					if(count >0) {
						budget[count-1].addBills(bills);
						break;	
					}else {
						 System.out.println("No budget created yet. Please add income first.");
					}
					break;
				case 4:
					System.out.println("Enter your savings amount	");
					saving=sc.nextDouble();
					if(count >0) {
						budget[count-1].addSavings(saving);
						break;	
					}else {
						 System.out.println("No budget created yet. Please add income first.");
					}
					break;
				case 5:
					if(count > 0) {
				        budget[count - 1].showTotal();
				    } else {
				        System.out.println("No budget created yet.");
				    }
				    break;
				case -1:
					System.out.println("Exiting....");
					break;
				default:
					System.out.println("Invalid Input")	;
					break;
			
				
			}
			
			
		}while(choice != -1);
		System.out.println("Thank you");
		
	}

}
