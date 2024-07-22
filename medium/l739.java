// Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days
// you have to wait after the ith day to get a warmer temperature.
// If there is no future day for which this is possible, keep answer[i] == 0 instead.

// index difference between the current element of the array and the next largest one.
// brute force - use two pointers from one side O(n2)
// O(n2) but from the right
// using stack : O(n)

/*
 * start from the end, keep the maximum temperature from the end that you find
 * compare all previous temperatures with the max from end temp
 * if you find any then update the variable that keeps record of max from end
 * if you don't find any temperature while going backwards that is greater than the right ones
 * this would means there is a temperature towards the end that is supposedly greater than the one we are currently on hence our answer
 * so we create another pointer (though for an instant) that will start travelling from the current+1 index towards the end
 * checking if the temperature is greater than the current one
 * incase it finds the temperature in question, then update the output array with (j-i)
 * if the needed larger temperature is not found then update the temporary index and try again
 * the condition of update is to add it to the data at the index position in the output array, so that the new instantaneous index
 * becomes a sum of inst. idx and output[inst. idx] this way we will be able to skip all the arguably smaller than current+1 elements and go
 * directly to the element that is greater than the current+1 element, skipping the ones with a very low probability of being the answer since
 * if an element can be greater than the element that is smaller than the current element(current+1) then how can it be hoped that it will be greater than than the current element.
*/
public class l739{
    public int[] dailytemp(int[] temperatures){
        int output[] = new int[temperatures.length()];

        for(int i=temperatures.length-1; i>0; i--){
            if(temperatures[i] > hottest){
                hottest = temperatures[i];
            }else{
                int tempIdx = i+1;
                if(temperatures[tempIdx] < hottest){
                    tempIdx = tempIdx + output[tempIdx];
                }
                output[i] = tempIdx - i;
            } 
        }
    }
    public static void main(String args[]){

    }
}

// use while loop instead of if conditional on the nested if condition, because you want to go forward until the larger temperature is found
// if condition will iterate only once
