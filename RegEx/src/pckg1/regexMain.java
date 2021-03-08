package pckg1;

import java.util.Scanner;

public class regexMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you driving licence number: ");
		String s = sc.nextLine();
		
		regex.dlValidation(s);
		
		sc.close();
	}
	
}
