//392. Is Subsequence
//        Easy
//        Topics
//        Companies
//        Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//        A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//
//
//
//        Example 1:
//
//        Input: s = "abc", t = "ahbgdc"
//        Output: true
//        Example 2:
//
//        Input: s = "axc", t = "ahbgdc"
//        Output: false

package src.Problems;

public class IsSubsequence {
    public static void main(String args[]){
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s ,t));


    }

    public static boolean isSubsequence(String s, String t) {
        int pointer=0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(pointer)==t.charAt(i)){
                System.out.println(pointer+" "+i);
                pointer++;
                if(pointer==s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
