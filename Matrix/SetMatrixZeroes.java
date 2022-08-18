package Matrix;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        // int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        printMatrix(matrix, matrix.length, matrix[0].length);
        makeZeroesMatrix1(matrix, matrix.length, matrix[0].length);
        System.out.println();
        printMatrix(matrix, matrix.length, matrix[0].length);
        
    }
    public static void makeZeroesMatrix(int[][] matrix,  int row, int column){
        int[] rowMatrix = new int[row];
        int[] columnMatrix = new int[column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j] == 0){
                    rowMatrix[i] = -1;
                    columnMatrix[j] = -1;
                }
            }
        }
        printArray(rowMatrix);
        printArray(columnMatrix);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                // if(matrix[i][j] == 0){
                //     rowMatrix[i] = -1;
                //     columnMatrix[j] = -1;
                // }
                if(rowMatrix[i] == -1 || columnMatrix[j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void printMatrix(int[][] matrix, int row, int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void makeZeroesMatrix1(int[][] matrix,  int row, int column){
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j] == 0){
                    matrix[i][0] = -1;
                    matrix[0][j] = -1;
                }
            }
        }
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < column; j++) {
        //         // if(matrix[i][j] == 0){
        //         //     rowMatrix[i] = -1;
        //         //     columnMatrix[j] = -1;
        //         // }
        //         if(matrix[i][0] == -1 || matrix[0][j] == -1){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
    }
}
