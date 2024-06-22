package RaghuSir.TwoDArray;

public class Mat6 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int[][] sum = sumOfMatrixDigits(matrix);
        System.out.println("sum of matrix digits element is");
        ao.printMatrix(sum);
    }

    public static int[][] sumOfMatrixDigits(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                 int sum = 0;
                do {
                    int r = mat[i][j] % 10;
                    sum += r;
                    mat[i][j] /= 10;
                } while (mat[i][j] != 0);
                mat[i][j] = sum;
            }
        }
        return mat;
    }
}
