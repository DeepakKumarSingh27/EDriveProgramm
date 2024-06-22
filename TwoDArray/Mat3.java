package RaghuSir.TwoDArray;

public class Mat3 {
    public static void main(String[] args) {
       ArrayOperation ao = new ArrayOperation();
       int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int sum = sumOfMatrixEle(matrix);
        System.out.println("sum of Matrix element is "+sum);
    }
    public static int sumOfMatrixEle(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
}
