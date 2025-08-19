import java.util.Scanner;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a binary number");
        int binary=sc.nextInt();

        int decimal=0;
        int base=1;

        while (binary>0) {
        int ld=binary%10;
            decimal=decimal + ld * base;
            base=base*2;
            binary=binary/10;
            
        }
        System.out.println("The decimal number is "+decimal);
        
        
    }
    
}
