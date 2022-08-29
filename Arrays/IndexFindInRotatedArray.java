package Arrays;

public class IndexFindInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4}
        // {11, 15, 26, 38, 9, 10}
        // {11, 15, 6, 8, 9, 10}
        ;// 5 / 2 = 2 
        System.out.println("The Index of the Array is : "+ index(arr));
    }
    public static int index(int[] arr){
        int low = 0;
        int high = arr.length - 1;


        if(arr[high] >= arr[low]){
            return 0;
        }

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > arr[mid+1]){
                return mid+1;
            }else if(arr[mid] < arr[mid-1] ){
                return mid;
            }else if(arr[mid] >= arr[low]){
                low = mid + 1;
            }else if(arr[mid] <= arr[high]){
                high = mid - 1;
            }
        }
        
        return -1;
    }
   
}
