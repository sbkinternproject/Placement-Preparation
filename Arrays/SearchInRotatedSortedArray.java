package Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println("The Target Value is present in index "+search(arr,0));
    }
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(high >= low){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] >= nums[low]){
                if(target < nums[mid] && nums[low] <= target){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else if(nums[mid] <= nums[high]){
                if(target > nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
