import java.util.Scanner;

public class DistanceConverter
{
   final static int YARDS_TO_FEET_CONVERSION = 3;
   final static int FEET_TO_INCHES_CONVERSION = 12;
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter amount of yards: ");
      double yards = scan.nextDouble();
      double feet = yards * YARDS_TO_FEET_CONVERSION;
      double inches = feet * FEET_TO_INCHES_CONVERSION;
      
      System.out.println(yards + " yards is " + feet + " feet");
      System.out.println(yards + " yards is " +  inches + " inches");
   }
}