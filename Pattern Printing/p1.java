import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        // System.out.print("Enter ith row:");
        // Scanner sc=new Scanner(System.in);
        // int i =sc.nextInt();
        // System.out.print("Enter jth row:");
        // int j =sc.nextInt();

        for(int i=1;i<=4;i++){
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
