package RaghuSir.TwoDArray;

public class Mat8 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        System.out.println("Enter first matrix");
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        System.out.println("Enter second matrix");
        int[][] matrix1 = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix1);
        int[][] mat = addMatrix(matrix,matrix1);
        System.out.println("New Matrix is ");
        ao.printMatrix(mat);
    }

    public static int[][] addMatrix(int[][] matrix, int[][] matrix1) {
        if (matrix.length != matrix1.length || matrix[0].length != matrix1[0].length)
            return null;
        int[][] mat = new int[matrix.length][matrix1.length];
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = matrix[i][j] + matrix1[i][j];
            }
        }
        return mat;
    }
}
