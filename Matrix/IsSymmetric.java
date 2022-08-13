package Matrix;
public class IsSymmetric{
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{2,4,5},{3,5,8}};
        boolean flag = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] != matrix[j][i]){
                    flag = false;
                }
                if(flag == false){
                    break;
                }
            }
            if(flag == false){
                break;
            }
        }
        if(flag == true){
            System.out.println("Matrix is Symmetric");
        }else{
            System.out.println("Matrix is Not Symmetric");
        }
    }
}