package RaghuSir.TwoDArray;

import java.util.Arrays;

public class Mat12 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int[] sum = colWiseBiggest(matrix);
        System.out.println("col wise Biggest Element is "+ Arrays.toString(sum));
    }
    public static int[] colWiseBiggest(int[][] mat) {
        int[] sum = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            sum[i] = mat[0][i];
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[j][i] >  sum[i]) sum[i] = mat[j][i];
            }
        }
        return sum;
    }
}
