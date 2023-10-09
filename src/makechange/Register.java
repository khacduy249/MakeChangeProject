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
	
	
