package Arrays;

public class MinimumNoOfMerge {
    public static void main(String[] args) {
        int arr[] = {11, 14, 15, 99};
        int low = 0;
        int high = arr.length - 1;
        int merge = 0;
        while (low <= high) {
            if (arr[low] == arr[high]) {
                low++;
                high--;
            } else if (arr[low] < arr[high]) {
                low++;
                arr[low] = arr[low] + arr[low - 1];
                merge++;
            } else {
                high--;
                arr[high] += arr[high + 1];
                merge++;
            }
        }
        System.out.println("Number of Merge is " + merge);
    }
}
