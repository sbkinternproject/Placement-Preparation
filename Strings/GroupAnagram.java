package Strings;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};;
        System.out.println("The Group Anagrams are: "+groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bmap = new HashMap<>();
        for(String str: strs){
            HashMap<Character, Integer> fmap = new HashMap<>();
            for(int i = 0; i < str.length();i++){
                char ch = str.charAt(i);
                fmap.put(ch, fmap.getOrDefault(ch, 0 ) + 1);
            }
            if(bmap.containsKey(fmap) == false ){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                bmap.put(fmap, list);
            }else{
                ArrayList<String> list = bmap.get(fmap);
                list.add(str);
                bmap.put(fmap, list);
            }
        }
        List<List<String>> answer = new ArrayList<>();
        for(ArrayList<String> list : bmap.values()){
            answer.add(list);
        }
        return answer;
    }
}
