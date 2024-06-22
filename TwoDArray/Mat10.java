package RaghuSir.TwoDArray;

import java.util.Arrays;

public class Mat10 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int[] sum = rowWisesum(matrix);
        System.out.println(" Row wise sum of Matrix element is "+ Arrays.toString(sum));
    }
    public static int[] rowWisesum(int[][] mat) {
        int[] sum = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
               sum[i] += mat[i][j];
            }
        }
        return sum;
    }
}
