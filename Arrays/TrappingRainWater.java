package Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] leftMaxHeight = new int[height.length];
        int[] rightMaxHeight = new int[height.length];
        Integer max = Integer.MIN_VALUE;
        for(int i = 0; i < height.length;i++){
            if(height[i] > max){
                max = height[i];
            }
            leftMaxHeight[i] = max;
        }
        max = Integer.MIN_VALUE;
        for(int i = height.length -1; i >= 0;i--){
            if(height[i] > max){
                max = height[i];
            }
            rightMaxHeight[i] = max;
        }
        // for(int i = 0 ;i < height.length;i++){
        //     System.out.print(leftMaxHeight[i]+" ");
        // }
        // System.out.println();
        // for(int i = 0 ;i < height.length;i++){
        //     System.out.print(rightMaxHeight[i]+" ");
        // }
        // System.out.println();
        int answer = 0;
        for(int i = 1; i < height.length - 1;i++){
            if(height[i] < leftMaxHeight[i] && rightMaxHeight[i] > height[i]){
                if(leftMaxHeight[i] > rightMaxHeight[i]){
                    answer += (rightMaxHeight[i] - height[i]);
                }else{
                    answer += (leftMaxHeight[i] - height[i]);
                }
            }
        }
        System.out.println("Answer is "+answer);
    }
}
