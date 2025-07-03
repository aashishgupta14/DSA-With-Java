import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
       System.out.print("Enter a string:");
       Scanner sc= new Scanner(System.in);
       String s=sc.nextLine();
        String r="";
        for(int i = s.length() - 1; i >= 0; i--){
            r = r + s.charAt(i);
        }
        if(s.equals(r)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not Palindrome String");
        }
    }
}



