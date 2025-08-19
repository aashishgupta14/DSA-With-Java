import java.util.Scanner;
public class OctaltoDecimal {
    public static void main(String[] args) {
    System.out.println("Enter octal number:");
    Scanner sc= new Scanner (System.in);
    int octal=sc.nextInt();


     int Decimal=0;
    int base=1;
    while (octal>0) {
        int ld=octal%10;
        Decimal= Decimal+ld* base;
        base=base*8;
        octal=octal/10;
        
    }
    System.out.println("The decimal number is "+Decimal);

        
    }
    
}
