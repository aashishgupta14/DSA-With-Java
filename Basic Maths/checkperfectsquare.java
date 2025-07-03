import java.util.Scanner;

public class checkperfectsquare {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int square =sc.nextInt();
    
        double num =Math.sqrt(square);

      if (square>0) {
        if(num*num==square)  {
        System.out.println("Perfect Square");
         }
        else{
        System.out.println("Not Perfect Square");
        }
      }
    else{
        System.out.println("negative number");
    }
}
}