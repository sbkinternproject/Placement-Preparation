package Arrays;

import java.util.ArrayList;


public class MaxSubarray{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // [-2,1,-3,4,-1,2,1,-5,4]
        // arr.add(-2);
        // arr.add(1);
        // arr.add(-3);
        // arr.add(4);
        // arr.add(-1);
        // arr.add(2);
        // arr.add(1);
        // arr.add(-5);
        // arr.add(4);
        // [5,4,-1,7,8]
        arr.add(5);
        arr.add(4);
        arr.add(-1);
        arr.add(7);
        arr.add(8);
        System.out.println(arr);
        Integer maxSum = Integer.MIN_VALUE;
        Integer currentSum = 0;
        for(Integer i = 0;i < arr.size();i++){
            currentSum = currentSum + arr.get(i);
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        System.out.println("Max Subaaray Sum is "+maxSum);
    }
}