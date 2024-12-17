//Given an array of strings strs, group the
//        anagrams
//        together. You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//
//        Explanation:
//
//        There is no string in strs that can be rearranged to form "bat".
//        The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
//        The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
//        Example 2:
//
//        Input: strs = [""]
//
//        Output: [[""]]
//
//        Example 3:
//
//        Input: strs = ["a"]
//
//        Output: [["a"]]

package src.Problems.HasMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String args[]){
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));


    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] s=strs[i].toCharArray();
            Arrays.sort(s);
            String currentString=new String(s);
            System.out.println("currentString "+currentString.toString());

            map.putIfAbsent(currentString,new ArrayList<>());
            map.get(currentString).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
