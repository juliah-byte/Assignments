package pckg1;

public class regex {
	
	public static void dlValidation(String s) {
		   
		if(s.matches("^[0-9]{8}")) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

}
