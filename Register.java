package makechange;
import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double price = 0;
		double pay = 0;
		
		
		System.out.println("Welcome to the store! How much is your item?");
		price = sc.nextDouble();
		
		System.out.println("How much you want to give us?");
		pay = sc.nextDouble();
		
		if (pay < price) {
			System.out.println("Sorry, your amount is not enough!");
			System.exit(0);
		}
		
		double change = (double) (pay - price);
		System.out.println("Your change will be: " + change);
		
		int dollars = (int) change;
        int cents = (int) ((change - dollars) * 100);
		
		int twenties = dollars / 20;
		dollars %= 20;
		
		int tens = dollars / 10;
		dollars %= 10;
		
		int fives = dollars / 5;
		dollars %= 5;
		
		int ones = dollars;
		
		int quarters = cents / 25;
		cents %= 25;
		
		int dimes = cents / 10;
		cents %= 10;
		
		int nickels = cents / 5;
		cents %= 5;
		
		int pennies = cents;
			
		System.out.println("Number of $20 bill: " + twenties);
		
        System.out.println("Number of $10 bill: " + tens);
        
        System.out.println("Number of $5 bill: " + fives);
        
        System.out.println("Number of $1 bill: " + ones);
        
        System.out.println("Number of Quarter is: " + quarters);
        
        System.out.println("Number of Dime is: " + dimes);
        
        System.out.println("Number of Nickel is: " + nickels);
        
        System.out.println("Number of Penny is: " + pennies);
        
        System.out.println("Thank You! See You Again!");
        
	}
	
}
	
	
//			First try
//			int n = 0;
//		
//			if (change >=20) {
//				n = (int) (change/20);
//				change = change - 20*n;
//				System.out.println("The number of $20 bill is: " + n);
//			
//			}
//			else if (change >=10) {
//				n = (int) (change/10);
//				change = change - 10*n;
//				System.out.println("The number of $10 bill is: " + n);
//			}
//			else if (change >=5) {
//				n = (int) (change/5);
//				change = change - 5*n;
//				System.out.println("The number of $5 bill is: " + n);
//			}
//			else if (change >=1) {
//				n = (int) (change/1);
//				change = change - 1*n;
//				System.out.println("The number of $1 bill is: " + n);
//				
//			}
//			else if (change >=.25) {
//				n = (int) (change/.25);
//				change = change -.25*n;
//				System.out.println("The total of Quater is: " + n);
//			}
//			else if (change >=.10) {
//				n = (int) (change/.10);
//				change = change -  .10*n;
//				System.out.println("The total of Dime bill is: " + n);
//			}
//			else if (change >=.05) {
//				n = (int) (change/.05);
//				change = change - .05*n;
//				System.out.println("The total of Nickel bill is: " + n);
//			}
//			else if (change >=.01) {
//				n = (int) (change/.01);
//				change = change - .01*n;
//				System.out.println("The total of Penny bill is: " + n);
			
//			else if (change >=10) {
//				change /= 10;
//				System.out.println(change + " Dollar");
//			}
//			
//			else if (change >=5) {
//				change /= 5;
//				System.out.println(change + " Dollar");
//			}
//			
//			else if (change >=1) {
//				change /= 1;
//				System.out.println(change + " Dollar");
//			}
//			
//			else if (change >=.25) {
//				change /= .25;
//				System.out.println(change + " Dollar");
//			}
//			
//			else if (change >=.10) {
//				change /= .10;
//				System.out.println(change + " Dime");
//			}
//			else if (change >=.05) {
//				change /= 5;
//				System.out.println(change + " Nickel");
//			}
//			else if (change >=.01) {
//				change /= 1;
//				System.out.println(change + " Penny");
//			}
				
		
		
//				Second try
//              int numQuaters = change / 25;
//				for (int i=0; i < numQuaters; i++)
//					System.out.println(change + " Quarter");
//				
//				int numDimes = change / 10;
//				for (int i=0; i < numDimes; i++)
//					System.out.println(change + " Dime");
//				
//				int numNickels = change / 5;
//				for (int i=0; i < numNickels; i++)
//					System.out.println(change + " Nickel");
//				
//				int numPennies = change / 1;
//				for (int i=0; i < numPennies; i++)
//					System.out.println(change + " Penny");
				
		



