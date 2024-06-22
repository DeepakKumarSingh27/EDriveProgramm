package RaghuSir.TwoDArray;

public class Mat2 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(mat);
        int big = isBiggest(mat);
        System.out.println("Biggest element is " + big);
    }
    public static int isBiggest(int[][] matrix) {
        int big = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > big)
                    big = matrix[i][j];
            }
        }
        return big;
    }
}
