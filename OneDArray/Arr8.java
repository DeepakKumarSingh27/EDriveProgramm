package RaghuSir.OneDArray;

public class Arr8 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[] x = ao.readArray();
        System.out.println("Prime Number present in Array element is " + countPrimeArray(x));
    }

    public static int countPrimeArray(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            boolean rs = isPrime(x[i]);
            if (rs) {
                count++;
            }
        }
        return count;

    }

    public static boolean isPrime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
