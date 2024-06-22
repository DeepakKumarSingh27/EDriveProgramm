package RaghuSir.TwoDArray;

public class Mat16 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int[] dsum = diganolWiseSum(matrix);
        System.out.println("Primary Diganol sum is " + dsum[0]);
        System.out.println("Secondary diganol is "+dsum[1]);
    }

    public static int[] diganolWiseSum(int[][] mat) {
        int psum = 0, ssum = 0;
        for (int i = 0; i < mat.length; i++) {
            psum += mat[i][i];
            ssum += mat[i][mat.length - 1 - i];
        }
        return new int[]{psum, ssum};
    }
}
