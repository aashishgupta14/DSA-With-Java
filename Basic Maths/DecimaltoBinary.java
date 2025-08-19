import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a decimal number");
        int decimal=sc.nextInt();

        String binary="";

        while(decimal>0){
            int rem=decimal%2;
            binary=binary+rem;
            decimal=decimal/2;
        }
        System.out.println("The binary number is  "+binary);
    }
    
}
