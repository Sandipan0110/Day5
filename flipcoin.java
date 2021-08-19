package flipcoin;

import java.util.Scanner;

public class flipcoin {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num : ");
		int num = sc.nextInt();
		
		int heads=0;
		int tails=0;
		int count=0;
		
		while(count<num) {
			double value = Math.random();
			
			if (value<0.5) 
				heads+=1;
			else 
				tails+=1;
			
			count++;
		}

		System.out.println("heads = "+(heads*10)/num);
		System.out.println("heads = "+(tails*10)/num);
		
		sc.close();
	}

}
