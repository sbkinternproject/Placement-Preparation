package Arrays;

import java.util.TreeSet;

public class NextPermutation {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(1);
        set.add(3);
        set.add(2);
        System.out.println(set.toString());
        // {1, 2, 3, 6, 5, 4}
        // {1, 2, 4, 3, 5, 6}
        // {3, 2, 1}
        // {1, 2, 3}
        Integer[] arr = {1,2,3,6,5,4,4};//13542 -->14235
        // Integer[] arr = {3,2,1};
        // Integer[] arr = {1,1,5};
        Integer index = -1;
        // Finding the Index which is larger than previous ones in opposite direction
        for(int i = arr.length - 1; i > 0;i--){
            if(arr[i] > arr[i - 1]){
                index = i - 1;
                break;
            }
        }

        if(index == -1){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[arr.length - i -1]);
            }
        }else{
            //Now Swapping the Number with Larger value
            Integer indexWithSwapped = index;
            for (int i = arr.length - 1; i > index; i--) {
                if(arr[i] > arr[index]){
                    indexWithSwapped = i;
                    break;
                }
            }
            System.out.println("Index with swapped is "+indexWithSwapped);
            // Now the elements present in the two indexes
            Integer temp = arr[index];
            arr[index] = arr[indexWithSwapped];
            arr[indexWithSwapped] = temp;
            System.out.println((indexWithSwapped + index) / 2);
            // for (int i = index + 1; i < arr.length/2; i++) {
            //     Integer temp1 = arr[i];
            //     arr[i] = arr[arr.length - i];
            //     arr[arr.length - i] = temp1;
            // }                            6 - 2 - 1 = 3 /2 = 1 + 2
            for (int i = index + 1, j = 0; i <= (arr.length - index - 1)/2 + index; i++, j++) {
                System.out.println("Value of Index is "+i+" and "+(arr.length - j - 1)+"");
                Integer temp1 = arr[i];
                arr[i] = arr[arr.length - j-1];
                arr[arr.length - j-1] = temp1;
            }
        }
        System.out.println("The Array Looks Like Now ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nIndex is "+index);
        
    }
}
