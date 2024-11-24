package src;

import java.util.HashMap;

public class IsAnagram {

    public static void main(String[] arg) {
        String s = "racecat";
        String t = "carrace";
        boolean result=checkAnagram(s,t);
        System.out.println(result);

    }
    public static boolean checkAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(map.values());
        for(int j=0;j<t.length();j++){
            if(!map.containsKey(t.charAt(j))){
                return false;
            }
            map.put(t.charAt(j),map.get(t.charAt(j)) -1);

            if(map.get(t.charAt(j)) ==0){
                map.remove(t.charAt(j));
            }
            System.out.println(map.values());
        }
        return true;
    }

    }


