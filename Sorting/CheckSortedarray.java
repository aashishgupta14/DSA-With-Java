class CheckSortedarray{
    public static void main(String[] args) {
       int[] arr={9,4,7,3,2,1};
          //int[] arr={1,2,3,4,5};
          //int[] arr={1,1,2,3,4,5,6,7};
        boolean isSorted =true;


        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println(" Sorted Array");
        }
        else{
            System.out.println("Not Sorted Array");
        }


    }
}