package RaghuSir.TwoDArray;

public class Mat17 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int[][] lrotate = left90Rotate(matrix);
        System.out.println("After 90 degree left rotate matrix is ");
        ao.printMatrix(lrotate);
        int[][] rrotate = right90Rotate(matrix);
        System.out.println("After 90 degree right rotate matrix is ");
        ao.printMatrix(rrotate);
    }

    public static int[][] left90Rotate(int[][] mat) {
    mat =  transpose(mat);
    mat = rowWiseReverse(mat);
    return mat;
    }
    public static int[][] right90Rotate(int[][] mat) {
        mat = transpose(mat);
        mat = colWiseReverse(mat);
        return  mat;
    }
    public static int[][] transpose(int[][] mat) {
        int[][] tr = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                tr[j][i] = mat[i][j];
            }
        }
        return tr;
    }
    public static int[][] rowWiseReverse(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int start = 0 , end = mat.length - 1;
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
        return mat;
    }
    public static int[][] colWiseReverse(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int start = 0 , end = mat.length - 1;
            while (start < end) {
                int temp = mat[end][i];
                mat[end][i] = mat[start][i];
                mat[start][i] = temp;
                start++;
                end--;
            }
        }
        return mat;
    }
}
