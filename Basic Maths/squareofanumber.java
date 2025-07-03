import java.util.Scanner;

public class squareofanumber {
 public static void main(String[] args) {
    System.out.print("Enter a number:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s=n*n;
    System.out.println("The square of "+n+" is "+s);
 }   
}
