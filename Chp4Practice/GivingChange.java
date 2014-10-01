import java.util.Scanner;

/**
 * Write a description of class GivingChange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GivingChange
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Amount Due: ");
        double due = scan.nextDouble();
        System.out.print("Amount Payed: ");
        double pay = scan.nextDouble();
        
        double amount = pay - due;
        while (amount < 0)
        {
            if (amount < 1)
            {
                amount *= 100;
                amount = Math.round(amount);
                amount /= 100;
            }
            if (amount < .1)
            {
                amount *= 1000;
                amount = Math.round(amount);
                amount /= 1000;
            }
            System.out.println("You owe: " + (-1 * amount));
            System.out.print("Amount Payed: ");
            pay = scan.nextDouble();
            
            amount += pay;
        }

        int dollars = (int)(amount/1);
        double cents = amount%1;
        
        cents *= 100;
        cents = Math.round(cents);
        cents /= 100;
        
        int quarters = (int)(cents / .25);
        cents -= quarters*.25;
        
        int dimes = (int)(cents / .1);
        cents -= dimes*.1;
        
        int nickels = (int)(cents / .05);
        cents -= nickels*.05;
        
        cents *= 1000;
        cents = Math.round(cents);
        cents /= 1000;
        
        int pennies = (int)(cents / .01);
        
        System.out.println("\nYour Change:");
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }

}
