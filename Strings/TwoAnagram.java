package Strings;

import java.util.HashMap;

public class TwoAnagram {
    public static void main(String[] args) {
        String  s = "anagram";
        String t = "nagaram";
        System.out.println("The Two String is Anagram or Not is "+isAnagram(s, t));

    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0;i < t.length();i++){
            char ch = t.charAt(i);
            if(!hmap.containsKey(ch)){
                return false;
            }
            if(hmap.get(ch) == 1){
                hmap.remove(ch);
            }else{
                hmap.put(ch, hmap.get(ch) - 1);
            }
        }
        if(hmap.size() != 0){
            return false;
        }
        return true;
        
    }
}
