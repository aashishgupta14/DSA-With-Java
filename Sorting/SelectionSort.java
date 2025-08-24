public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,5,86,8,7,2,3};
        int n=arr.length;
        for(int  i=0;i<n-1;i++){
            int min=i; //assuming minimum element is i
            for (int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
        //swap the element 
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
        }
        for (int i : arr) {
            System.out.println(i +" ");
            
        }
    }
    
}
