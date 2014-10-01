import java.util.Scanner;

/**
 * Write a description of class PhoneNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhoneNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Phone Number: ");
        String num = scan.next();
        
        String area = "(" + num.substring(0, 3) + ")";
        String mid = "-" + num.substring(3, 6) + "-";
        String end = num.substring(6, 10);
        
        System.out.print(area + mid + end);
    }

}
