package flipcoin;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args){
	      
		int year;
	    
	      Scanner yr = new Scanner(System.in);
	      System.out.println("Enter an Year : ");
	      year = yr.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Year is a leap year");
	      else
	         System.out.println("Year is not a leap year");
	      
	      yr.close();
	}      
}
