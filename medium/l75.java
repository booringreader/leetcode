// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
// with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

// inplace sorting algo does not use extra space (except for some variable)
// any algo that uses space less than O(n) is allowed for inplace algo

// bubble, selection, insertion, heapsort - inplace
// merge sort is not; quick sort is inplace (it uses linear space for recursion not storage)

public class l75{
    public static int quicksort(int[] nums){
        int arr[] = new int[3];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]++;
        }

        int idx=0;
        for(int j=0; j<arr.length; j++){
            for(int i = 0; i<arr[j]; i++){
                nums[idx++] = j;
            }
        }
    }
}
