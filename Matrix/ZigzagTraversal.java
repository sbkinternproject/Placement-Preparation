package Matrix;

import java.util.ArrayList;

public class ZigzagTraversal {
    public static void main(String[] args) {
        // int M[][] = {
        //     { 1, 2, 3, 4 },     { 5, 6, 7, 8 },
        //     { 9, 10, 11, 12 },  { 13, 14, 15, 16 },
        //     { 17, 18, 19, 20 },
        // };
        // printZigZagMatrix(M, 5, 4);
        int M[][]= {{1, 2, 3},
     {4, 5, 6},
     {7, 8, 9}};
        // printMatrix(M, 5, 4);
        
        printZigZagMatrix(M, 3, 3);


        // int A[][] = {{1,2},{3,4}};
        // printZigZagMatrix(A, 2, 2);

    }
    public static void printMatrix(int[][] matrix, int row, int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }
    }
    public static void printZigZagMatrix(int[][] matrix, int row, int column){
        // int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ;i < row;i++){
            int k = i;
            for(int j = 0; j < column;j++){
                
                list.add(matrix[k][j]);
                System.out.print(matrix[k][j]+"\t");
                k--;
                if(k == -1){
                    // System.out.println();
                    break;
                }
            }
            System.out.println();
            
        }
        // System.out.println();
        int m = 1;
        for (int i = 0; i < column -  1; i++) {
            int k = row - 1;//5 - 1 - 0 = 4
            int count = column - 1;
            int z = 0;
            int temp = m;
            for (int j = 1; j < column - i ; j++) {
                
                
                // System.out.println("Value of k and temp is "+ k+" "+temp);
                list.add(matrix[k][temp]);
                System.out.print(matrix[k][temp]+"\t");
                temp++;
                k--;
                z++;
                
                if(count == 0){
                    // System.out.println("hello");
                    break;
                }
            }
            m++;
            System.out.println();
            count--;
        }
        ArrayList<Integer> answer = new ArrayList<>();
        System.out.println(list);
        
    }
   

}
//5 Row 4 Column - Row+column - 1 = 5 + 4 - 1  = 8
/* 
1   (0,0)
5   (1,0)  2 (0,1)
9   (2,0)  6 (1,1) 3    (0,2)
13  (3,0) 10 (2,1) 7    (1,2)   4 (0,3)
17  (4,0) 14 (3,1) 11   (2,2)   8 (1,3)
18  (4,1) 15 (3,2) 12   (2,3)
19  (4,2) 16 (3,3)
20  (4,3)

*/