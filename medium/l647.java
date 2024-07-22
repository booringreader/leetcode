// Given a string s, return the number of palindromic substrings in it.
// A string is a palindrome when it reads the same backward as forward.
// A substring is a contiguous sequence of characters within the string.

// length of substring
// two pointers track if the successive chars are same as previous ones

public class l647{
    public static int countSubstrings(arr[], string s){
        char arr[] = new char[s.length()];
        int mid = (si+ei)/2;

        left = countSubstrings(arr, si, mid);
        right = countSubstrings(arr, mid+1, ei);
    }
    public static void main(String args[]){

    }
}

// incomplete

/*
 * brute force - O(n2)
 * use two pointers; each pointer travels in either direction and keeps increasing the counter, if even once a different element is encountered, iteration breaks
 * normally if we did this with only one iteration then the logic would fail,because
 * it would be a possibility that one side of the current character (epicenter for both pointers moving either way) encounters different character but the other side still had chars left that make the palindromes
 * but, we keep doing it for each character, so each character gets its iteration, hence
 * even if the critical case does happen where one side is left without covering all palindromes, some other iteration over a later char will cover it
 * or it would have already been covered by a previous iteration over the very characters that were left out
 *
 * efficient time - O(n)
 * dp can be used in cases where the test cases are like a rubix cube, with lots of smaller cubes in them
 * a lot of iterations of the code are carried out on the test cases and in each iteration the cube is broken down to find the smaller cubes
 * hence the smaller cubes keep repeating, and keep being calculated in each iteration; though the answer does not change
 *
 * here we can use dp to calculate palindromes in O(n) time
*/
