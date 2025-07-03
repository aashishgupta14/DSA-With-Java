import java.util.Scanner;

public class Armstrongofanumber {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int r,arm=0,c=n;

         while(n>0){
            r=n%10;
            arm=r*r*r+arm;
            n=n/10;
         }  

         if(c==arm){
            System.out.println("Armstrong number");
         }
         else{
            System.out.println("Not Armstrong Number");
         }
    }
    
}
