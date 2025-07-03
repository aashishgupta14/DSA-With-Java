import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        System.out.print("Enter the term which you want");
        Scanner sc= new Scanner(System.in);
        int term =sc.nextInt();
        int a=0,b=1, c;

        for(int i=1;i<=term;i++){
            System.out.print(a+ "  ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    
}
