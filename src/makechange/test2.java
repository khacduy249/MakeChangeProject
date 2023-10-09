package makechange;
import java.util.Scanner;

//Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//then press Enter. You can now see whitespace characters in your code.
public class test2 {
 public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the amount in dollars and cents: ");
     double amount = scanner.nextDouble();
     scanner.close();

     int dollars = (int) amount;
     int cents = (int) ((amount - dollars) * 100);

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

     System.out.println("$20: " + twenties);
     System.out.println("$10: " + tens);
     System.out.println("$5: " + fives);
     System.out.println("$1: " + ones);
     System.out.println("Quarters: " + quarters);
     System.out.println("Dimes: " + dimes);
     System.out.println("Nickels: " + nickels);
     System.out.println("Pennies: " + pennies);
 }
}