//Longest Substring Without Repeating Characters
//        Medium
//        Topics
//        Companies
//        Hint
//        Given a string s, find the length of the longest
//        substring
//        without repeating characters.
//
//
//
//        Example 1:
//
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.


package src.Problems;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
    public static void main (String args[]){

        String s = "auaaw";
        System.out.println(findmaxSubstringV1(s));
    }

    public static int findmaxSubstring(String s){
        int left=0;
        if(s.length()==0){
            return 0;
        }
        int maxLength=1;
        HashSet<Character> maxString = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            if(maxString.contains(currentChar))
            {
                while(maxString.contains(currentChar)){
                    maxString.remove(s.charAt(left));
                    left++;
                }
                maxString.add(s.charAt(i));
            }
            else{
                maxString.add(s.charAt(i));
            }
            if(maxLength<maxString.size()){
                maxLength=maxString.size();
            }
        }
        return maxLength;
//        System.out.println(maxLength);
    }

    public static int findmaxSubstringV1(String s){

        HashMap<Character, Integer> map=new HashMap<>();
        int left=0;
        int maxChar=0;
        for(int j=0;j<s.length();j++){
            Character currentChar=s.charAt(j);
            if(map.containsKey(currentChar) && left<=map.get(currentChar)){
                left=map.get(currentChar)+1;
            }
            map.put(currentChar,1);
            if(maxChar<map.size()) maxChar=map.size();
        }
        return maxChar;
    }
}
