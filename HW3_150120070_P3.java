//Name: Semih
//Surname: Bağ
//instagram: @smhbag

//Problem:Write a program that will calculate the compound monthly interest

import java.util.Scanner;

public class HW3_150120070_P3 {

	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a initial principal amount
		System.out.print("Please enter your initial principal amount:");
		double initialBalance = input.nextDouble(); //Declare initialBalance as double veriable
		
		//Prompt the user to enter a annual interest rate
		System.out.print("Please enter annual interest rate:");
		double annualInteresRate = input.nextDouble(); //Declare annualInteresRate as double veriable 
		
		//Prompt the user to enter a time period in months
		System.out.print("Please enter number of time periods in months:");
		double periodInMonths = input.nextDouble(); //Declare periodInMonths as double veriable
		
		//Declare monthlyInterestRate, totalInterest, finalBalance as double veriable
		double monthlyInterestRate = (annualInteresRate/12);
		double totalInterest;
		double finalBalance;
		
		//Formulas and compute final balance, total interest
		finalBalance = initialBalance*(Math.pow((1 + (annualInteresRate/1200)),periodInMonths));
		totalInterest = (finalBalance - initialBalance);
		
		//to get rid of unnecessary digit
		initialBalance = (int)(initialBalance*100)/100.0;
		monthlyInterestRate = (int)(monthlyInterestRate*100)/100.0;
		totalInterest = (int)(totalInterest*100)/100.0;
		finalBalance = (int)(finalBalance*100)/100.0;
		
		// Display result
		System.out.println("Initial principal amount:" + initialBalance);
		System.out.println("Monthly interest rate:" + monthlyInterestRate);
		System.out.println("Total compound interst amount:" + totalInterest);
		System.out.println("Final balance:" + finalBalance);
		

	}

}
