package Arrays;

import java.util.Arrays;

public class LargestNumberFormed {
    public static void main(String[] args) {
        String[] arr =  {"3", "30", "34", "5", "9"};
        System.out.println("The Largest Number is "+printLargest(arr));
    }
    public static String printLargest(String[] arr) {
        // code here
        Arrays.sort(arr, (a, b) -> (a + b ).compareTo(b + a));
        StringBuilder sd = new StringBuilder("");
        for(int i = arr.length - 1; i >= 0;i--){
            // System.out.println(arr[i] +" ");
            sd.append(arr[i]);
        }
        if(arr[0].equals("0")) {
            return "0";
        }
        return sd.toString();
    }
}
