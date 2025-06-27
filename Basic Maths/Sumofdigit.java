import java.util.Scanner;
class Sumofdigit{
    public static void main (String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n =sc.nextInt();
        int r,sum=0;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;

        }
        System.out.println("the sum is "+sum);
    }
}
