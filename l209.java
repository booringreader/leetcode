// Given an array of positive integers nums and a positive integer target, return the minimal length of a 
// subarray  whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

public class l209{
    // make a window, keep increasing its size and adding the new elements
    // when the sum exceeds target, reduce window size to current element 
    // restart from the current element
    //
    // if the target and sum are equal, return the size of subarray (end-begin +1)
    // else if the sum is less than target keep increasing the window size
    // if sum exceeds target, reduce the window size until sum is less than target
    public static int minsubarr(int[] nums, int target){
        if(nums.length == 0){
            return 0;
        }
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        if(sums < target){
            return 0;
        }

        while(end < nums.length){
            sum += nums[end++]; // giving flow to the problem (upstream flow)
            // sum is calculated, now check if it is equal to target or less or greater than it.
            // calculate one window first (where element sum is greater or equal to target, then keep moving the window to find newer ones)
            while(sum >= target){
                int currentwin = end - begin;
                size = Math.min(size, currentwin);
                // current window size is calculated and stored
                // find new windows now
                sum -= nums[begin++];
            }
        }
    }
    public static void main(String args[]){

    }
}
