package BitsManipulation;

import java.util.Map;
import java.util.TreeMap;

public class NonRepeatingNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,4,5};
        TreeMap<Integer, Integer> hmap = new TreeMap<Integer, Integer>();
        for(int i = 0;i < nums.length;i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            }else{
                hmap.put(nums[i] , 1);
            }
        }
        // System.out.println(hmap);
        for (Map.Entry<Integer, Integer> set : hmap.entrySet()) {
            if(set.getValue() == 1){
                System.out.print(set.getKey() +" ");
                // nums[count] = set.getKey();
            }
        }
        System.out.println();
    }
}
