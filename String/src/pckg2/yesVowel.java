package pckg2;

public class yesVowel {
	
	
	public static boolean hasVowel(char ch) {
		  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			 return true;
		  }
		  
		  if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			  return true;
		  }
		  
		  else {
			  return false;
		  }
		  
		}


}
