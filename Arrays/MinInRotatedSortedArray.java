package Arrays;

public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1};
        System.out.println("The Minimum in Rotated Sorted Array "+findMin(arr,0,arr.length-1));
    }
    public static int findMin(int[] arr, int low, int high){
        
        
        //Sorted Case
        if(arr[high] >= arr[low]){
            return arr[0];
        }
        
        
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > arr[mid+1]){
                return arr[mid+1];
            }else if(arr[mid] < arr[mid-1] ){
                return arr[mid];
            }else if(arr[mid] >= arr[low]){
                low = mid + 1;
            }else if(arr[mid] <= arr[high]){
                high = mid - 1;
            }
        }
        return -1;
    }
}
