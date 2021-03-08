package pckg1;

import java.util.Scanner;


public class vowels {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement: ");
		String input = sc.nextLine();
		
		System.out.println(input.length());
		
		int count = 0;
		
		for(int i = 0; i < input.length(); i++ ) {
		  char ch = input.charAt(i);
		  
		  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			  count = count + 1;
			 //System.out.println(count);
		  }
		  
		  if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			  count = count + 1;
		  }
		  
		}
		  System.out.println("The total vowels in the statement are " + count);
		
		
	}

}
