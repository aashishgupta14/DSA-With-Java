import java.util.HashMap;

class TwosumusingHashmap{
    public static void main(String[] args) {
        int[] nums={2,6,8,7,1};
        int target=14;
        HashMap <Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int result=target-nums[i];      //kya chayiye

            if(map.containsKey(result)){  // agaar mil gya 
              
              System.out.println((map.get(result) + " " +i));
              return; // indices print hoga

            }
            map.put(nums[i],i); // store number and index
        }
    }
}