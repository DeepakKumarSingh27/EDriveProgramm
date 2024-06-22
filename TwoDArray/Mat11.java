package RaghuSir.TwoDArray;

import java.util.Arrays;

public class Mat11 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int[] sum = rowWiseBiggest(matrix);
        System.out.println("Row wise Biggest Element is "+ Arrays.toString(sum));
    }
    public static int[] rowWiseBiggest(int[][] mat) {
        int[] sum = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            sum[i] = mat[i][0];
            for (int j = 0; j < mat[i].length; j++) {
               if (mat[i][j] >  sum[i]) sum[i] = mat[i][j];
            }
        }
        return sum;
    }
}
