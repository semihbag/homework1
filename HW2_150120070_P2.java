//Name: Semih
//Surname: Bað
//instagram: @smhbag

/*Problem:Write a program that converts a date that is given in days to “Year: <years>, Mount: <mounts>,
Day: <days>” format.*/

/*Algorithm:
*1-Get number from user
*2-Divide the number by 365 and find the years value
*3-Divide the remainder by 31 and find the month value
*4-The last remainder is day value*/


import java.util.Scanner;

public class HW2_150120070_P2 {

	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Getting data number of days from user
		System.out.println("Please enter the number of days you want to convert:");
		int dayNumbers = input.nextInt();
		
		//Calculating the years value
		//we can get the answer by dividing dayNumber to 365
		int years = (dayNumbers/365);
		
		//Calculating the months value
		//we calculated the years value on last step so we know it.
		//if we divide the remaining days by 31, we will get the months value.
		int months = ((dayNumbers%365)/31);
		
		//Calculating the days value
		//first we found the remaining days from years with (dayNumbers%365).
		//later we found the remaining days from months with %31.
		int days = ((dayNumbers%365)%31);
		
		
		// Display result
		
		System.out.println("Year:" + years);
		System.out.println("Month:" + months);
		System.out.println("Day:" + days);
		
	}

}
