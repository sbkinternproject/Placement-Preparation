package Arrays;

public class ProductOfArrayExecptItSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] leftMultiply = new int[nums.length];
        int[] rightMultiply = new int[nums.length];
        int max = 1;
        for(int i = 0 ;i < nums.length;i++){
            max = max * nums[i];
            leftMultiply[i] = max;
        }
        max = 1;
        for(int i = nums.length - 1 ;i > 0;i--){
            max = max * nums[i];
            rightMultiply[i] = max;
        }
        for(int i = 0; i < nums.length;i++){
            System.out.print(leftMultiply[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < nums.length;i++){
            System.out.print(rightMultiply[i]+" ");
        }
        System.out.println();
        int[] answer = new int[nums.length];
        answer[0] = rightMultiply[1];
        for(int i = 1; i < nums.length - 1;i++){
            answer[i] = leftMultiply[i -1] * rightMultiply[i+1];
        }
        answer[nums.length - 1] = leftMultiply[nums.length - 2];
        for(int i = 0; i < nums.length;i++){
            System.out.print(answer[i]+" ");
        }
        System.out.println();
    }
}
