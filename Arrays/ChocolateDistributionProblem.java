package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistributionProblem {
    /*
        Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
        Output: Minimum Difference is 2 
        Explanation:
        We have seven packets of chocolates and 
        we need to pick three packets for 3 students 
        If we pick 2, 3 and 4, we get the minimum 
        difference between maximum and minimum packet 
        sizes.

        [2,3,4,7,9,12,56]
        arr[m-1] - arr[0] = Answer
        {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
        1,2,3,4,7,9,9,12,56
        arr[m-1] - arr[0] = 7 -1 = 6
        {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44,48,43, 50} m = 7 

        2,4,7,9,12,23,25,28,30,30,40,41,42,43,44,48,50
        23 = Answer
    */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(
            Arrays.asList(12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44,48,43, 50)
        );
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Integer m = 7;
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - m + 1; i++) {
            Integer temp = list.get(m + i - 1) - list.get(i);
            if(min > temp){
                min = temp;
            }
        }
        System.out.println("Min is "+min);
    }
}
