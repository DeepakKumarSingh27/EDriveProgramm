package RaghuSir.TwoDArray;

public class Mat14 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int[][] sum = rowWiseReverse(matrix);
        System.out.println("Row wise Reverse matrix is ");
        ao.printMatrix(sum);
    }

    public static int[][] rowWiseReverse(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int f = 0, l = mat[i].length - 1;
            while (f < l) {
                int temp = mat[i][f];
                mat[i][f] = mat[i][l];
                mat[i][l] = temp;
                f++;
                l--;
            }
        }
        return mat;
    }
}
