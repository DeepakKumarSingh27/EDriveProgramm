package RaghuSir.TwoDArray;

public class Mat5 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        System.out.println("smallest element in matrix is " +isSmall(matrix));
    }
    public static int isSmall(int[][] mat) {
        int small = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < small) small = mat[i][j];
            }
        }
        return small;
    }
}
