package flipcoin;

import java.util.Scanner;

public class quotient {
	public static void main(String[] args)
    {
		int divid , divis ;
		
		Scanner num = new Scanner(System.in);
        System.out.println("Enter value of dividend : ");
        divid = num.nextInt();
        
        Scanner numb = new Scanner(System.in);
        System.out.println("Enter value of divisor : ");
        divis = numb.nextInt();

  
        int quotient = divid / divis;
        int remainder = divid % divis;
  
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    
        num.close();
        numb.close();
    
    }

}
