import java.util.Scanner;
public class DecimaltoOctal {
    public static void main(String[] args) {
        System.out.println("Enter a decimal number:");
        Scanner sc =new Scanner(System.in);
        int decimal=sc.nextInt();

        String octal="";

        while (decimal>0) {
            int rem=decimal%8;
            octal=rem + octal;
            decimal=decimal/8;

            
        }
        System.out.println("the octal number is "+octal);
    }

    
}
