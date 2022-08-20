package Matrix;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The Expected Output is 1,2,3,6,9,8,7,4,5");
        System.out.println();
        printMatrix(matrix, matrix.length, matrix[0].length);
        spiralMatrix(matrix,  matrix.length, matrix[0].length);
    }
    public static void printMatrix(int[][] matrix, int row, int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] +"\t"+"("+i+","+j+")\t");
            }
            System.out.println();
        }
    }
    public static void spiralMatrix(int[][] matrix, int row, int column){
        int top = 0;
        int down = row - 1;
        int left = 0;
        int right = column - 1;
        int dir = 0;
        // 0 --> Left to Right
        // 1 --> Top to Down
        // 2 --> Right to Left 
        // 3 --> Down to Top
        while(top <=down && left <= right){
            if(dir == 0){
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] +" ");
                }
                top++;
            }else if(dir == 1){
                for (int i = top; i <= down; i++) {
                    System.out.print(matrix[i][right]+" ");
                }
                right--;
            }else if(dir == 2){
                for (int i = right; i >=left; i--) {
                    System.out.print(matrix[down][i]+" ");
                }
                down--;
            }else if(dir == 3){
                for (int i = down; i >=top; i--) {
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }
            dir = (dir+1) % 4;
        }
    }
}
/*


*/