package RaghuSir.TwoDArray;

public class Mat15 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int[][] sum = colWiseReverse(matrix);
        System.out.println("col wise Reverse matrix is ");
        ao.printMatrix(sum);
    }

    public static int[][] colWiseReverse(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int f = 0, l = mat[i].length - 1;
            while (f < l) {
                int temp = mat[f][i];
                mat[f][i] = mat[l][i];
                mat[l][i] = temp;
                f++;
                l--;
            }
        }
        return mat;
    }
}
