import java.util.Arrays;

public class Anagram {
    
    public static void main(String[] args) {
        
        String s1="sileNT is";
        String s2="listen Is";

        s1=s1.replace(" ","");
        s2=s2.replace(" ","");

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

          boolean results=Arrays.equals(a,b);

          if(results==true)
        {
            System.out.println("The string is anagram");
          }
          else{
            System.out.println("not anagram");
          }
    }
}
