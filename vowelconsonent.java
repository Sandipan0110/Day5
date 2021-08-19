package flipcoin;

import java.util.Scanner;

public class vowelconsonent {
	
	public static void main(String args[]){
	      
		System.out.println("Enter a character : ");
	    Scanner chr = new Scanner(System.in);
	    char ch = chr.next().charAt(0);
	    
	    if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
	    	System.out.println(ch + " is an vowel");
	    else
	    	System.out.println(ch + " is a consonant");
	    
	    chr.close();
	}
}
