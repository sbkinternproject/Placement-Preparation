package Arrays;

import java.util.ArrayList;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibriumIndices(arr));
    }
    public static ArrayList<Integer> findEquilibriumIndices(int[] sequence) {
        // Write your code here.
        int[] sum1 = new  int[sequence.length];
        int[] sum2 = new  int[sequence.length];
        int temp1 = 0;
        int temp2 = 0;
        for(int i = 0; i < sequence.length;i++){
            temp1 += sequence[i];
            temp2 += sequence[sequence.length - 1 -i];
            sum1[i] = temp1;
            sum2[sequence.length - 1 -i] = temp2;
        }
        for(int i = 0;i < sequence.length;i++){
            System.out.println("Values in Array 1 : "+sum1[i]);
        }
        
        for(int i = 0;i < sequence.length;i++){
            System.out.println("Values in Array 2 : "+sum2[i]);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < sequence.length;i++){
            if(sum1[i] == sum2[i]){
                list.add(i);
            }
        }
        return list;
    }
}
