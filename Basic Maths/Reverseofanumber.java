import java.util.Scanner;
class Reverseofanumber{
    public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number  ");
    int n =sc.nextInt();
    int r,reverse=0;
    while (n>0){
        r=n%10;
        n=n/10;
        reverse=reverse*10+r;
    }
    System.out.println("The reverse number is "+reverse);
    }
}