package flipcoin;

import java.util.Scanner;

public class oddeven {
	
	public static void main(String[] args) {
		
		int x;
		
		Scanner num = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        x = num.nextInt();
        
        if(x % 2 == 0)
            System.out.println( x + " Number is Even");
        else
            System.out.println( x + " Number is Odd");
        
        num.close();
	
	}

}
