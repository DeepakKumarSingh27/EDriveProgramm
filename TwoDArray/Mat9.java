package RaghuSir.TwoDArray;

public class Mat9 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] matrix = ao.readmatrix();
        System.out.println("user entered matrix element is ");
        ao.printMatrix(matrix);
        int[] ct = checkEvenOrOdd(matrix);
        System.out.println("Even is " + ct[0]);
        System.out.println("Odd is " + ct[1]);
    }

    public static int[] checkEvenOrOdd(int[][] mat) {
        int ec = 0, oc = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 2 == 0) ec++;
                else oc++;
            }
        }
        return new int[]{ec, oc};
    }
}
