package pckg4;

public class sum {
	
	public static void checkSum() {
        int countEven = 0;
        int countOdd = 0;

        for(int i = 1; i <= 100; ++i) {
            if(i % 2 == 0) {
                countEven += i;
            }

            if(i % 2 != 0) {
                countOdd += i;
            }
        }

        System.out.println("The sum of all even numbers is " + countEven);
        System.out.println("The sum of all odd numbes is " + countOdd);
    }

}
