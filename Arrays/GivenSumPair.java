package Arrays;

import java.util.Arrays;

public class GivenSumPair {
    public static void main(String[] args) {
        int[] arr = { 11, 15, 6, 8, 9, 10 };
        int X = 45;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        int low = 0;
        int high = arr.length - 1;
        boolean flag = false;
        while (low < high) {
            int sum = arr[low] + arr[high];
            if(sum == X){
                // System.out.println("There Exists an Pair whose sum is "+X);
                flag = true;
                break;
            }else if(sum > X){
                high--;
            }else if(sum < X){
                low++;
            }
        }
        if(flag){
            System.out.println("There Exists an Pair whose sum is "+X);
        }else{
            System.out.println("There is no Pair Exists");
        }
    }

}
