package Arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {3,-1,4};
        Integer answer = Integer.MIN_VALUE;
        int maxSoFar = 1;
        for(int i = 0;i < nums.length;i++){
            maxSoFar = maxSoFar * nums[i];
            if(maxSoFar > answer){
                answer = maxSoFar;
            }
            if(maxSoFar == 0){
                maxSoFar = 1;
            }
        }
        maxSoFar = 1;
        for(int i = nums.length - 1;i >= 0;i--){
            maxSoFar = maxSoFar * nums[i];
            if(maxSoFar > answer){
                answer = maxSoFar;
            }
            if(maxSoFar == 0){
                maxSoFar = 1;
            }
        }
        System.out.println("Answer is "+answer);
    }
}
