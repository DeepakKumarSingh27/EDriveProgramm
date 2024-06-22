package RaghuSir.TwoDArray;

import java.util.Scanner;

public class ArrayOperation {
    int[][] readmatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row");
        int row = sc.nextInt();
        System.out.println("Enter the column");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter " + row * col + " values");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
