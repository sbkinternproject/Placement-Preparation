package Matrix;

public class AntiDaigonalTraversal {
    public static void main(String[] args) {
        /*
         * Input
         * [[1, 2, 3],
            [4, 5, 6],
            [7, 8, 9]]
            Output: 
            1 2 4 3 5 7 6 8 9
         */
        int[][] matrix = new int[][]{
            {1,2,3},{4,5,6},{7,8,9}
        };
        printMatrix(matrix);
        System.out.println("Expected Ouput is : 1 2 4 3 5 7 6 8 9");
        printAntidaigonalMatrix(matrix);

    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Index is "+i+" and "+j+" Value is "+matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    // (0,0) 
    // (0,1) (1,0) 
    // (0,2) (1,1) (2,0) 
    // (1,2) (2,1) 
    // (2,2)
    public static void printAntidaigonalMatrix(int[][] matrix){
        int n = matrix.length;
        for(int i = 0;i < n;i++){
            int z = i;
            int m = 0;
            for(int j = 0;j < n;j++){
                System.out.print(matrix[m][z]+"\t");
                m++;
                z--;
                if(z < 0){
                    break;
                }
            }
            System.out.println();
        }
        // (1,2) (2,1) 
        // (2,2)
        for (int i = 0; i < matrix.length - 1; i++) {
            int m = matrix.length - 1;
            int z = i+1;
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[z][m]+"\t");
                m--;
                z++;
                if(z >= n){
                    break;
                }
               
            }
            System.out.println();
        }
    }
}
