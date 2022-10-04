//Name:Semih
//Surname:Bað
//instagram:@smhbag


/*Problem:Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the 
car in miles per gallon, and the price per gallon, and displays the cost of the trip.*/

//1-First we have to think about how to solve the problem and find a formula.
//2-To calculate the cost of the trip we have to get some values from user like distance,fuel efficiency,
//and price of fuel.
//3-The formula is: [Cost of trip = ((Distance)/(Fuel Efficiency))*(Fuel Price)]


import java.util.Scanner;

public class HW1_150120070_P1 {

	public static void main(String[] args) {
			
			// Create a Scanner object
			Scanner input = new Scanner(System.in);
			
			//getting data of distance from user
			System.out.println("Enter the driving distance:");
			double tripDistance = input.nextDouble(); //(Distance)
			
			//getting data of fuel efficiency from user
			System.out.println("Enter miles per gallon:");
			double fuelEfficiency = input.nextDouble(); //(Fuel Efficiency)
			
			//getting data of fuel price from user
			System.out.println("Enter price per gallon:");
			double fuelPrice = input.nextDouble(); //(Fuel Price)
			
			double tripCost; //(Cost of trip)
			//calculating the cost
			//The formula is: [Cost of trip = ((Distance)/(Fuel Efficiency))*(Fuel Price)]
			tripCost = ((tripDistance)/(fuelEfficiency))*(fuelPrice);
			
			//to get rid of unnecessary digit
			tripCost = (int)(tripCost*100)/100.0;
			
			/*to understand if user enter the negative number. because tripDistance, fuelEfficiency, and
			 fuelPrice can not be negative*/
			boolean isPositive = ((tripDistance >= 0)&&(fuelEfficiency >= 0))&&(fuelPrice >= 0);
		
			if (isPositive) {
		
				// Display result
				System.out.println("The distance of trip is:" + tripDistance);
				System.out.println("The fuel efficiency of car is:" + fuelEfficiency + " miles per gallon.");
				System.out.println("The price of fuel is:" + fuelPrice + " dollars per gallon.");
				System.out.println("The cost of the trip is:" + tripCost + " dollars");
			
			}
			else {
				//if users enter negative number system says that.
				System.out.println("Please check your numbers and do not enter negative numbers!");
			}
	}
}
