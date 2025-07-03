import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int i,count=0;
        for(i=1;i<=n;i++){
           if(n%i==0){
            count++;
           }
        }
        if(count==2){
        System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }
    }
    
}
