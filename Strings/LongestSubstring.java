package Strings;
import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = 
        // ""
        // " "
        "asjrgapa"
        // "au"
        // "dvdf"
        // "abcabcbb"
        // "bbbbb"
        // "pwwkew"
        ;
        System.out.println("The Length of Longest Substring is "+lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        // if(s.length() == 1){
        //     return s.length();
        // }
//         HashSet<Character> set  =  new HashSet<>();
        
//         int max = 0;
//         int count = 0;
        
//         for(int i = 0 ;i  < s.length();i++){
            
//             if(set.contains(s.charAt(i))){
//                 if(count > max){
//                     max = count;
//                 }
//                 set.clear();
//                 count = 0;
//             }
//             set.add(s.charAt(i));
            
//             count++; 
//             if(count > max){
//                     max = count;
//                 }
//         }
//         set.clear();
//         count = 0;
//         for(int i = s.length() - 1 ;i  >= 0;i--){
            
//             if(set.contains(s.charAt(i))){
//                 if(count > max){
//                     max = count;
//                 }
//                 set.clear();
//                 count = 0;
//             }
//             set.add(s.charAt(i));
            
//             count++; 
//             if(count > max){
//                     max = count;
//                 }
//         }
//         return max;
        //s =  "asjrgapa"
        int i = -1;
        int ans = 0;
        int j = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        while(true){
            boolean b1 = false;
            boolean b2 = false;
            while(i < s.length() - 1){
                b1 = true;
                i++;
                char ch = s.charAt(i);
                map.put(ch,  map.getOrDefault(ch, 0) + 1);
                if(map.get(ch) == 2){
                    break;
                }else{
                    int len = i - j;
                    if(len > ans){
                        ans = len;
                    }
                }
            }
            while(j < i){
                b2 = true;
                j++;
                char ch = s.charAt(j);
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 1){
                    break;
                }
            }
            if(b1 == false && b2 == false){
                break;
            }
        }
        return ans;
        
    }
}
