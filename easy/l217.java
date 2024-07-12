public class containsDup{
   static boolean cup(int[] nums){
    int freq[] = new int[nums.length];

    for(int i=0; i<nums.length; i++){
        freq[nums[i]]++;
        if(freq[nums[i]]>1){
            return true;
        }
     }
    return false;
   } 
   public static void main(String args[]){
    int arr[] = {1,2,3,4};
    System.out.println(cup(arr));
   }
}

