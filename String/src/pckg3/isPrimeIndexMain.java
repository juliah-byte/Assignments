package pckg3;

import java.util.Scanner;

public class isPrimeIndexMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement: ");
		String input = sc.nextLine();
		
		for(int i = 0; i < input.length(); i++ ) {
			if (i % 2 != 0) {
				
				System.out.print(Character.toUpperCase(input.charAt(i)));
			}
			else {
				System.out.print(input.charAt(i));
			}
			
		}
		
	}

}
