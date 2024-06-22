package RaghuSir.Recursion;

public class Pro31 {
    public static void main(String[] args) {
        System.out.println(find(22,1));
    }
    public static int find(int dividend,int divisor) {
        if (dividend == divisor) return 1;
        boolean sign = true;
        if (dividend >= 0 && divisor < 0) sign = false;
        else if (dividend <= 0 && divisor > 0) sign = false;
        int n = Math.abs(dividend),d = Math.abs(divisor),quotient = 0;
        divisor = Math.abs(divisor);
        while (n >= d) {
           int cnt = 0;
           while (n >= (d << (cnt + 1))){
               cnt += 1;
           }
            quotient += 1 << cnt;
            n -= (d  << cnt);
        }
        if (quotient == (1<<31) && sign) return Integer.MAX_VALUE;
        if (quotient == (1<<31) && !sign) return Integer.MIN_VALUE;
        return sign ? quotient : (-quotient);
    }
}
