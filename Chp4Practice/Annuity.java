import java.util.Scanner;

public class Annuity
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What's your periodic payment? ");
        double pmt = scan.nextDouble();
        
        System.out.print("What's your periodic interest or compound rate? ");
        double i = scan.nextDouble();
        
        System.out.print("How many payments are you recieving? ");
        double n = scan.nextDouble();
        
        double pvann = pmt * (((Math.pow((1+i),(n-1))-1)/i)/(Math.pow((1+i),(n-1)))+1);
        pvann *= 100;
        pvann = Math.round(pvann);
        pvann /= 100;
        System.out.print("Your present value of annuity is " + pvann);
    }
}