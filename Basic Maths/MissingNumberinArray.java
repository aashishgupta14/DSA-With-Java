public class MissingNumberinArray {
    public static void main(String[] args) {
        int[] arr={1,4,3,5};
        int n=5; // number 1 se 5 hona chayiye
        int total =n*(n+1)/2;
        int sum=0;

        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        int missingnumber=total-sum;

        System.out.println("The missing number is  "+missingnumber);
    }
    
}
