//Write an algorithm to determine if a number n is happy.
//
//        A happy number is a number defined by the following process:
//
//        Starting with any positive integer, replace the number by the sum of the squares of its digits.
//        Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//        Those numbers for which this process ends in 1 are happy.
//        Return true if n is a happy number, and false if not.
//
//
//
//        Example 1:
//
//        Input: n = 19
//        Output: true
//        Explanation:
//        12 + 92 = 82
//        82 + 22 = 68
//        62 + 82 = 100
//        12 + 02 + 02 = 1
//        Example 2:
//
//        Input: n = 2
//        Output: false


package src.Problems.HasMap;

import java.util.HashMap;
import java.util.HashSet;

public class HappyNumber {
    public static void main(String args[]){
        int n=19;
        System.out.println(isHappyNumberV1(n));
    }

    public static boolean isHappyNumber(int n){
        HashSet<Integer> set= new HashSet<>();
        while (n!=1) {
            String[] splitdigit = String.valueOf(n).split("");
            int currentDigit = 0;
            for (int i = 0; i < splitdigit.length; i++) {
                int currentInteger=Integer.valueOf(splitdigit[i]);
                currentDigit = currentDigit + currentInteger*currentInteger;
            }
            System.out.println(currentDigit);
            if(set.contains(currentDigit)){
                return false;
            }
            set.add(currentDigit);
            n = currentDigit;
        }
        return true;
    }

    public static boolean isHappyNumberV1(int n){
        HashSet<Integer> set= new HashSet<>();
        while (n!=1) {
            int currentDigit = 0;
            while (n>0){
                int unitdigit=n%10;
                currentDigit=currentDigit+unitdigit*unitdigit;
                n /=10;
            }
            System.out.println(currentDigit);
            if(set.contains(currentDigit)){
                return false;
            }
            set.add(currentDigit);
            n = currentDigit;
        }
        return true;
    }

}
