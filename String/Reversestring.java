import java.util.Scanner;

class Reversestring{
    public static void main(String[] args) {
       System.out.print("Enter a string:");
       Scanner sc= new Scanner(System.in);
       String s=sc.nextLine();
        String r="";
        for(int i = s.length() - 1; i >= 0; i--){
            r = r + s.charAt(i);
        }
        System.out.println(r);
    }
}


