package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaxInAnArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println("The Kth Smallest Element in Array is "+kthSmallest(arr, 0, arr.length, 3));
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        // Max Heap
        for(int i  = 0 ;i < k;i++){
            queue.add(arr[i]);
        }
        for(int i = k; i < arr.length;i++){
            if(arr[i] < queue.peek()){
                queue.poll();
                queue.add(arr[i]);
            }
        }
        // queue.poll();/**/
        return queue.peek();
    }
}
