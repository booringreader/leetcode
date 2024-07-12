import java.util.*;
class Solution {
    public static int[] twoSum(int nums[], int target) {
        int arr[] = new int[2];
        int sum;

        for(int i = 0; i < arr.length; i++){
            for(int j = (i+1); j < arr.length; j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    arr[0] = i; arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[] = new int[3];
        int target2 = sc.nextInt();

        for(int i = 0; i< input.length; i++){
            input[i] = sc.nextInt();
        }

        System.out.println(twoSum(input, target2));
    }
}




// import java.util.*;
// class Solution {
//     public static int[] twoSum(int nums[], int target) {
//         Arrays.sort(nums);
//         int arr[] = new int[2];
//         int left_pointer = 0, right_pointer = nums.length - 1, sum;

//         while(left_pointer < right_pointer){
//             int left_pointervalue = nums[left_pointer], right_pointervalue = nums[right_pointer];
//             sum = left_pointervalue + right_pointervalue;
//             if(sum < target){
//                 left_pointer++;
//             }else if(sum > target){
//                 right_pointer--;
//             }else{
//                 arr[0] = left_pointer; arr[1] = right_pointer;
//                 return arr;
//             }
//         }
//         return arr;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int input[] = new int[(int)Math.pow(10, 18)+1];
//         int output[] = new int[2];
//         int target2 = sc.nextInt();

//         for(int i = 0; i< input.length; i++){
//             input[i] = sc.nextInt();
//         }

//         System.out.println(twoSum(input, target2));
//     }
// }