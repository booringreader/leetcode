// if the ending index of one element is smaller than the starting index of other element, merge the two elements to make one
// sort the array based on ending index 
// compare ending index of each with the starting index of all others, if the ei is greater than si, then the two elements merge with si1 and ei2(orei1) as new elements
// O(nlogn)

// problems while writing code:
// make sure the intervals array copy is sorted based on either ei or si
// there is no need to keep track of the indices of each subarray of "intervals"
// the output array must be dynamically allocated, since it is not known how many arrays can be merged 
// it would be better if the output array is not dependent on the same iterating variable as the comparable array, since it makes it hard to input values in the output array
// a good solution to this (via gpt) is- to make a linked list (for output) use the .getLast() method to input values in the output array(tobe) and then convert this output
// linked list of array to an actual 2D array using .toArray() method (apparently something like this is quite possible with java's extensive libraries)



public class l56{
    public static void merge(int[][] intervals){
        int sorted[][] = new int[intervals.length][3];

        for(int i=0; i<intervals.length; i++){
            sorted[i][0] = i;   // stores index of intervals' elements
            sorted[i][1] = intervals[i][1];  // stores si
            sorted[i][2] = intervals[i][2];  // stores ei
            output[i][0] = i;
        }

        Arrays.sort(sorted, Comparator.comparingDouble(o -> o[2])); // sorts based on 2nd column
        
        // if ei of one is > si of the following one, replace ei with max(ei1, ei2)
        
        for(int i=0; i<sorted.length-1; i++){
            if(sorted[i][2] >= sorted[i+1][2]){
                output[i][2] = Math.max(sorted[i][2], sorted[i+1][2]);
                i++;
            }else{
                output[i][2] = sorted[i][2];
            }
        }

        return output;
    }
}


// incomplete
