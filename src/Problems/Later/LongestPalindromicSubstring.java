////Longest Palindromic Substring
////        Medium
////        Topics
////        Companies
////        Hint
////        Given a string s, return the longest
////        palindromic
////
////        substring
////        in s.
////
////
////
////        Example 1:
////
////        Input: s = "babad"
////        Output: "bab"
////        Explanation: "aba" is also a valid answer.
////        Example 2:
////
////        Input: s = "cbbd"
////        Output: "bb"
//
//package src.Problems.Later;
//
//public class LongestPalindromicSubstring {
//    public static void main(String args[]) {
//        String s = "babad";
//        System.out.println(getLongestPalindromicSubstring(s));
//
//    }
//
//    public static String getLongestPalindromicSubstring(String s){
//        int start=0;
//        int end=0;
//        String maxLength;
//
//        for(int i=0; i<s.length();i++){
//            int L1= getLongetstPalindrom(s, i, i);
//            int L2= getLongetstPalindrom(s, i, i+1);
//            maxLength<(L2-L1)?
//        }
//        return s.substring(start,end-1);
//    }
//
//    private static int getLongetstPalindrom(String s, int left, int right){
//
//            while(s.charAt(left)==s.charAt(right) && left>=0 && right<s.length()){
//                left++;
//                right--;
//            }
//        return right-left+1;
//    }
//}
