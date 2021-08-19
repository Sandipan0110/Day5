package flipcoin;

import java.util.Scanner;

public class swap2num {
	
	public static void main(String[] args) {  
	       
		int x, y, z;
	       
		Scanner num = new Scanner(System.in);
        System.out.println("Enter value of X : ");
        x = num.nextInt();
        
        Scanner numb = new Scanner(System.in);
        System.out.println("Enter value of Y : ");
        y = numb.nextInt();  
	       
        z = x;  
        x = y;  
        y = z;  
	       
	    System.out.println("After Swapping : " +x + "   " + y);  
	    System.out.println( );  
	
	    num.close();
	    numb.close();
	    
	}    
	
}
