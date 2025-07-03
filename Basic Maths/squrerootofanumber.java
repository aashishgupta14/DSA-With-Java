import java.util.Scanner;
public class squrerootofanumber {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        double m =Math.sqrt(n);
        System.out.println("The square root of a " +n+ "  is "+m);
    }
}
