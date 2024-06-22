package RaghuSir.TwoDArray;

public class Mat18 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        printSpiral(matrix);
    }

    public static void printSpiral(int[][] mat) {
        for (int i = 0, j = mat.length - 1; i < j; i++, j--) {
            for (int k = i; k < j; k++) {
                System.out.print(mat[i][k] + " ");
            }
            for (int k = i; k < j; k++) {
                System.out.print(mat[k][j] + " ");
            }
            for (int k = j; k > i; k--) {
                System.out.print(mat[j][k] + " ");
            }
            for (int k = j; k > i; k--) {
                System.out.print(mat[k][i] + " ");
            }
            if (mat.length % 2 == 1)
                System.out.print(mat[mat.length / 2][mat.length / 2]);
        }
    }
}
