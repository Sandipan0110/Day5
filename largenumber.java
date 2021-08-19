package flipcoin;

import java.util.Scanner;

public class largenumber {
	
	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner num = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        n1 = num.nextInt();
        
        System.out.println("Enter 2nd Number : ");
        n2 = num.nextInt();
        
        System.out.println("Enter 3rd Number : ");
        n3 = num.nextInt();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    num.close();
	
	}

}
