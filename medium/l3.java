// Given a string s, find the length of the longest substring  without repeating characters.
// hashset doesn't allow duplicates

import java.util.HashSet;
public class l3{
    public static int lengthOfstring(String s){
        // window size is variable; set keeps track of window size
        // instead of treading arbitrarily, we use the window as a basis to track characters
        // when a repeated character is encountered the window size can be adjusted to begin from the initial step
        // otherwise there is no efficient way to track, when the characters are repeating
        HashSet<Character> set = new HashSet<>();
        int begin=0, end=0, d=Integer.MIN_VALUE, counter=0;
        
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(begin++));
                }
                set.add(s.charAt(begin));
            }else{
                set.add(s.charAt(i));
                end++;
            }
        }
        
        for(Character str : set) {
            counter++;
        } 
        return d = Math.max(d,counter);

    }

    public static void main(String args[]){
        String s = "bcba";
        System.out.println(lengthOfstring(s)); 
        
    }
}

// not final
