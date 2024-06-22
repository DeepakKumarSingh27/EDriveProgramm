package RaghuSir.TwoDArray;

import java.util.Scanner;

public class Mat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Row");
        int row  = sc.nextInt();
        System.out.println("Enter the Column");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter "+row * col+" elements");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("user entered matrix is ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
