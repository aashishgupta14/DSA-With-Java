import java.util.Scanner;
public class CountVowelConsonents {
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        str=str.toLowerCase();
        int vowel=0;
        int consonents=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='i'||ch=='e'|| ch=='o'||ch=='u'){
                    vowel++;
                }
                else{
                    consonents++;
                }
            }
        }
        System.out.println("Vowels is "+vowel);
        System.out.println("Consonents is "+consonents);
        
    }
    
}
