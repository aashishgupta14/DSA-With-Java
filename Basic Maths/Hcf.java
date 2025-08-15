import java.util.Scanner;
class Hcf{
    public static void main(String[] args) {
        System.out.println("enter two number");
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int hcf=0;
        int min=(n1>n2)?n1:n2;

        for(int i=min;i>=0;i--){
            if(n1%i==0 && n2%i==0){
                hcf=i;
                break;
            }
        }
        System.out.println("gcd is "+hcf);
        
    }
}