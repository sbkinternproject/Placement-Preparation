package Arrays;

public class GivenSumPairInRotatedArray {
    public static void main(String[] args) {
        int arr[] = 
        // {1,2,3,4}
        // {11, 15, 26, 38, 9, 10}
        {11, 15, 6, 8, 9, 10}
        ;// 5 / 2 = 2 
        int X = 16;
        int index = index(arr);
        System.out.println("The Pivot index is "+index);

        // System.out.println("The Element is ");

        System.out.println("The Given Pair Whose Sum is Equal "+isPairExist(arr, X, index));

    }
    public static boolean isPairExist(int[] arr, int X, int index){
        int low = index;
        int high = -1;
        if(index == 0){
            high = arr.length - 1;
        }else{
            high = index - 1;
        }
        System.out.println("The Low and High is "+low+" and "+high);
        
        while (low != high){
            if(arr[low] + arr[high] == X){
                return true;
            }
            if(arr[low] + arr[high] < X ){
                low = (low + 1) % arr.length;
            }else{
                high = (arr.length + high - 1) % arr.length;
            }
        }

        return false;
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
        
        return 0;
    }
}
