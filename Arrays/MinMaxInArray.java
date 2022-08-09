package Arrays;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {9,15,71,108,7};
        int min = arr[0];
        int max = arr[0];
        for(int i =1;i< arr.length;i++){
            int temp = arr[i];
            if(min > temp){
                min = temp;
            }
            if(max < temp){
                max = temp;
            }
        }
        System.out.println("Min "+min+" and Max "+max);
    }
}
