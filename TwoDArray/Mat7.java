package RaghuSir.TwoDArray;

public class Mat7 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int[][] tr = isTranspose(matrix);
        System.out.println("Transpose of matrix is ");
        ao.printMatrix(tr);
    }
    public static int[][] isTranspose(int[][] mat) {
        int[][] tr = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                tr[i][j] = mat[j][i];
            }
        }
        return tr;
    }
}
