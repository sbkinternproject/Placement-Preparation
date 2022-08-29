package Arrays;

public class ContainerWithMaxWater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println("The Area of Container with Max Water is "+maxArea(height));
    }
    public static int maxArea(int[] height) {
        int low = 0;//i
        int high = height.length - 1;//j
        int area = 0;
        while(low < high){
            int hgt = Math.min(height[low] , height[high]);
            int width = high - low;
            int temp = hgt * width;
            if(temp > area){
                area = temp;
            }
            if(height[low] == height[high]){
                low++;
            }else if(height[low] > height[high]){
                high--;
            }else {
                low++;
            }
        }
        return area;
    }
}
