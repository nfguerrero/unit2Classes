import java.util.Scanner;

/**
 * Write a description of class NoCommaNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoCommaNumber
{
    public static void main(String[] args)
    {
        Scanner sComma = new Scanner(System.in);
        
        System.out.print("Writing with (Comma) or (no Comma)? ");
        String comma = sComma.next();
        
        Scanner scan = new Scanner(System.in);
        if (comma.compareTo("Comma") == 0)
        {
            System.out.print("Please enter an integer between 1,000 and 999,999: ");
            String sNum = scan.next();
            
            String preNum = sNum.substring(0, sNum.length() - 4);
            String postNum = sNum.substring(sNum.length() - 3, sNum.length());        
            
            System.out.print(preNum + postNum);    
        }
        else
        {
            System.out.print("Please enter an integer between 1000 and 999999: ");
            String sNum = scan.next();
            
            String preNum = sNum.substring(0, sNum.length() - 3);
            String postNum = sNum. substring(sNum.length() - 3, sNum.length());
            
            System.out.print(preNum + "," + postNum);
        }
        
    }
}
