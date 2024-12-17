//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//        P   A   H   N
//        A P L S I I G
//        Y   I   R
//        And then read line by line: "PAHNAPLSIIGYIR"
//
//        Write the code that will take a string and make this conversion given a number of rows:
//
//        string convert(string s, int numRows);
//
//
//        Example 1:
//
//        Input: s = "PAYPALISHIRING", numRows = 3
//        Output: "PAHNAPLSIIGYIR"
//        Example 2:
//
//        Input: s = "PAYPALISHIRING", numRows = 4
//        Output: "PINALSIGYAHRPI"
//        Explanation:
//        P     I    N
//        A   L S  I G
//        Y A   H R
//        P     I
//        Example 3:
//
//        Input: s = "A", numRows = 1
//        Output: "A"
//        https://leetcode.com/problems/zigzag-conversion/





package src.Problems;

import java.util.HashMap;

public class ZigzagConversion {
    public static void main(String[] args) {
        String  s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.print(getZigZag(s,numRows));


    }
    public static String getZigZag(String s, int numRows){
        int currentPointer=0;
        String result="";

        for(int i=0;i<s.length();i++){
            result.concat(String.valueOf(s.charAt(currentPointer)));
            System.out.println(String.valueOf(s.charAt(currentPointer)));
            currentPointer=numRows+currentPointer+1;
            if(currentPointer>s.length()){
                currentPointer=s.length()-currentPointer+numRows;
            }
        }
        return result;


    }
}
