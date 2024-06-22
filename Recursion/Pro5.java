package RaghuSir.Recursion;

public class Pro5 {
    public static void main(String[] args) {
        int n = 5,sum = 0;
        System.out.println(sumOfNat(n,sum));
        System.out.println(sumOfN(10));
    }
    public static int sumOfNat(int i,int sum) {
        if (i < 1) {
           // System.out.println(sum);
            return sum;
        }
      return sumOfNat(i - 1,sum + i);
    }
    public static int sumOfN(int n) {
        if (n == 0) return n;
        return n + sumOfN(n - 1);
    }
}
