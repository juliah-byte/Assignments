package pckg2;

import java.util.Scanner;

public class yesVowelMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement: ");
		String input = sc.nextLine();
		
		for( int i = 0; i < input.length(); i++){
			
			boolean has = yesVowel.hasVowel(input.charAt(i));
			
			if( has == false) {
				break;
			}
		}
		
	}

}
