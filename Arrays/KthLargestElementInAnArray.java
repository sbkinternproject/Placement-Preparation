package Arrays;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        Integer nums[] = { 3,2,1,5,6,4};
        // Integer[] nums = {99,99};
        Integer k = 2;
        
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        for(Integer i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            k = k - entry.getValue();//1
            if(k <= 0){
                // return entry.getKey();
                System.out.println("Kth Largest Element in an Array is: "+entry.getKey());
            }
        }
    }
}
