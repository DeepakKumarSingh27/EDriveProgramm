package RaghuSir.TwoDArray;
public class Mat4 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        System.out.println("prime number present in the matrix is "+isPrimeCount(matrix));
    }
    public static boolean isPrime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)  return false;
        }
        return true;
    }
    public static int isPrimeCount(int[][] mat) {
        int count  = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length ; j++) {
                boolean rs = isPrime(mat[i][j]);
                if (rs) count++;
            }
        }
        return count;
    }
}
