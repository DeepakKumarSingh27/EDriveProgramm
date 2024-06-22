package RaghuSir.TwoDArray;

import java.util.Arrays;

public class Mat13 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int[] sum = colWisesum(matrix);
        System.out.println(" col wise sum of Matrix element is "+ Arrays.toString(sum));
    }
    public static int[] colWisesum(int[][] mat) {
        int[] sum = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum[i] += mat[j][i];
            }
        }
        return sum;
    }
}
