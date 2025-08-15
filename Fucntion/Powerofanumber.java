


import java.util.Scanner;

public class Powerofanumber {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        double a =sc.nextInt();
        double b=sc.nextInt();
        int power=(int)Math.pow(a, b);
    System.out.println("the power of a number is "+power);
    
}
}
// import java.util.Scanner;

// public class Powerofanumber {
//     public static void main(String[] args) {
//         System.out.println("enter a number");
//         Scanner sc=new Scanner(System.in);
//         int a =sc.nextInt();
//         int b=sc.nextInt();
//         int power=1;

//        for(int i=1;i<=b;i++){
//         power=power*a;
//     }
//     System.out.println("the power of a number is "+power);
    
// }
// }
