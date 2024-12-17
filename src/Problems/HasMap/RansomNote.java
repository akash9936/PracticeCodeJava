//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//        Each letter in magazine can only be used once in ransomNote.
//
//
//
//        Example 1:
//
//        Input: ransomNote = "a", magazine = "b"
//        Output: false
//        Example 2:
//
//        Input: ransomNote = "aa", magazine = "ab"
//        Output: false
//        Example 3:
//
//        Input: ransomNote = "aa", magazine = "aab"
//        Output: true


        package src.Problems.HasMap;

import java.util.HashMap;

public class RansomNote {

    public static void main(String args[]){
        String ransomNote = "aad";
        String magazine = "aabc";
        System.out.println(canConstruct(ransomNote,magazine));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()==0){
            return true;
        }
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
               map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }
            else {
                map.put(magazine.charAt(i), 1);
            }
        }
        for(int j=0;j<ransomNote.length();j++){
            if(map.containsKey(ransomNote.charAt(j))){
                map.put(ransomNote.charAt(j),map.get(ransomNote.charAt(j))-1);
                if( map.get(ransomNote.charAt(j))==0){
                    map.remove(ransomNote.charAt(j));
                }
            }
            else {
                return false;
            }

        }
        return true;
    }
}
