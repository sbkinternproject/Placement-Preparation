package Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        char[] arr = {'G','A','R','I','M','A'};
        //             0   1   2   3   4   5
        for (int i = 0; i < arr.length/2; i++) {
            char temp = arr[i];
            char temp2 = arr[arr.length- 1- i];
            arr[i] = temp2;
            arr[arr.length - 1 -i] = temp;
        }
        // System.out.println("Array is "+arr.toString());
        // for (char c : arr) {
        //     System.out.println(c);
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
