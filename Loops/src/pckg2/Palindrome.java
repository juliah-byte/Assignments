package pckg2;

public class Palindrome {
	
	public Palindrome() {
		
	}
    public static void isPalindrome(int num) {
        int newNum = num / 100;
        int remainder = num % 10;
        if (newNum == remainder) {
            System.out.println(num + " is a palindrome number");
        }
    }

}
