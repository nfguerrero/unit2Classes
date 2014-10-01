import java.util.Scanner;

/**
 * Write a description of class RectangleCalculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RectangleCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Unit of measurement: ");
        String unit = input.next();
        
        System.out.print("Length of Rectangle: ");
        double length = input.nextDouble();
        
        System.out.print("Width of Rectangle: ");
        double width = input.nextDouble();
        
        System.out.print("Round to x digits after decimal: ");
        double roundTo = input.nextDouble();
        
        double power = Math.pow(10, roundTo);
        
        double area = length*width;
        area *= power;
        area = Math.round(area);
        area /= power;
        double perimeter = (2*length)+(2*width);
        perimeter *= power;
        perimeter = Math.round(perimeter);
        perimeter /= power;
        double diagonal = (length*length)+(width*width);
        diagonal = Math.sqrt(diagonal);
        diagonal *= power;
        diagonal = Math.round(diagonal);
        diagonal /= power;
        
        System.out.println("The area of your Rectangle is: " + area + " " + unit);
        System.out.println("The perimeter of your Rectangle is: " + perimeter + " " + unit);
        System.out.println("The length of the diagonal of your Rectangle is: " + diagonal + " " + unit);
        
    }

}
