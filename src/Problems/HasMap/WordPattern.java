//Given a pattern and a string s, find if s follows the same pattern.
//
//        Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
//
//        Each letter in pattern maps to exactly one unique word in s.
//        Each unique word in s maps to exactly one letter in pattern.
//        No two letters map to the same word, and no two words map to the same letter.
//
//
//        Example 1:
//
//        Input: pattern = "abba", s = "dog cat cat dog"
//
//        Output: true
//
//        Explanation:
//
//        The bijection can be established as:
//
//        'a' maps to "dog".
//        'b' maps to "cat".
//        Example 2:
//
//        Input: pattern = "abba", s = "dog cat cat fish"
//
//        Output: false
//
//        Example 3:
//
//        Input: pattern = "aaaa", s = "dog cat cat dog"
//
//        Output: false

package src.Problems.HasMap;

import java.util.HashMap;

public class WordPattern {
    public static void main(String args[]){
       String pattern = "abbac", s = "dog Dog cat dog Camel";
       System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] sSplit=s.split(" ");
        if((pattern.length()!=sSplit.length)){
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i=0;i<pattern.length();i++){
            Character currentPattern=pattern.charAt(i);
            String currentWord=sSplit[i];

            if(charToWord.containsKey(currentPattern)){
                if(!(charToWord.get(currentPattern).equals(currentWord))){
                    return false;
                }
            }
            else if(wordToChar.containsKey(currentWord)){
                return false;
            }
            else {
                charToWord.put(currentPattern,currentWord);
                wordToChar.put(currentWord,currentPattern);
            }
        }
        return true;
    }
}
