package flipcoin;

import java.util.Scanner;

public class factor {
	public static void main(String[] args) {
		
		int number;
		
		Scanner num = new Scanner(System.in);
        System.out.println("Enter value of number : ");
        number = num.nextInt();

	    System.out.print("Factors of " + number + " are: ");
	    
	    for (int i = 1; i <= number; ++i) {
	    	
	    	if (number % i == 0) 
	    		System.out.println(i);
	    	
	    }
	    
	    num.close();
	}
}