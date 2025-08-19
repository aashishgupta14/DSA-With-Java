class Bubblesort{
    public static void main(String[] args) {
        int[] arr={5,3,6,9,7};

        //bubble sort
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
         // compare adjacent element 

          if(arr[j]>arr[j+1]){
            //swap

            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

          }

            }
        }

        for (int num : arr) { // for each loop me num likho chahe i 
            System.out.println(num+" ");
            
        }
    }
}


// space complexcity is o(1)
// time complexcity is o(n*2) n ki power 2